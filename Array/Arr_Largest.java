import java.util.*;

public class Arr_Largest {

    public static int getLargest ( int numbers [] ) {
        int largest = Integer.MIN_VALUE ;
        for ( int i = 0 ; i < numbers.length  ;i++) {
            if ( largest < numbers[i] ) {
                largest = numbers[i] ;
            } 
        }
        return largest ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in ) ;
        int size ;
        System.out.print("Enter the size of the array: ") ;
        size = sc.nextInt() ;
        int numbers[] = new int [ size ] ;
        System.out.println("Enter the elements of the array: ") ;
        for ( int i = 0 ; i < size ; i++ ) {
            numbers[i] = sc.nextInt() ;
        }
        int largest = getLargest(numbers);
        System.out.println("The largest element in the array is: " + largest);
    }
}
