import java.util.*;

public class ArrsumSubarray{
    public static void subarrays (int numbers[]) {
        for ( int i = 0 ; i < numbers.length ; i++) {
            for ( int j=i ; j < numbers.length ; j++ ) {
                int sum =0 ;
                for ( int k =i ; k <=j ; k++) {
                    System.out.print( numbers[k] + " ") ;
                    sum += numbers[k] ;
                }System.out.println();
           
                System.out.println("The sum is : " + sum);
            }System.out.println();
        }System.out.println();
    }
     public static int sum (int numbers[]) {
        int currentSum = 0 ;
        int maxSum = Integer.MIN_VALUE ;
        for ( int i = 0 ; i < numbers.length ; i++) {
            currentSum = 0 ;
            for ( int j = i ; j < numbers.length ; j++ ) {
                currentSum += numbers[j] ;
                if ( currentSum > maxSum ) {
                    maxSum = currentSum ;
                }
            }
        }
        return maxSum ;
    }
    


     

    public static void main (String args[]) {
        int numbers[] = { 2 , 4 , 6 , 8 , 10 } ;
        subarrays ( numbers ) ;
        System.out.println("The maximum subarray sum is: " + sum ( numbers ) ) ;
    }

}
