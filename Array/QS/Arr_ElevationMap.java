import java.util.* ;    

public class Arr_ElevationMap {

    public static int trap ( int height []) {
        int n= height.length ;

        int leftMax[] = new int [n] ;
        leftMax[0] = height[0] ;
        for ( int i= 1 ; i <n ; i++) {
            leftMax[i] = Math.max( height[i] , leftMax[i-1]) ;
        }

        int rightMax[] = new int [ n ] ;
        rightMax[n-1] = height [n-1] ;
        for (int i=n-2 ; i >= 0 ; i--) {
            rightMax[i] = Math.max ( rightMax[i+1] , height[i]) ;
        }

        int trappedwater = 0 ;
        for ( int i=0 ; i <n ; i++) {
            int waterLevel = Math.min ( leftMax[i] , rightMax[i]) ;
            trappedwater += waterLevel - height[i] ;
        }
        return trappedwater ;
    }
    public static void main ( String args[] ) {
        Scanner sc = new Scanner ( System.in ) ;
        System.out.print("Enter the size of the array: ") ;
        int size = sc.nextInt() ;
        int height [] = new int [ size ] ;
        System.out.println("Enter the elements of the array: ") ;
        for ( int i =0 ; i < size ; i ++) {
            height [i] = sc.nextInt() ;
        }
        System.out.println("The total trapped water is: " + trap ( height ) ) ;
    }
    
}
