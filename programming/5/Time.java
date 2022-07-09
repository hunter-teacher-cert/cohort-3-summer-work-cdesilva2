import java.io.*;
import java.util.*;


/**
 * Time class by Team LucidThinkeren
 * Elizabeth Rechtin
 * collaborators: Ed Hawkins, Thea Williams, Christopher DeSilva
    I went through this line by line with Vasyl Ilnytskyy during office hours
    also present were: Patti Elfers, Alana Robinson, Jenna Lin, Saranii, Muller, Stacy Goldstein, Christine Marra
 */

/**
   INSTRUCTIONS:

   This file contains the starter code for our Time class.

   The class here uses ints for hours, minutes, and seconds but you
   could decide to change the internal representation to just store
   an int representing a number of seconds.

   Place this file in a folder named programming/5/Time.java

   Basic level (complete all):
   - public Time(int hrs, int mins, int secs) - constructor
   - public void toString()
   - public void set(int hrs, int mins, int secs)

   Intermediate level (complete Basic methods plus this method):
   - public void add(Time other)
   - public boolean isEquals(Time other)

   
   Advanced level (complete Basic + Intermediate + these two methods):
   - public int compareTo(Time other)
   
*/



public class Time {
    // Instance Variable(s)
    // You can change this if you want to use the alternate
    // implementation of just storing the overall seconds.
    
    private int hours; //these lines are declaring that these variables exist
    private int minutes; //you should always make these private
    private int seconds; //private indicates data encapsulation (only readable within the class)

    // Constructors - this is the default constructor, comes after the variables, before all other methods
    public Time()
  {
	  this.hours = 0; //these lines are initializing it to zero
	  this.minutes = 0;//you have to use this. it's a naming convention in java
	  this.seconds = 0;
	
    }

    /**
       Parameters:
       - hrs, mins, secs - the time you want to create the class as

       Initialize this instance to represent hrs:mins:secs as the time.
       
     */
    public Time(int hrs, int mins, int secs){
      this.hours = hrs;
      this.minutes = mins;
      this.seconds = secs;

	// your code here
	
    }
    
    
    // Methods

    /**
       returns a string representation of the time
    */
    public String toString(){
	return(this.hours + " hours" + this.minutes + " minutes" + this.seconds + " minutes");
    }


    

    /**
       Parameters:
       - hrs,mins,secs - ints representing a time

       modifies this instance to represent the time hrs:mins:secs
    */
    public void set(int hrs, int mins, int secs){
	// add the code to add the time represented by other
	// to this instance.

    }

    

    /**
       Parameters:
       - other - a variable of type Time

       modifies this instance to represent the result of adding it and
       the time other.
    */
    public void add(Time other){
	// add the code to add the time represented by other
	// to this instance.

    }


    /**
       Parameters:
       other - a variable of type Time

       Returns:
       True if this instance and other represents the same time
       false otherwise.
    */
    public boolean equals(Time other){
	// your code here)

	return false; // change this
    }

    /**
       Parameters:
       other - a variable of type Time

       Returns:
       A positive number if this instance represents a time greater
       than the time of other (this > other)

       A negative number if this instance represents a time less
       than the time of other (this < other)

       0 if the two instances represent the same time.

    */
    public int compareTo(Time other){
	// your code here)

	return 0; // change this
    }
    

    
}//end class