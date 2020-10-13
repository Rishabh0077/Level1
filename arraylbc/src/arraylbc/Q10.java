/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylbc;

import static arraylbc.Q9.bubble;
import java.util.Scanner;

/**
 *
 * @author Neeraj Mishra
 */
public class Q10 {
    static void selection(int arr[],int n){
        for (int i = 0; i < n-1; i++) 
        { 
            
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    }
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
        selection(arr,n);
        System.out.println("Array after sorting");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
                      
    } 
    
}
