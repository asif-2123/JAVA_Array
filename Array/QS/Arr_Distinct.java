import java.util.Scanner ;

public class Arr_Distinct {

    public static boolean printDistinct ( int numbers[]) {
        for ( int i =0 ; i < numbers.length-1 ; i ++) {
            for( int j = i+1 ; j < numbers.length ; j++) {
                if ( numbers [i] == numbers [j]) {
                    return false ;
                }
               
            }
        } return true ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in ) ;
        int size ;
        System.out.print("Enter the size of the array: ") ;
        size = sc.nextInt() ;
        int numbers[] = new int [ size ] ;
        System.out.println("Enter the elements of the array: ") ;
        for ( int i= 0 ; i <size ; i++) {
            numbers[i]= sc.nextInt() ; 
        }
        System.out.println("Is every element is distinct? " +    printDistinct ( numbers ) ) ;

    }
    
}
