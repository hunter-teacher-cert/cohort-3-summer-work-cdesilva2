import java.io.*;
import java.util.*;

/*
Name: Elizabeth Rechtin
Collaborators:  First team: Jihae Park, Marisa Shuman, Latoya Boland, Second team: Patti Elfers, Wayne Tobias, Shana Henry
I also stayed for office hours
Sort Project:

+Done: Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.

+Done: Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortProjectDriver to test.

+DONE: Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.



Search Project:
+DONE:  1. Complete the linear search (BASIC)
+DONE:  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    //defualt constructor: populate the ArrayList with 15 random numbers ranging from 0 to 19. [4, 18, 12, 9, 0, 12, 9, 9, 8, ]
    public SortSearch(){
    	data = new ArrayList<Integer>();
    	r = new Random();
    	for (int i = 0; i < 15 ; i++){
    	    data.add(r.nextInt(20)); //random integers from 0 to 19. 
	    }
	
    }

    //overloaded constructor(with parameters): populate the ArrayList with given number(size) of random numbers ranging from 0 to 19.
    public SortSearch(int size){
    	data = new ArrayList<Integer>();
    	r = new Random();
    	for (int i = 0; i < size; i++){
    	    data.add(r.nextInt(20));
	    }
	
    }

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
	    return this.data.get(index);
    }
    


    /*
      return the index of the smallest data idem from index start to the end
      of the ArrayList. If there are multiple of the smallest value,
      return any of them.
      
      Example, if the arraylist has:
      5,2,       10,6,8
      findSmallestIndex(2);
      if start was 2 (start at index 2, value 10) then it would return 3 which is the index of the value 6 which is the index with the
      smallest value from start to end

      On the otherh and, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
    //we don't need the int currSmall if we want to shorten code
    public int findSmallestIndex(int start){
    	int smallIndex = start;
      int currSmall = this.data.get(start); //instantiate another variable to hold the current smallest value
    	//iterate through the ArrayList starting from start to this.data.size()
      for(int i = start; i < data.size(); i++){
        if(data.get(i) < currSmall){
          currSmall = data.get(i);
          smallIndex = i;
        }
      }
      //compare each item with the current smallest value and update the current smallest value 
    	return smallIndex;//at this point, it will only return the index of the smallest value, not move it
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.

       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
         For each index, find the smallest from that Location
	 to the end of the array and swap it with that index.

	 
       

    */
    public void sort()//can we call findSmallestIndex?
  {//iterate throught the data(A.L.) starting from 0 to data.size() 
      //update the findSmallestIndex arguement
      int temp = 0;
      int minIndex = 0;
      
      for(int i = 0; i < data.size(); i++){
        minIndex = findSmallestIndex(i); //
        temp = data.get(minIndex); //assigning 5 to temp 
        data.set(minIndex,data.get(i));
        data.set(i, temp);
        
      }
      


    }



    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.

       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.

       This algorithm works on any ArrayList.

    */
    public int linearSearch(int value)
    {
      int foundIndex = -1;//this returns a -1 if not found
  
    for (int i = 0; i < data.size(); i++) 
    {
      int element = data.get(i);
      if (element == value) 
      {
        foundIndex = i;
        break;
      }
    }
    return foundIndex;
	
    }
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value){

	// create assign variables  representing the high, low and middle indices
      int low = 0;
      int high = data.size() -1;
      int middle = (high + low) /2;
      
	// while we're not done:
      while (true)
      {
        if (data.get(middle) == value)
        {
          return middle;
        }
        else if (value < data.get(middle))
        {
          high = middle -1;
        }
        else if (high <= low)
        {
          return -1; 
        }
        else
        {
          low = middle +1;
          
        }
        middle = (low + high) /2;
      }
  }           
	    

    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */

    public int binarySearchRecursive(int value, int lowIndex, int highIndex){

	// refer to class discussion
	
	return 0;
	    
    }
    
	
    public String toString(){
	return ""+data;
    }


    public void builtinSort(){
	Collections.sort(data);
	
    }
    
