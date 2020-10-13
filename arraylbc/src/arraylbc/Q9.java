/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylbc;

import static arraylbc.Q8.binarySearch;
import java.util.Scanner;


public class Q9 {
    static void bubble(int arr[],int n){
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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
        bubble(arr,n);
        System.out.println("Array after sorting");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    } 
    
}
