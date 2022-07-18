import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("Chris");
    l.add("Kate");
    l.add("Shana");
    System.out.println(l);
    for (int i =0; i<4; i++){
      System.out.println("Value at index " + i + ": " + l.get(i));
    }    
  }
}