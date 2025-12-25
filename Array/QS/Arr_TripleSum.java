import java.util.*;

public class Arr_TripleSum {
    public static int tripleSum ( int numbers[] , int target) {
        
        int count =0 ;
        for ( int i =0 ; i < numbers.length -2 ; i++) {
            for ( int j = i+1 ; j < numbers.length -1 ; j++) {
                for ( int k = j+1 ; k < numbers.length ; k++) {
                    if ( numbers [i] + numbers [j] + numbers [k] == target) {
                        count++ ;
                    }
                }
            }
        }
    }
    public static void main ( String args[] ) {
        Scanner sc = new Scanner ( System.in ) ;
        System.out.print("Enter the size of the array: ") ;
        int size = sc.nextInt() ;
        int numbers [] = new int [ size ] ;
        System.out.println("Enter the elements of the array: ") ;
        for ( int i =0 ; i < size ; i ++) {
            numbers [i] = sc.nextInt() ;
        }
        System.out.print("Enter the target sum: ") ;
        int target = sc.nextInt() ;

        System.out.println("The number of triplets with sum " + target + " is: " + tripleSum ( numbers , target) ) ;
    }
              
}
