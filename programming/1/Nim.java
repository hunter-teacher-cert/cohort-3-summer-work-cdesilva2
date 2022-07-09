/**
 * Game of Nim by Team BossCoders
 * First Last
 * collaborators: Christopher De Silva 
 */
import java.io.*;
import java.util.*;
import java.util.Random;

public class Nim 
{
  public static void main( String[] args ) 
{
    int stones = 12;
    int stonesTaken; 
    int playerturn = 0; // 0 = Human 1 = Bot
    Scanner input = new Scanner(System.in);

    //loop until game ends
    while(stones <=12 && stones >0) {
      //prompt for user input : num of stones
        System.out.println(" How many stones do you choose (1-3)?");
          stonesTaken = input.nextInt();
            if (stonesTaken < 4 && stonesTaken > 0){
              stones = stones - stonesTaken;
              playerturn = 0; 
              System.out.println("Stones remaining: " + stones);
              System.out.println(" ");
              if (stones > 0){
                System.out.println("My Turn!");
                playerturn = 1; 
              Random random = new Random();
                int ransom = random.nextInt(4); 
                //System.out.println("This is ransom: " +ransom);
              stones = stones - ransom;
              System.out.println("Stones remaining: " + stones);
              System.out.println(" ");
              }// end of if for Bot pick
              else if ( stones < 1){
               if (playerturn < 1 ){
                 System.out.println(" Congratulations, You WON!!!!!!");
               } // end of if for player win
                else {
              System.out.println("Sorry you lost. I won!!"); 
              } // end of else for Bot win
              
            }// end of if for choosing between human and bot
            else if(stonesTaken > 3 || stonesTaken < 1){
            System.out.println("You entered an invalid choice please choose a number between 1-3");
            stonesTaken = input.nextInt();
            }//end of if checking correct stonesTaken
                 } // end of else block taking awat stones   
    } //close while 
  } //close main
} //close public class Nim
//Footer
