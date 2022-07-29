public class ExpressionTree{


    //You must write this method:
    //Calculate the value of the entire tree

    //example tree (1.0 + 2.0)
    public double evaluate(){
      //base case, one variable, return the value!
      if(isValue() == true){
          return value; //returns a double
      } else {
        //a recursive function has to call itself to be recursive!!!
        //so we must make a call to evaluate!
        return apply(left.evaluate(), right.evaluate(),operator);
      }
      //left.value --> won't work because value is a private variable.
    }

    //You must write this method:
    //Return a string representation of the tree
    //A value is just hte string of the value
    //An operation has parenthesis around
    //such as
    //"12.5"  //just a value
    //"(5.0-8.0)" //a tree with 2 value children
    //"(12.5*(5.0-8.0)) //a tree that is the product of the previous two example trees
    //"(((2.0+1.0)/(8.0*0.43)) - 1.0)" //a tree with more
    public String toString(){
      if (isValue()){
        return value+""; //force it to be a string!
      } else {
        return "(" + left.toString() + " " + operator + " " + right.toString() + ")"; //implicitly this calls left.toString() and right.toString
        //return " " + left + operator + right; //froce a string
      }
    }

  public String toStringPrefix(){//prefix
      if (isValue()){
        //return value+""; //force it to be a string! implicit cast to string
        return Double.toString(value); //the object double has a toString method.
      } else {
        return "(" + operator + " " + left.toStringPrefix() + " " + right.toStringPrefix() + ")";
        //this is recursive left.toStringPrefix() & rigth.toStringPrefix()
      }
  }


  private double value;
  private ExpressionTree left,right;
  private char operator;

  //Tree can be a value
  public ExpressionTree(double val){
   value = val;
   left = null;
   right = null;
  }

  //Tree can be an operator that connects two sub-trees
  public ExpressionTree(char op, ExpressionTree l, ExpressionTree r){
    operator = op;
    left = l;
    right =r;
  }

  //Return true when the node is a value, false when it is an operator
  //when the children are null, the current tree is a value
  private boolean isValue(){
    return left==null && right ==null;
  }

  //Return false when the node is a value, true when it is an operator
  private boolean isOperator(){
    return !isValue();
  }

  //To simplify things, you get a method to use to convert the
  //operator and two values into a result.
  private double apply(double a, double b, char op){
   if(op == '+'){
    return a+b;
   }else if(op == '-'){
    return a-b;
   }else if(op == '*'){
    return a*b;
   }else if (op =='^'){
    return Math.pow(a,b);
   }else{ //  if(op == '/'){ //or any invalid operators
    return a/b;
   }

  }

 }
