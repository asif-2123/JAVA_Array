import java.util.* ;

public class Arr_Price {
    public static int maxPrice ( int prices []) {
        int buy =Integer.MAX_VALUE ;
        int maxProfit = 0 ;

        for ( int i = 0 ; i< prices.length ; i ++) {
            if ( prices [i] > buy) {
                int profit = prices[i] - buy ;
                maxProfit = Math.max( profit , maxProfit ) ;
            }
            else {
                buy = prices [i] ;
            }
        }
        return maxProfit ;
    }

    public static void main ( String args[] ) {
        Scanner sc = new Scanner ( System.in ) ;
        System.out.print("Enter the size of the array: ") ;
        int size = sc.nextInt() ;
        int prices [] = new int [ size ] ;
        System.out.println("Enter the elements of the array: ") ;
        for ( int i =0 ; i < size ; i ++) {
            prices [i] = sc.nextInt() ;
        }
        System.out.println("The maximum profit is: " + maxPrice ( prices ) ) ;
    }
    
}
