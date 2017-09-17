package psytripletriad;

/**
 *
 * @author PsY
 */
public class Board {
    // 3X3 multidimentional array to hold the played cards.
    Card[][] board;
    // 3x3 multidimentional array to hold ownership of the played cards.
    int[][] ownership;
    
    // Constructor
    public Board() {
        // Setup board of 3x3 squares.
        board = new Card[3][3];
        // Setup a 3x3 ownership array.
        ownership = new int[3][3];
    }
    
    // Reset the boards so no Cards have been played.
    public void resetBoard() {
        // Loop through the multi arrays to returns values to null.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = null;
                ownership[i][j] = 0;
            }
        }
    }
    
    // Add a given Card to the board in the given location on board.
    // Returns boolean value indicating if sucsessful or not.
    public boolean addToBoard(Card card, int playerNum, int x, int y) {
        // If X or Y is above 2 then return false.
        if (x > 2 || y > 2) {
            return false;
        } else {
            // X and Y is valid.
            board[x][y] = card;
            ownership[x][y] = playerNum;
            return true;
        }
    }
    
    // Returns text status of the card at given location X,Y.
    public String queryBoard(int x, int y) {
        if (board[x][y] == null) {
            // If the queried location is empty.
            return "Empty";
        } else {
            // If the queried location has a Card placed.
            return board[x][y].toString();
        }
    }
    
    // Returns Card that has been placed at X,Y.
    public Card getCardAt(int x, int y) {
        Card card = board[x][y];
        return card;
    }
    
    public int getOwnershipAt(int x, int y) {
        return ownership[x][y];
    }
    
    public void switchOwnershipAt(int x, int y) {
        if (getOwnershipAt(x, y) == 1) {
            ownership[x][y] = 2;
        } else {
            ownership[x][y] = 1;
        }
    }
    
    // Returns printable String format of the Board.
    public String toString() {
        String returnString = "";
        // Loop through the Board Array.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == null) {
                    // No card in given location.
                    returnString += "Empty ";
                } else {
                    // Add the card name to the display string.
                    returnString += board[i][j].getName() + " ";
                }
            }
            // Create new line for every new row.
            returnString += "\n";
        }
        return returnString;
    }
}
