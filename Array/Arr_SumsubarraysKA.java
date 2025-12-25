import java.util.*;

public class Arr_SumsubarraysKA {

    public static void kadane ( int numbers []) {
        int maxSum =Integer.MIN_VALUE , currSum =0 ;
        for ( int i =0 ; i < numbers.length ; i++ ) {
            currSum += numbers [i] ;
            
            if ( currSum < 0 ) {
                currSum =0 ;
            }
            maxSum = Math.max ( currSum , maxSum ) ;
        }
        
        System.out.println("The maximum subarray sum is: " + maxSum);
        
    }
    
    public static void main (String args[]) {
        int numbers[] = { -2 , -3 , 4 , -1 , -2 , 1 , 5 , -3 } ;
        kadane ( numbers ) ;

    }
}
