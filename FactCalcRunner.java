/**
 * Write a description of class WhileLoopRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FactCalcRunner
{
    public static void main (String [] args){
        int n1 = 10;
        
        FactCalc fc = new FactCalc();
        System.out.println ("Number = " + n1);
        System.out.println ("The factorial of " + n1 + " is: " +fc.factorial(n1)); 
    }
}