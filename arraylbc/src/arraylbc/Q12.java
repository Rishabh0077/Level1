/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylbc;

import java.util.Scanner;
public class Q12 {
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
        int c=0,e=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                e=e+arr[i];
                c++;
            }
        }
         System.out.println("Average of even integers is " + e/c);
        
}
}     
