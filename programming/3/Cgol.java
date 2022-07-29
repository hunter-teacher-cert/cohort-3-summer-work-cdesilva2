import java.io.*;
import java.util.*;

/**
 * Conway's Game of Life by Team AreWeSentientYet?
 * Maxwell Yearwood
 * collaborators: Moo Joon (Michael) Park, Christopher De Silva, Wayne Tobias
 * Master coding by Maxwell
* Assisted by Ashfak!!
* Slacker - Christopher
 */

/**
   The Rules of Life:
   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.
      ** two conditions
   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.
      ** two conditions
   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.
      ** one condition
   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class Cgol
{

  //create, initialize, and return  empty board (all cells dead) represented by 0's
  public static char[][] createNewBoard( int rows, int cols )
  {
    char[][] board = new char[rows][cols];

    for(int r = 0; r < board.length; r++)
      {
        for(int c = 0; c < board[r].length; c++)
          {
            board[r][c] = '0';
          }
      }
    return board;
    
  }


 //print the board to the terminal (screen)
  public static void printBoard( char[][] board )
  {
      for( int r = 0; r < board.length; r++)
        {
          for( int c = 0; c < board[r].length; c++)
            {
              System.out.print(board[r][c] + " "); // inserts a space after each entry
            }
          System.out.println();
        }
  
  }


  //set cell (r,c) to val
  // used in Main to default dead cells
  public static void setCell( char[][] board, int r, int c, char val )
  {
    board[r][c] = val;
  }


  //return number of living neigbours of board[r][c]
  public static int countNeighbours( char[][] board, int r, int c )
  {
   int count = 0;
    for(int i = 0; i < board.length;i++)//loops through each row one element before, element location and one element after.
      {
        for(int j = 0; j < board[0].length; j++)// loops through each column
        {
            //conditional via Taylor's demo--could not figure out how to constrain for loop
          if ((r-1 <= i && i <= r+1) &&
           (c-1 <= j && j <= c +1) &&
           (!(i == r && j == c)) && board[i][j] == 'X') 
            {
             count++;
            } 
        }
      }
    
   return count;
  }


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead '0')
  */
  public static char getNextGenCell( char[][] board,int r, int c, int count )
  {
    char nextGen = board[r][c];
   // int count = countNeighbours(board,r,c);
    if (board[r][c] == 'X'){
      if (count< 2 || count >3){
        nextGen= '0';
      }
    }else if (board[r][c] == '0'){
      if(count == 3){
        nextGen = 'X';
}
}

return nextGen;
}


  //generate and return a new board representing next generation
  // newBoard is being filled with neighbour counts
  public static char[][] generateNextBoard( char[][] board )
  {
    int [][] newBoard = new int[board.length][board[0].length];

    for(int r = 0; r< board.length; r++)
      {
        for(int c = 0; c <board[r].length; c++)
          {
            newBoard[r][c] = countNeighbours(board, r, c);
          }
              
      }
   // now we update the numbers based on neighbours
    for(int r = 0; r< board.length; r++)
      {
        for(int c = 0; c <board[r].length; c++)
          {
            board[r][c] = getNextGenCell(board, r, c, newBoard[r][c]);
          }
              
      }
       
   return board;
  }


  public static void main( String[] args )
  {
   
    char[][] board;
    board = createNewBoard(5,5);
    printBoard( board );


    //breathe life into some cells:
    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');
    System.out.println();
     printBoard( board );


      

    System.out.println();
    
  /**  // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)*/
    
    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    board = generateNextBoard(board);
    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");


    
  }//end main()

}//end class