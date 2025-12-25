import java.util.*;

public class Arr_Search {
    public static int search( int nums[] , int target) {
        int left =0 ; int right= nums.length -1 ;

        while ( left <= right) {
            int mid = left + ( right - left) /2 ;

            if ( nums[mid] == target) {
                return mid ;
            }

            else if(nums[mid] < target) {
                left =mid + 1 ;
            }
            else {
                right = mid - 1 ;
            }
        }return -1 ;
    }

    public static void main ( String args[]) {
        Scanner sc = new Scanner ( System.in) ;
        System.out.println("Enter the size of array: ") ;
        int n = sc.nextInt() ;
        int nums[] = new int [n] ;
        System.out.println("Enter the elements of array in sorted order: ") ;
        for ( int i =0 ; i < n ; i++) {
            nums[i] = sc.nextInt() ;
        }
        System.out.println("Enter the target element to search: ") ;
        int target = sc.nextInt() ;

        int result = search (nums , target) ;

        if ( result == -1) {
            System.out.println("Invalid target ");
        }
        else {
            System.out.println("target found at index :"+ result) ;
        }
    }
    
}
