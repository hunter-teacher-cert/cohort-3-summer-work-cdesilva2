//PROVIDE :: start with basic java code and simple for loop already printed.
import java.io.*;
import java.util.*;

public class LiveCoding {

  public static void main(String[] args){
    // VERSION 1 :: Review loops from previous lesson
    // STUDENT-PROMPT :: Looking at this, What do you think the output will be?
    // for(int counter = 0; counter < 5; counter++){ 
    //   System.out.println("Java is fun");
    // }

    // VERSION 2 :: replace the hard coded five with the numberOfTimes variable.
    int numberOfTimes = 5;
    
    for(int counter = 0; counter < numberOfTimes; counter++){ 
      System.out.println("Java is fun");
    }
    //MUST-ANSWER-Q :: do you think version 1 and 2 will have the same result?

    //STUDENT-PROMPT :: How will the output change if we update numberOfTimes to 7?
    //BEEG REVEAL :: the condition is a for loop can use a variable that can update throughout the program.

    // Version 3 :: Add a scanner in to prompt the user for a number
    // PROVIDE :: Scanner input code
    System.out.println("How many times do you want to print!");
    Scanner in = new Scanner(System.in);
    numberOfTimes = in.nextInt();
    
    for(int counter = 0; counter < numberOfTimes; counter++){ 
        System.out.println("Java is fun");
    }

    //STUDENT-PROMPT :: While running, ask the students what number will numberOfTimes hold?

    //DELIBERATE-ERROR :: Students usually choose increasingly big numbers, we could but a number bigger than max int number, larger than 2,147,483,647, try 3 billion
      
  }
}