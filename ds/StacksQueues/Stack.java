/* Team 9 Lives 
Christopher DeSilva, Patti Elfers Wygand, Adam Driggers, Saranii Muller*/
//✔️ A constructor with no parameters
//✔️ void push(int value) - add value to the top of the stack
//✔️ int pop() - remove and return the top value from the stack
//✔️ int top() - return but do not remove the top value from the stack
//✔️ boolean isEmpty() - return true of the stack is empty, false otherwise
//✔️ int size() - return the number of elements currently in the stack
//✔️ boolean isFull() - returns true if the stack is full, false otherwise - only implement this if you use an array for implementation
//✔️toString() - return a string with all the data in the stack

//Thinking it through
//[10, 20, 30, 40, 50]
//cal pop,
//pop return 50
//array is now [10, 20, 30, 40]

public class Stack{ //creates stack class
  //instance variables
  private int size = 10; //size of array also instance variable  
  private int[] data; //array called data
  private int numberOfItems = 0; //starting index point
  
  //an array to hold stuff

  //Constructor
  //not void needs to return an object of this type back to the program
  public Stack(){ //is this the constructor
     //int array called data then the size of the array
      data = new int[size]; 
  }
  
// Place methods here
  public void push(int value){
    //base case 
    if (isFull()){//can no longer push if stack is full
      System.out.println("Stack is full");
    } // end of if
    else{
      data[numberOfItems] = value; // whatever is free will place next there
      numberOfItems++; //move up to next
    } //end of else 
    
    
  } // end of push 

  public boolean isFull(){//if stack is full
    if (numberOfItems == size){ //full means number of items is equal to size
      return true;
    }
    else {
      return false;
    }
  }

  public boolean isEmpty(){//if stack is empty
    if(numberOfItems == 0) {
      return true;   
    }
    else {
      return false;
    }
}

  //pop should return the value that is being removed
public int pop(){
  if(isEmpty()){ //condition if there is nothing left in the stack
    System.out.println("Stack is empty");
    return -999999999; // return some nonsense, just because we have to return some int
  }
  else {
    //get the data first and store in a temp variable!
    int temp = data[numberOfItems-1];
    //data[numberOfItems] = ""; 
    numberOfItems--; //lose that item, technically the value is still there just not visible
    return temp; //return the value we are popping off
  }
}

  public int size(){
    return numberOfItems;
  }

  public int top(){
    if (isEmpty()){
      return -999999; //if empty return crazy number 
    } 
    return data[numberOfItems-1];
  }
  
  public String toString(){
    //return data; //will print out the address of the data, some hex value
    String s = "[";
    for(int i = 0; i < numberOfItems; i++){//loop through 
      s += data[i]; //increment through
  
      if(i < numberOfItems -1 ){ //not at the end
        s += ","; //just for formatting
      } // end of if
    } //end of for 
    
    s += "]";
    return s;
  } // end of toString()
}
