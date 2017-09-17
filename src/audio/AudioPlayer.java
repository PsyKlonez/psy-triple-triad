package audio;

import java.io.*;
import javax.sound.midi.*;

/**
 *
 * @author PsY
 */
public class AudioPlayer {

    private Sequencer seq;
    // Path to the MIDI file within the project.
    private final String PATH = "/audio/ShuffleOrBoogie.mid";
    private InputStream stream;

    // Contructor.
    public AudioPlayer() {
        setup();
    }

    // Setup the sequencer to play the given MIDI file.
    private void setup() {
        try {
            // Setup new MIDI Sequencer.
            seq = MidiSystem.getSequencer();
            // Open up the device.
            seq.open();
            // Get MIDI music resource as a stream.
            stream = new BufferedInputStream(
                    getClass().getResourceAsStream(PATH));
            // Set sequencer to run the opened stream
            seq.setSequence(stream);
            // Setup to loop.
            seq.setLoopCount(1000);
        } catch (MidiUnavailableException ex) {
            System.out.println("Unable to open MIDI sequencer.");
        } catch (IOException ex) {
            System.out.println("IO Exception.");
        } catch (InvalidMidiDataException ex) {
            System.out.println("Invalid MIDI file.");
        }
    }

    // Start the MIDI music playing.
    public void start() {
        seq.start();
    }

    // Stop the MIDI music playing.
    public void stop() {
        seq.stop();
    }
}
