/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylbc;

import java.util.Arrays;
import java.util.Scanner;
public class Q5 {
    public static void merge(int arr[],int arr2[],int n1,int n2,int arr3[]){
 int i=0,j=0,k=0;
 while(i<n1 && j<n2){
 if(arr[i]<arr2[j]){
 arr3[k++]=arr[i++];
 }
 else{
 arr3[k++]=arr2[j++];
 }
 }
 while(i<n1){
 arr3[k++]=arr[i++];
 }
 while(j<n2){
 arr3[k++]=arr2[j++];
 }
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n1,n2;

 System.out.println("Enter the size of first array");
 n1=sc.nextInt();
 int arr[]=new int[n1];
 System.out.println("Enter the elements of first array");
 for(int i=0;i<n1;i++){
 arr[i]=sc.nextInt();
 }
 System.out.println("Enter the size of second array");
 n2=sc.nextInt();
 int arr2[]=new int [n2];
 System.out.println("Enter the elements of second array");
 for(int i=0;i<n2;i++){
 arr2[i]=sc.nextInt();
 }
 int arr3[]=new int[n1+n2];
 merge(arr,arr2,n1,n2,arr3);
 Arrays.sort(arr3);
 for(int i=0;i<(n1+n2);i++){
 System.out.print(arr3[i] + " ");
 }
 }

    
}
