/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psytripletriad;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author PsY
 */
public class Card implements Cloneable{
    // Variables to hold the cards information (Name, Rank, Element).
    private String name;
    private int upVal;
    private int downVal;
    private int rightVal;
    private int leftVal;
    private String element;
    // Image of the card face.
    private ImageIcon image;
    // Boolean value whether the card has been played.
    private boolean isUsed;

    // Constructor for the Card.
    public Card(String name, int u, int d, int r, int l, String element,
            ImageIcon image) {
        this.name = name;
        this.upVal = u;
        this.downVal = d;
        this.rightVal = r;
        this.leftVal = l;
        this.element = element;
        this.image = image;
        this.isUsed = false;
    }
    
    // Return name of the Card.
    public String getName() {
        return name;
    }

    // Set name of the Card.
    public void setName(String name) {
        this.name = name;
    }

    // Get the Up rank value of Card.
    public int getUpVal() {
        return upVal;
    }

    // Set the Up rank value of Card.
    public void setUpVal(int upVal) {
        this.upVal = upVal;
    }

    // Get the Down rank value of Card.
    public int getDownVal() {
        return downVal;
    }

    // Set the Down rank value of Card.
    public void setDownVal(int downVal) {
        this.downVal = downVal;
    }

    // Get the Right rank value of Card.
    public int getRightVal() {
        return rightVal;
    }

    // Set the Right rank value of Card.
    public void setRightVal(int rightVal) {
        this.rightVal = rightVal;
    }

    // Get the Left rank value of Card.
    public int getLeftVal() {
        return leftVal;
    }

    // Set the Left rank value of Card.
    public void setLeftVal(int leftVal) {
        this.leftVal = leftVal;
    }

    // Return the element of the Card.
    public String getElement() {
        return element;
    }

    // Set the element of the Card.
    public void setElement(String element) {
        this.element = element;
    }

    // Return the ImageIcon of the Card.
    public ImageIcon getImage() {
        return image;
    }

    // Set the ImageIcon of the Card.
    public void setImage(ImageIcon image) {
        this.image = image;
    }

    // Return boolean state of if the Card is used.
    public boolean isUsed() {
        return isUsed;
    }

    // Set the state of whether the Card is used.
    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }
    
    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Cloning Error..");
            return null;
        }
    }
    
    // Return a printable String detailing the card.
    public String toString() {
        String returnString = "" + getName() + "\nU: " + getUpVal() + "\nD: " +
                getDownVal() + "\nR: " + getRightVal() + "\nL: " + getLeftVal();
        return returnString;
    }
}
