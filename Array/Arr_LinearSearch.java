import java.util.*;

public class Arr_LinearSearch {
    public static int linearSearch ( char names[] , char key ) {
        for ( int i = 0 ; i < names.length ; i++ ) {
            if ( names[i] == key ) {
                return i ;
            }
        }
        return -1 ;

        
    }
    public static void main(String[] args) {
        
        char names[] = { 'a' , 'b' , 'c' , 'd' , 'e' , 'f' } ;
        char key = 'e' ;
        int index = linearSearch ( names , key ) ;
        if ( index == -1 ) {
            System.out.println("Element not found") ;
        }
        else {
            System.out.println("Element found at index: " + index ) ;
        }
        
    }
}
