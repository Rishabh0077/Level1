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
public class Q13 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter no.of elements of array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max,min;
        min = arr[0];
        for(int i=1;i<n;i++){
            min=Math.min(min, arr[i]);
        }
        max=arr[0];
        for(int i=1;i<n;i++){
            max=Math.max(max, arr[i]);
        }
        System.out.println("Minimum element of array " + min);
        System.out.println("Maximum element of aray " + max);
    }
    
}
