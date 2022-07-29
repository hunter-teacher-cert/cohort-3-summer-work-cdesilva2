 public class Test{
  public static String concat(String a, String b){
    return a + " " + b;
  }
  
  public static void main(String[]args){
    System.out.println(concat("hello", "world")); // hello world
    System.out.println(concat("hello", concat("happy", "birthday"))); //run on console
    System.out.println(concat("hello", concat("happy", concat("birthday", "Chris")))); //run on console

  }
}