/**
 * ArrayPractice by Team BossCoders
 * First Last
 * collaborators: Seth Adams, Qianhui Vanessa Zou, Latoya Boland, Christopher De Silva
 */

/**
   INSTRUCTIONS:
   This file contains stubs (empty methods) for the following methods:
   1. buildIncreasingArray (done)
   2. buildRandomArray (done)
   3. printArray (done)
   4. arraySum (done)
   5. firstOccurence (done)
   6. isSorted (done)
   7. findMaxValue (done)
   8. countOdds (done)
   9. flip done 
   The stubs will have comments describing what they should do
   Levels:
   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   Basic:
   Complete these methods:
   - buildRandomArray done
   - printArray done
   - arraySum done 
   - firstOccurence done
   - findMaxValue done
   Intermediate:
   Complete all the methods for basic and also
   - buildIncreasingArray done
   - isSorted done 
   - countOdds done 
   Advanced:
   Complete all the methods (done)
*/

import java.util.*;
import java.io.*;

public class ArrayPractice
{

  /**
     Parameters:
     size - how large the array should be
     startValue - the value of the first element
     step - the interval to the next value
     Returns:
     a new array of integers
     Examples:
     buildIncreasingArray(5,3,2) will return an array
     with the values 3,5,7,9,11 (five values, starting with 3 with a step size of 2)
  */
public static int[] buildIncreasingArray( int size, int startValue, int step )
  {
    int[] data = new int[size];
    data[0] = startValue;
      for(int i=0;i<data.length-1; i++){
          data[i+1] = data[i] + step; 
      }
    return data;
  }

  /**
     Parameters:
     size - how many elements in the array
     maxValue - the largest possible random value to use
     Returns:
     a new array where each element is an integer between 0
     and up to but not including maxValue
  */
  public static int[] buildRandomArray( int size, int maxValue )
  {
    Random r = new Random(); 
    int[] data = new int[size];
    for (int i =0;i <size;i++){
      data[i] = r.nextInt(maxValue);
    }
    return data;
  }


  /**
     Parameters:
     data - an array of ints
     Returns:
     nothing
     prints out the array
     Note: data.length stores the length of the array
     Another Note: yes, we know William live coded this a few minutes ago.
  */
  public static void printArray( int[] data )
  {
    for (int i = 0; i < data.length; i++){
      System.out.print(data[i] + " ") ;
    }
    System.out.println("");
  }
  /**
     Parameters:
     data - an array of integers
     value - the value to search for
     Returns:
     the index (location) of the first occurence of value
     Example:
     given array data, containing 1,5,2,7,5,8,5,12,19,5
     firstOccurence(data,5) would return 1
     since the first occurence of the value 5 is at a[1]
  */
  public static int firstOccurence( int[] data, int value )
  {

    int placevalue = 0;
    for(int i= 0; i< data.length;i++){
      if (data[i] == value){
        placevalue = i;
        return i+1;
      } //end of if
    } // end of for 
    return 0;
  } // return the position of the first occurence of the value


  /**
     Parameters: data - an array of ints
     Returns: an integer that is equal to the sum of all the elements in the array
     Ex: If the input array has the values 5,2,4,10 the return
     value will be 21 (5+2+4+10)
  */
  public static int arraySum( int[] data )
  {
    int sum = 0;
    for (int i = 0; i <data.length;i++){
      sum = sum + data[i];
    }

    return sum; // replace this
  }


  /**
     Parameters:
     data - an array of integers
     Returns:
     true if the array is sorted, false otherwise
     That is, if each element is < the element to its right
     then the array is sorted.
     An array with values 5,6,10,15 is sorted
     An array with values 5,6,10,18,15 is not
  */
  public static boolean isSorted( int[] data )
  {
      for(int i =0;i<data.length-1; i ++) {
          if (data[i] > data [i+1]){
              return false;//if not sorted this is triggered and returns false
          }
      }
    // this then runs and returns true if the false if test is not triggered
    return true;
  }

  /**
     Parameters:
     data - an array of integers
     Returns:
     value of the largest element in the array
  */
   public static int findMaxValue( int[] data ) {
    int max = data[0];
    for (int i = 1; i <data.length; i++){
        if (data[i]>max){
          max = data[i];
        } // end of if 
    } //end of for 
      return max;
  } //end of find max
  


  /**
     Parameters:
     data - an array of integers
     Returns:
     the number of odd elements in the array
     Ex: if data holds 5,6,7,8,9,10 then the return value
     will be 3 since three of the elements are odd.
  */
  public static int countOdds( int[] data ) {
     int count = 0;
    for(int i =0; i<data.length-1; i++)
      {
          if (data[i]%2 == 1){
              count ++;
          }
      }
    /* YOUR BRILLIANT CODE HERE */

    // Note the % operator is the modulo (basically remainder) function
    // in java. Use to determine if an integer is odd.

    return count;
  }

  /**
     Parameters:
     data - an array of integers
     Returns:
     no return value since this is a void function -- but
     you will manipulate the values in the array parameter
     Postcondition:
     elements of the input array are in reverse order
     Example:
     If the input array contains 5,8,13,7,27,2
     After the routine, the array will contain 2,27,7,13,8,5
  */
  public static void flip( int[] data )
  {
    int[] data2 = new int[data.length]; // new temp array to hold flip
    for (int i = 0; i<data.length;i++){
      data2[i] = data[data.length-i-1];
    } // end of for loop for place back values into data2
      for (int i = 0; i<data.length;i++){
        data[i] = data2[i]; 
      }// end of loop to flip data
  } // end of flip 


  public static void main( String[] args )
  {
    int value = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("What value would you like to search for? (0-20)");
    value = input.nextInt();
    // remove the comments as you complete each routine
    // and add more lines as you add additional routines.
    int[] data = buildRandomArray(10, 20);
    int[] data2 = buildIncreasingArray(10,5,3);
    printArray(data);
    printArray(data2);
    //int FirstOccurence = firstOccurence (data,value);
    System.out.println("The value is at: " +firstOccurence(data,value));
    if (firstOccurence(data,value) ==0){
      System.out.println("The value is not in the array");
    }
    System.out.println("The max value of data is: " +findMaxValue(data));
     System.out.println("The amount of odds in data is: " +countOdds(data));
    System.out.println("Is the array sorted: " +isSorted(data));
    System.out.println("The sum is : " +arraySum(data));
    flip(data);
    System.out.println("The array flipped looks like:");
    printArray(data);

    // add calls to show that the methods you write work.
  }
}

