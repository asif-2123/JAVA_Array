import java.util.*; 

public class Arr_SumsubarrayBF {
    public static void subarraySum ( int numbers [] ) {
        int currentSum =0 , maxSum = Integer.MIN_VALUE ;
        for ( int i=0 ; i < numbers.length ; i++) {
            for ( int j =i ; j < numbers.length ; j++){
                currentSum =0 ;
                for ( int k = i ; k <= j ; k++ ) {
                    currentSum += numbers[k];
                }    
                System.out.println(currentSum);
                if ( currentSum>maxSum){
                    maxSum = currentSum;
                }

                
            }
        }System.out.println("The maximum subarray sum is: " + maxSum);
    }
    public static void main (String args[]) {
        int numbers[] = { 1 , -2 , 6 , -1 , 3 } ;
        subarraySum ( numbers ) ;
    }
    
}
