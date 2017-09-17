package psytripletriad;

import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author PsY
 */
public class GameEngine {

    // Setup CardLoader.
    private final CardLoader LOADER;
    // Setup the game Board.
    private final Board BOARD;
    // Setup 2 players hands.
    private final CardHand P1HAND, P2HAND;
    // Setup 2 players round scores.
    private int p1RScore, p2RScore;
    // Variable of which players turn it is.
    private int playerTurn;

    // Contructor.
    public GameEngine() {
        // Initilize CardLoader.
        this.LOADER = new CardLoader();
        // Initilize the game Board.
        this.BOARD = new Board();
        // Initilize the players hands.
        this.P1HAND = new CardHand();
        this.P2HAND = new CardHand();
    }

    // Start a new game of TripleTriad.
    public void newGame() {
        // Randomise players hands and return their round score to 5.
        this.P1HAND.setHand(LOADER.getRandomHand());
        this.p1RScore = 5;
        this.P2HAND.setHand(LOADER.getRandomHand());
        this.p2RScore = 5;
        BOARD.resetBoard();
        // New random number generator to flip a coin.
        Random rd = new Random();
        if (rd.nextInt(10) <= 5) {
            playerTurn = 1;
        } else {
            playerTurn = 2;
        }
    }

    public Board getBoard() {
        return BOARD;
    }

    // <editor-fold desc="Select Cards Methods" defaultstate="collapsed">
    // Player selects there card - the one at index.
    public void playerSelectCard(int index) {
        if (playerTurn == 1) {
            // Player 1 turn.
            P1HAND.selectCard(index);
        } else {
            // Player 2 turn.
            P2HAND.selectCard(index);
        }
    }

    // Player deselects the card they had previously chosen.
    public void playerDeselectCard() {
        if (playerTurn == 1) {
            P1HAND.unselectCard();
        } else {
            P2HAND.unselectCard();
        }
    }

    // Returns boolean value of whether the player has made a selection.
    public boolean playerHasSelected() {
        if (playerTurn == 1) {
            // Player 1 turn.
            return P1HAND.selectionMade();
        } else {
            // Player 2 turn.
            return P2HAND.selectionMade();
        }
    }
    // </editor-fold> 

    // <editor-fold desc="Play Card Methods" defaultstate="collapsed">
    public void playSelectedCard(int x, int y) {
        if (playerTurn == 1) {
            BOARD.addToBoard(P1HAND.getCurSelected(), 1, x, y);
            P1HAND.getCurSelected().setIsUsed(true);
            P1HAND.unselectCard();
            evaluateOwner(x, y);
            playerTurn = 2;
        } else {
            BOARD.addToBoard(P2HAND.getCurSelected(), 2, x, y);
            P2HAND.getCurSelected().setIsUsed(true);
            P2HAND.unselectCard();
            evaluateOwner(x, y);
            playerTurn = 1;
        }
    }

    public Card getCardFromBoard(int x, int y) {
        return BOARD.getCardAt(x, y);
    }

    public int getOwnershipAt(int x, int y) {
        return BOARD.getOwnershipAt(x, y);
    }
    // </editor-fold> 

    // <editor-fold desc="Player Turn Methods" defaultstate="collapsed">
    // Returns int of which players turn it is.
    public int getPlayerTurn() {
        return playerTurn;
    }

    // Switch player turn from one to the other.
    public void changePlayerTurn() {
        if (playerTurn == 1) {
            playerTurn = 2;
        } else {
            playerTurn = 1;
        }
    }
    // </editor-fold> 

    // <editor-fold desc="Player Score Methods" defaultstate="collapsed">
    // Get the score of the player number given in args.
    public int getPlayerScore(int player) {
        if (player == 1) {
            // Player 1 score is wanted.
            return p1RScore;
        } else {
            // Player 2 score is wanted.
            return p2RScore;
        }
    }

    // Set the given players score to the given value.
    public void setPlayerScore(int player, int score) {
        if (player == 1) {
            // Player 1 score to be altered.
            this.p1RScore = score;
        } else {
            // Player 2 score to be altered.
            this.p2RScore = score;
        }
    }
    // </editor-fold> 

