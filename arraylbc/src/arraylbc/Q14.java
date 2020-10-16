/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylbc;

import java.util.Arrays;
import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the no.of elements of array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int r=arr[n-2];
        System.out.println("Second largest element of an array " + r);
        int r1=arr[1];
        System.out.println("Second smallest element of an array " + r1);
    }
    
}
