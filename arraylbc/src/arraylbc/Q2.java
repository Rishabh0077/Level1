/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylbc;

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n;
 n=sc.nextInt();
 int s=0;
 int arr[]=new int[n];
 for(int i=0;i<n;i++){
 arr[i]=sc.nextInt();
 s=s+arr[i];
 }
 System.out.println("average of numbers of array " + s/n);
 }

}