/* Merge Sort Stuff after here */
    /**
       Builds and returns an ArrayList that's already in increasing order.
       You can use this method to test your merge method.
    */
    public ArrayList<Integer> buildIncreasingList(int size){
	ArrayList<Integer>  newlist = new ArrayList<Integer>();
	Random r = new Random();
	int nextval = r.nextInt(20)+1;
	for (int i=0;i<size;i++){
	    newlist.add(nextval);
	    nextval = nextval + r.nextInt(20);
	}

	return newlist;
	}

    /**
       this routine should create and return a new ArrayList of
       integers and fill it by merging list1 and list2 into the new
       list.
       list1 and list2 are already sorted in increasing order.
       Example:
       If list1 contains [1,5,17,25]
       and list2 contains [3,6,10,30,40,50]
       The new list will contain:
       [1, 3, 5, 6, 10, 17, 25, 30, 40, 50]
       
    */
       
    public ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2){
      //create a new arraylist to return
      ArrayList<Integer> list3 = new ArrayList<Integer>();
      
      //code for merge: 
      while (list1.size() != 0 && list2.size() != 0){
        if (list1.get(0) <= list2.get(0)){//compare the first elements in list1 and list2
          list3.add(list1.get(0));
          list1.remove(0);
        }//end of if
        else {
          list3.add(list2.get(0));
          list2.remove(0);
        }//end of else if
      }
      
      //this will be true until list1 is empty
      while(list1.size() > 0){
        list3.add(list1.get(0));
        list1.remove(0);
      }//this will be true until list2 is empty
      while(list2.size() > 0){
        list3.add(list2.get(0));
        list2.remove(0);
      }
      System.out.println("merged! " + list3);
	 return list3; // returns the new arraylist
    }//end of method

  public ArrayList<Integer> mergeSort(ArrayList<Integer> list){

      // check for base case
    if (list.size() < 2){
      return list;
    } else { // if not the base case
      
      // // split in two lists
      // //left should be from 0 to the mid point
      // ArrayList<Integer> left = new ArrayList<Integer>(); //empty right now
      // //right should be form mid + 1 to the end
      // ArrayList<Integer> right = new ArrayList<Integer>(); //empty right now
      
      // for(int i = 0; i < list.size()/2; i++){//left side split
      //   left.add(list.get(i));
      // }
      // for(int i = list.size()/2; i< list.size(); i++){//right side split
      //   right.add(list.get(i));
      // }

      //using sublist to split the lists
      //ArrayList implements the List class, getting some of its functions?
      //the subList function of an arraylist returns a new List object, not a new ArrayList
      //BUT an arraylist can be constructed by a List obj.
      //List<Integer> listL = list.subList(0, list.size()/2);
      //List<Integer> listR = list.subList(list.size()/2, list.size());
      //ArrayList<Integer> left = new ArrayList<Integer>(listL); //new ArrayList from a List obj
      //ArrayList<Integer> right = new ArrayList<Integer>(listR);

      //ONE LINE WORKS!--this is amazing, Adam!!
      ArrayList<Integer> left = new ArrayList<Integer>(list.subList(0, list.size()/2));
      ArrayList<Integer> right = new ArrayList<Integer>(list.subList(list.size()/2, list.size()));
      
      //Testing out split
      System.out.println("left: " + left);
      System.out.println(left.size());
      System.out.println("right: " + right);
      System.out.println(right.size());
      
      //ArrayList<Integer> left = list.sublist(0, list.size()/2); //doesn't work
  
      left = mergeSort(left); // meregSort the left half
      right = mergeSort(right); // mergeSort the right half

      // merge them together into a new list, means call the merge function that we wrote!
      return merge(left, right);
    }
      // return that new list 
      //return list; //change this
  }


  public void msort(){
      data =  mergeSort(data);
  }
    
}//end of class