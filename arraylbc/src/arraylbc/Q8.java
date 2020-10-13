/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylbc;

import java.util.Scanner;

/**
 *
 * @author Neeraj Mishra
 */
public class Q8 {
    static int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r>=l) 
        { 
            int mid = l + (r - l)/2; 
   
            // If the element is present at the  
            // middle itself 
            if (arr[mid] == x) 
               return mid; 
   
            // If element is smaller than mid, then  
            // it can only be present in left subarray 
            if (arr[mid] > x) 
               return binarySearch(arr, l, mid-1, x); 
   
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid+1, r, x); 
        } 
   
        // We reach here when element is not present 
        //  in array 
        return -1; 
    } 
   
    // Driver method to test above 
    public static void main(String args[]) 
    { 
         
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter no.of elements of array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to search");
        int x = sc.nextInt();
        int result = binarySearch(arr,0,n-1,x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " +  
                                                 result); 
    } 
    
    
}
