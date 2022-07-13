/**
 * SuperArray by Team MarvelvsDC
 * First Last
 * collaborators: First Last, First Last
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.
   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length
   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */
  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray(int size)
  {
    //init underlying/inner storage of specified capacity
    /* YOUR SIMPLE+SMART CODE HERE */
    this.data = new int[size];
    //init instance vars
    /* YOUR SIMPLE+SMART CODE HERE */
    this.numberElements = 0;
  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //init underlying/inner storage of capacity 10
        /* YOUR SIMPLE+SMART CODE HERE */
    this.data = new int[10];
    //init instance vars
        /* YOUR SIMPLE+SMART CODE HERE */
    this.numberElements = 0;
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add(int value)
  {
    // test to see if we need to grow, then grow
    //SuperArray test = new SuperArray();
    if (this.data.length == this.numberElements){
      grow();
    }
      
    /**
       IMPORTANT:
       This is the first code that should run in this method
       but the last code you should write.
       Implement the rest of this method first,
       then only write this section once the rest is tested and working.
    */
    /* YOUR SIMPLE+SMART CODE HERE */

    // add item
    /* YOUR SIMPLE+SMART CODE HERE */
    this.data[this.numberElements] = value;

    // increment numberElements
    /* YOUR SIMPLE+SMART CODE HERE */
    this.numberElements += 1;
  }//end add()


  public boolean isEmpty()
  {
    //return whether this SuperArray instance is empty
    /* YOUR SIMPLE+SMART CODE HERE */
    // one liner of code 
    // return this.numberElements == 0; 
    if (this.numberElements == 0){
      return true;
    }
    return false;
  }


  public int get(int index)
  {
    //return item at index
    /* YOUR SIMPLE+SMART CODE HERE */
    return this.data[index];
  }


  public String toString()
  {
    //return stringified version of this Object
    /* YOUR SIMPLE+SMART CODE HERE */
    String newString = "{";
 
    for (int i = 0; i < this.numberElements; i++){
      if (i == 0){
        newString = newString + this.data[i];
      } else {
        newString = newString + "," + this.data[i];
      }
    }
    newString = newString + "}";
    return newString;
  }//end toString()


  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()

  public void remove(int index)
  {
    // shift items down to remove the item at index
    /* YOUR SIMPLE+SMART CODE HERE */
    int i;
    int[] data2 = new int[this.data.length-1];
    for (i = 0; i < this.data.length-1; i++)
    {
      data2[i] = this.data[i];
      if (i >= index)
      {
        data2[i] = this.data[i+1];
        //example:
        //1 2 3 4 5 6 <-- data, take out 3rd entry data[2]
        //1 2 4 5 6
      }
    }
    this.data = data2;
    // subtract fom numElements;
    /* YOUR SIMPLE+SMART CODE HERE */
    this.numberElements--;
  }


  public void add(int index, int value)
  {
    // see if there's enough room
    /* YOUR SIMPLE+SMART CODE HERE */
    if (this.data.length == this.numberElements)
    {
     grow();
    }
    // shift elements toward the end of the array
    /* YOUR SIMPLE+SMART CODE HERE */
    for (int i = numberElements; i > index; i--){
      this.data[i] = this.data[i-1];
    }
    
    // insert new element
    /* YOUR SIMPLE+SMART CODE HERE */
    this.data[index] = value;
    
    // increment numElements
    /* YOUR SIMPLE+SMART CODE HERE */
    this.numberElements += 1;
  }

  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    /* YOUR SIMPLE+SMART CODE HERE */
    int i = 0;
    int[] data2 = new int[this.numberElements + 5];
    // copy over all the elements from the old array to the new one
    /* YOUR SIMPLE+SMART CODE HERE */
    for (i = 0; i < this.data.length; i++)
    {
      data2[i] = this.data[i];
    }
    // point data to the new array
    this.data = data2;
    // Q: How does this look when illustrated using encapsulation diagram?
    /* YOUR SIMPLE+SMART CODE HERE */
  }//end grow()

}//end class