    // <editor-fold desc="Logic Methods" defaultstate="collapsed">
    public void evaluateOwner(int x, int y) {
        //
        // If card was played in the Top Left!
        //
        if (x == 0 && y == 0) {
            Card playedCard = BOARD.getCardAt(0, 0);
            if (BOARD.getCardAt(0, 1) != null) {
                // check card to the right.
                if (BOARD.getCardAt(0, 1).getLeftVal() < playedCard.getRightVal()) {
                    // If Card to the rights value is less.
                    if (BOARD.getOwnershipAt(0, 1) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(0, 1);
                    }
                }
            }

            if (BOARD.getCardAt(1, 0) != null) {
                // Check card below.
                if (BOARD.getCardAt(1, 0).getUpVal() < playedCard.getDownVal()) {
                    // If Card to the rights value is less change ownership.
                    if (BOARD.getOwnershipAt(1, 0) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(1, 0);
                    }
                }
            }
        }
        //
        // If card was played in the Up position.
        //
        if (x == 0 && y == 1) {
            Card playedCard = BOARD.getCardAt(0, 1);
            // Check card at Top Left
            if (BOARD.getCardAt(0, 0) != null) {
                if (BOARD.getCardAt(0, 0).getRightVal() < playedCard.getLeftVal()) {
                    // If Change if rank to left is lower.
                    if (BOARD.getOwnershipAt(0, 0) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(0, 0);
                    }
                }
            }
            // Check card at Top Right.
            if (BOARD.getCardAt(0, 2) != null) {
                if (BOARD.getCardAt(0, 2).getLeftVal() < playedCard.getRightVal()) {
                    // If Change if rank to left is lower.
                    if (BOARD.getOwnershipAt(0, 2) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(0, 2);
                    }
                }
            }
            // Check card at Center.
            if (BOARD.getCardAt(1, 1) != null) {
                if (BOARD.getCardAt(1, 1).getUpVal() < playedCard.getDownVal()) {
                    // Change if rank to the top is lower.
                    if (BOARD.getOwnershipAt(1, 1) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(1, 1);
                    }
                }
            }
        }
        //
        // If card was played in the Top Right position.
        //
        if (x == 0 && y == 2) {
            Card playedCard = BOARD.getCardAt(0, 2);
            // Check card at Up postiion.
            if (BOARD.getCardAt(0, 1) != null) {
                if (BOARD.getCardAt(0, 1).getRightVal() < playedCard.getLeftVal()) {
                    if (BOARD.getOwnershipAt(0, 1) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(0, 1);
                    }
                }
            }
            // Check card at Right postiion.
            if (BOARD.getCardAt(1, 2) != null) {
                if (BOARD.getCardAt(1, 2).getUpVal() < playedCard.getDownVal()) {
                    if (BOARD.getOwnershipAt(1, 2) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(1, 2);
                    }
                }
            }
        }
        //
        // If card was played in the Left position.
        //
        if (x == 1 && y == 0) {
            Card playedCard = BOARD.getCardAt(1, 0);
            // Check card at Top Right postiion.
            if (BOARD.getCardAt(0, 0) != null) {
                if (BOARD.getCardAt(0, 0).getDownVal() < playedCard.getUpVal()) {
                    if (BOARD.getOwnershipAt(0, 0) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(0, 0);
                    }
                }
            }
            // Check card at Center postiion.
            if (BOARD.getCardAt(1, 1) != null) {
                if (BOARD.getCardAt(1, 1).getLeftVal() < playedCard.getRightVal()) {
                    if (BOARD.getOwnershipAt(1, 1) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(1, 1);
                    }
                }
            }
            // Check card at Bottom Left postiion.
            if (BOARD.getCardAt(2, 0) != null) {
                if (BOARD.getCardAt(2, 0).getUpVal() < playedCard.getDownVal()) {
                    if (BOARD.getOwnershipAt(2, 0) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(2, 0);
                    }
                }
            }
        }
        //
        // If card was played in the Center position.
        //
        if (x == 1 && y == 1) {
            Card playedCard = BOARD.getCardAt(1, 1);
            // Check card at Up position.
            if (BOARD.getCardAt(0, 1) != null) {
                if (BOARD.getCardAt(0, 1).getDownVal() < playedCard.getUpVal()) {
                    if (BOARD.getOwnershipAt(0, 1) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(0, 1);
                    }
                }
            }
            // Check card at Down position.
            if (BOARD.getCardAt(2, 1) != null) {
                if (BOARD.getCardAt(2, 1).getUpVal() < playedCard.getDownVal()) {
                    if (BOARD.getOwnershipAt(2, 1) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(2, 1);
                    }
                }
            }
            // Check card at Right position.
            if (BOARD.getCardAt(1, 2) != null) {
                if (BOARD.getCardAt(1, 2).getLeftVal() < playedCard.getRightVal()) {
                    if (BOARD.getOwnershipAt(1, 2) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(1, 2);
                    }
                }
            }
            // Check card at Left position.
            if (BOARD.getCardAt(1, 1) != null) {
                if (BOARD.getCardAt(1, 1).getRightVal() < playedCard.getLeftVal()) {
                    if (BOARD.getOwnershipAt(1, 1) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(1, 1);
                    }
                }
            }
        }
        //
        // If card was played in the Right position.
        //
        if (x == 1 && y == 2) {
            Card playedCard = BOARD.getCardAt(1, 2);
            // Check card at Center postiion.
            if (BOARD.getCardAt(1, 1) != null) {
                if (BOARD.getCardAt(1, 1).getRightVal() < playedCard.getLeftVal()) {
                    if (BOARD.getOwnershipAt(1, 1) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(1, 1);
                    }
                }
            }
            // Check card at Top Right postiion.
            if (BOARD.getCardAt(0, 2) != null) {
                if (BOARD.getCardAt(0, 2).getDownVal() < playedCard.getUpVal()) {
                    if (BOARD.getOwnershipAt(0, 2) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(0, 2);
                    }
                }
            }
            // Check card at Bottom Right postiion.
            if (BOARD.getCardAt(2, 2) != null) {
                if (BOARD.getCardAt(2, 2).getUpVal() < playedCard.getDownVal()) {
                    if (BOARD.getOwnershipAt(2, 2) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(2, 2);
                    }
                }
            }
        }
        //
        // If card was played in the Bottom Left position.
        //
        if (x == 2 && y == 0) {
            Card playedCard = BOARD.getCardAt(2, 0);
            // Check card at Left postiion.
            if (BOARD.getCardAt(1, 0) != null) {
                if (BOARD.getCardAt(1, 0).getDownVal() < playedCard.getUpVal()) {
                    if (BOARD.getOwnershipAt(1, 0) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(1, 0);
                    }
                }
            }
            // Check card at Down postiion.
            if (BOARD.getCardAt(2, 1) != null) {
                if (BOARD.getCardAt(2, 1).getLeftVal() < playedCard.getRightVal()) {
                    if (BOARD.getOwnershipAt(2, 1) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(2, 1);
                    }
                }
            }
        }
        //
        // If card was played in the Down position.
        //
        if (x == 2 && y == 1) {
            Card playedCard = BOARD.getCardAt(2, 1);
            // Check card at Bottom Left postiion.
            if (BOARD.getCardAt(2, 0) != null) {
                if (BOARD.getCardAt(2, 0).getRightVal() < playedCard.getLeftVal()) {
                    if (BOARD.getOwnershipAt(2, 0) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(2, 0);
                    }
                }
            }
            // Check card at Center postiion.
            if (BOARD.getCardAt(1, 1) != null) {
                if (BOARD.getCardAt(1, 1).getDownVal() < playedCard.getUpVal()) {
                    if (BOARD.getOwnershipAt(1, 1) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(1, 1);
                    }
                }
            }
            // Check card at Bottom Right postiion.
            if (BOARD.getCardAt(2, 2) != null) {
                if (BOARD.getCardAt(2, 2).getLeftVal() < playedCard.getRightVal()) {
                    if (BOARD.getOwnershipAt(2, 2) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(2, 2);
                    }
                }
            }
        }
        //
        // If card was played in the Bottom Right position.
        //
        if (x == 2 && y == 2) {
            Card playedCard = BOARD.getCardAt(2, 2);
            // Check card at Right postiion.
            if (BOARD.getCardAt(1, 2) != null) {
                if (BOARD.getCardAt(1, 2).getDownVal() < playedCard.getUpVal()) {
                    if (BOARD.getOwnershipAt(1, 2) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(1, 2);
                    }
                }
            }
            // Check card at Down postiion.
            if (BOARD.getCardAt(2, 1) != null) {
                if (BOARD.getCardAt(2, 1).getLeftVal() < playedCard.getRightVal()) {
                    if (BOARD.getOwnershipAt(2, 1) != playerTurn) {
                        // If card checked is not already owned by user
                        BOARD.switchOwnershipAt(2, 1);
                    }
                }
            }
        }
    }
    // </editor-fold>

    // <editor-fold desc="Image UI Methods" defaultstate="collapsed">
    public ImageIcon[] getHandImages(int player) {
        if (player == 1) {
            //Player 1
            return P1HAND.getHandImages();
        } else {
            // Player 2
            return P2HAND.getHandImages();
        }
    }

    public Card getCardFromHand(int player, int index) {
        if (player == 1) {
            // Player 1
            return P1HAND.getCardAt(index);
        } else {
            // Player 2
            return P2HAND.getCardAt(index);
        }
    }
    // </editor-fold> 

    public String toString() {
        String returnString = "";
        returnString += "Player 1: " + p1RScore;
        returnString += " - Cards Used: " + P1HAND.getNumberUsed();
        returnString += "\nPlayer 2: " + p2RScore;
        returnString += " - Cards Used: " + P2HAND.getNumberUsed();
        return returnString;
    }
}
