/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylbc;

import java.util.Scanner;
public class Q6 {
    static int search(int arr[],int n){
 for(int i=0;i<10;i++){
 if(arr[i]==n)
 return i;
 }
 return -1;
}
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int arr[]=new int[10];
 System.out.println("Enter the elemets of array");
 for(int i=0;i<10;i++){
 arr[i]=sc.nextInt();
 }
 int n;
 System.out.println("Enter the element to search");
 n=sc.nextInt();
 int i=search(arr,n);
 if(i==-1){
 System.out.println("Element not found");
 }
 else
 System.out.println("Element found at position " + i);
 }
}
