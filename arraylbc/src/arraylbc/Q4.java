/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylbc;

import java.util.Scanner;
public class Q4 {
    static void reverse(int arr[],int s,int e){
 int t;
 while(s<e){
 t=arr[s];
 arr[s]=arr[e];
 arr[e]=t;
 s++;
 e--;
 }
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n;
 System.out.println("Enter the no.of elements of array ");
 n=sc.nextInt();
 int arr[]=new int[n];
 System.out.println("Enter the elements of array ");
 for(int i=0;i<n;i++){
 arr[i]=sc.nextInt();
 }
 reverse(arr,0,n-1);
 for(int i=0;i<n;i++){
 System.out.print(arr[i] + " ");
 }
 }
    
}
