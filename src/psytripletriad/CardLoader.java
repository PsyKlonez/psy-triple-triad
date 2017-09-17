/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psytripletriad;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author PsY
 */
public class CardLoader {

    // Setup ArrayList to hold all of the loaded Cards.

    private ArrayList<Card> cardList;
    // File path for the file of Card details.
    private static final String cardPath = "src/cards/TripleCards.txt";

    // Constructor.
    public CardLoader() {
        cardList = new ArrayList<Card>();
        readCards();
    }

    // Returns an array of 5 random Cards from those loaded.
    public Card[] getRandomHand() {
        // Initilize random number generator.
        Random rd = new Random();
        Card[] randomHand = new Card[5];
        // Randomly select 5 Cards from the list and add to the Array.
        for (int i = 0; i < 5; i++) {
            randomHand[i] = (Card) cardList.get(rd.nextInt(
                    cardList.size())).clone();
        }
        return randomHand;
    }

    private void readCards() {
        // Create a scanner that uses the Card details file as a resource.
        Scanner scan = new Scanner(getClass().getResourceAsStream(
                "/cards/TripleCards.txt"));
        // Apply delimiter to split each line at ',' 
        scan.useDelimiter(",");
        // Loop through the Card detail list until the end is reached.
        while (scan.hasNext()) {
            // Get the name variable from the line that has been read.
            String name = scan.next();
            // Remove any escape characters within the name.
            name = name.replaceAll("\\r\\n|\\r|\\n", "");
            // Assign the ranks of the card depending on the read details.
            int u = scan.nextInt();
            int d = scan.nextInt();
            int r = scan.nextInt();
            int l = scan.nextInt();
            // Assign element to the Card.
            String element = scan.next();
            // Retrieve image associated with the Card Name.
            ImageIcon image = getImage(name);
            // Create the Card using the details retrieved from file.
            Card card = new Card(name, u, d, r, l, element,
                    image);
            // Add the card to the cardList.
            cardList.add(card);
            // Print the cards that are loaded in the output.
            System.out.println(card.getName() + " : Loaded!");
        }
    }

    // Returns the ImageIcon associated with the Name of the Card.
    private ImageIcon getImage(String name) {
        // Specify the path of the Image of the given Card.
        URL imgURL = getClass().getResource("/cardimages/" + name + ".png");
        // Create ImageIcon using the given image path.
        ImageIcon image = new ImageIcon(imgURL);
        return image;
    }
}
