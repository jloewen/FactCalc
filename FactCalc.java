
/**
 * Write a description of class WhileLoop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FactCalc
{
    public int result;
    
    public FactCalc(){
        
    }
    
    public int factorial(int n){
        result = 1;
        while(n > 0){
            result = result*n;
            n--;
        }
        return result;
        }
}
