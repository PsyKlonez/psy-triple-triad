//
// Class used to hold and interact with Cards within a given players hands.
//
package psytripletriad;

import javax.swing.ImageIcon;

/**
 *
 * @author PsY
 */
public class CardHand {

    // Array of Cards in the players hand.

    Card[] hand;
    // Card currently selected by the user.
    Card curSelected;
    // Boolean as to if a card has been selected from the hand.
    boolean selectionMade;

    boolean[] isUsedArray;

    // Constructor.
    public CardHand() {
        // Crate new Array that can hold 5 Cards.
        this.hand = new Card[5];
        isUsedArray = new boolean[5];
        this.selectionMade = false;
    }

    // Replace hand with provided one.
    public void setHand(Card[] hand) {
        this.hand = hand;
    }

    // Return the Card at the given index in players hand.
    public Card getCardAt(int index) {
        return hand[index];
    }

    // Set the currently selected card to the one at given index.
    public void selectCard(int index) {
        // Set selected card.
        this.curSelected = hand[index];
        // Set selection made to true.
        this.selectionMade = true;
    }

    // Unselect whatever card was previously selected.
    public void unselectCard() {
        // Set selected card to null.
        this.curSelected = null;
        // Set selection made to false.
        this.selectionMade = false;
    }

    // Returns the boolean value of whether a selection has been made.
    public boolean selectionMade() {
        return selectionMade;
    }
    
    public Card getCurSelected() {
        return curSelected;
    }

    public void setCardUsedAt(int index) {
        //hand[index].setIsUsed(true);
        isUsedArray[index] = true;
    }

    public boolean[] getIsUsedArray() {
        return isUsedArray;
    }

    public ImageIcon[] getHandImages() {
        ImageIcon[] iconArray = new ImageIcon[5];
        for (int i = 0; i < hand.length; i++) {
            iconArray[i] = hand[i].getImage();
        }
        return iconArray;
    }
    

    public int getNumberUsed() {
        int numberUsed = 0;
        for (Card card : hand) {
            if (card.isUsed()) {
                numberUsed++;
            }
        }
        return numberUsed;
    }
}
