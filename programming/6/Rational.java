import java.lang.Math.*;

/**
 * Rational class by Team BangPi
 * First Last
 * collaborators: Harrison Fung, Jenna Lin, Sam Lojacono
 */


/**
   class Rational
   An instance of this class will represent a rational number (p/q s.t. p,q ints && q!=0),
   and facilitate mathematical operations with another instance of class Rational.

   Basic level (complete all):
   - toString
   - default constructor
   - multiply
   - divide

   Intermediate level (complete Basic methods plus these methods):
   - floatValue
   - overloaded constructor

   Advanced level (complete Basic + Intermediate + these methods):
   -

*/


public class Rational
{
  // Instance variables aka attributes for numerator and denominator
  private int _numerator;
  private int _denominator;


  // default constructor (no parameters)
  // creates a new Rational with value 0/1
  public Rational()
  {
    /* YOUR ELEGANT CODE HERE */
    this._numerator = 0;
    this._denominator = 1;
  }


  // overloaded constructor
  // takes 2 parameters, one for the numerator, one for the denominator
  // if an invalid denominator is attempted, should print a message and set the number to 0/1
  public Rational( int n, int d )
  {
    //in the case that d is not zero
    if (d !=0)
    {
      this._numerator = n;
      this._denominator = d;  
    }
    else
    //in the case that d is zero
    { 
      this._numerator = 0;
      this._denominator = 1;
      //Rational r = new Rational();
      System.out.println("You entered an invalid denominator");
    }
  }


  // toString
  // returns a string representation of the rational number (formatting of your choice)
  public String toString()
  {
    /* YOUR ELEGANT CODE HERE */
    String fraction = this._numerator+"/"+this._denominator;
    return fraction;
  }


  // floatValue
  // returns floating point approximation of the number
  // uses the most precise floating point primitive
  public double floatValue()
  {
    /* YOUR ELEGANT CODE HERE */
    /*take the decimal value of the quotient and round it by a
    given number of digits*/
    /*will set the default number of digits to be 3 unless 
    method is edited with a parameter given*/
    return (double)this._numerator/this._denominator;
  }


  // // multiply
  // // takes a Rational parameter and multiplies it by this Rational
  // // does not return a value
  // // modifies this object
  // // does not modify input
  // // need not reduce
  public void multiply(Rational r)
  {
    /* YOUR ELEGANT CODE HERE */
    /*multiply across the equal signs, top times top,
    bottom times bottom*/
    int numerator_product = this._numerator*r._numerator;
    int denom_product = this._denominator*r._denominator;
    System.out.println(numerator_product+"/"+denom_product);
  }


  // // divide
  // // same as multiply, except operation is division
  public void divide(Rational r)
  {
    /* YOUR ELEGANT CODE HERE */
    /*in math, multiplying the first fraction by the RECIPROCAL
    of the second fraction is the same thing as dividing, so
    we can rewrite this as a product for both terms*/
    int numerator_quotient = this._numerator*r._denominator;
    int denom_quotient = this._denominator*r._numerator;

    if (r._numerator == 0){
      System.out.println("The denominator is invalid.");
    }
    System.out.println(numerator_quotient+"/"+denom_quotient);
  }

}//end class