import java.util.*; 

public class Arr_Reverse {
    public static void reverse(int numbers[] ) {
        int start = 0 , last = numbers.length-1 ;
        while ( start < last ) {
            int temp = numbers[start] ;
            numbers[start] = numbers[last] ;
            numbers[last] = temp ;
            start++ ;
            last-- ;
        }
    }

    public static void main (String args []) {
        int numbers[] = { 1 , 2 , 3 , 4 , 5 } ;
        reverse ( numbers ) ;
        for (int i = 0 ; i < numbers.length ; i++ ) {
            System.out.print( numbers[i] + " " ) ;
        }
        System.out.println();


    }
    
}
