import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {

  

 //      // Uncomment these to test part 1
	
	// SortSearch ss = new SortSearch(20);
	// System.out.println("\nThis is the random array: \n" + ss +"\n");
	
		
	// // Uncomment these to test part 2

	// int i;
	// i = ss.findSmallestIndex(0);//zero determines the index to start searching
	// System.out.println("This is findSmallestIndex (starting from index 0): \n"+"ss["+ i +"] = "+ss.get(i)+" : \n" + ss +"\n");

	// i = ss.findSmallestIndex(15);
	// System.out.println("This is findSmallestIndex (starting from index 15): \n" +"ss["+ i + "] = "+ss.get(i)+" : \n" + ss);
	
	// // Uncomment these to test part 3

	// System.out.println("\nThis is the original random array:\n" +ss);
	// ss.sort();
	// System.out.println("\n" + "This is the array sorted:\n" +ss);

 //  //Linear Search
 //  System.out.println("\n" + "This is linearSearch looking for the index of value 3: " +ss.linearSearch(3));
 //  System.out.println("This is linearSearch looking for the index of value 8: " +ss.linearSearch(8));
 //  System.out.println("This is linearSearch looking for the index of value 0: " +ss.linearSearch(0));


 //  //Binary Search
 //  System.out.println("\n" +"This is binary search looking for the index of value 5: " + ss.binarySearch(5));

 //  System.out.println("This is binary search looking for the index of value 9: " + ss.binarySearch(9));

 //  System.out.println("This is binary search looking for the index of value 12: " + ss.binarySearch(12));

 //  System.out.println("This is binary search looking for the index of value 15: " + ss.binarySearch(15));
      
  //this shows that sort is exponential, that the larger the array size, the longer it takes to run/compile
 //  int size = 1000;//ran it with 1000, 10000, and 100000 and compared the elapsed time

	// SortSearch ss2 = new SortSearch(size);

	// // printing is really slow so we don't want
	// // to print when testing time.
	// // System.out.println(ss);
		
	// long start,elapsed;

	// start = System.currentTimeMillis();
	// ss2.sort();

	// // System.out.println(ss);
	// elapsed = System.currentTimeMillis() - start;
	// System.out.println("\nSize: " + size + " Time: " + elapsed);

  //testing the merge of two sorted arrays
 //  int size = 1000;
 //  SortSearch ss = new SortSearch(size);

 //  ArrayList<Integer> list1 = ss.buildIncreasingList(4);
	// System.out.println(list1);

	// // build a second Arralist here
	// ArrayList<Integer> list2 = ss.buildIncreasingList(6);
 //  System.out.println(list2);


	// // test your merge routine here
	// ArrayList<Integer> list3 = ss.merge(list1, list2 );
 //  System.out.println(list3);

    int size = 5;
    SortSearch ss = new SortSearch(size);
    System.out.println(ss); //prints unsorted array
    ss.msort(); //does the merge sort of this array.
    System.out.println(ss); //prints array after it is sorted
  }
}