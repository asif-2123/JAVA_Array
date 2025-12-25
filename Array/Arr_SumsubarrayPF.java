import java.util.*;

public class Arr_SumsubarrayPF {
    public static void sumSubarray ( int numbers []) {
        int currSum =0 , mazSum = Integer.MIN_VALUE ;
        int prefix[] = new int [ numbers.length ] ;
        prefix [0] = numbers [0] ;

        // calculate prefix array
        for ( int i = 1 ; i < prefix.length ; i++ ) {
            prefix [i] = prefix [i-1] + numbers [i] ;
            System.out.print(prefix[i] + " ");
        }

        for ( int i=0 ; i < numbers.length ; i++) {
            for ( int j =i ; j < numbers.length ; j++){
                currSum = i == 0 ? prefix [j] : prefix [j] - prefix [i-1] ;
                if ( currSum>mazSum){
                    mazSum = currSum;
                }

                
            }        }System.out.println("The maximum subarray sum is: " + mazSum);
    }

    public static void main (String args[]) {
        int numbers[] = { 1 , -2 , 6 , -1 , 3 } ;
        sumSubarray ( numbers ) ;
    }
    
}
