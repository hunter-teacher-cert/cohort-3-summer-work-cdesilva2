///✔️ A constructor with no parameters
//✔️ void enqueue(int value) - add value to the end of the queue
//✔️ int dequeue() - remove and return the top value from front of the queue
//✔️ int front() - return but do not remove the top value from the front of the queue
//✔️ boolean isEmpty() - return true of the queue is empty, false otherwise
// int size() - return the number of elements currently in the queue
// *** (not doing because we are using LL)boolean isFull() - returns true if the queue is full, false otherwise - only implement this if you use an array for implementation
//✔️toString() - return a string with all the data in the stack

//using built in linkedlist
//https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html

import java.util.*; //needed so we can access linked list

public class Queue{

    // Place private instance variables here
    //data, which is a linked list
  private LinkedList<Integer> list; //declares the list
    
  // Place constructors here
  public Queue(){//Queue "factory"
    list = new LinkedList<Integer>(); //creates a new empty linkedList for type integers
  }

    // Place methods here
  public void enqueue(int value){
    list.add(value);
  }

  public int dequeue(){
     return list.remove();
  }
  
  public int front(){
    return list.peekFirst();//allows you to look at value but not remove
   }

  public boolean isEmpty(){
    return list.isEmpty(); 
  }

  public int size(){
    return list.size();
  }
  
  public String toString(){
    return list.toString();//list built in
  }
    

}