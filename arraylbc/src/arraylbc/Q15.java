/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylbc;

import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the no.of elements of an array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Prime numbers present in the array");
        for(int i=0;i<n;i++){
            int j=2;
            int p=1;
            while(j<arr[i]){
                if(arr[i]%j==0){
                    p=0;
                    break;
                }
                j++;
            }
            if(p==1){
                System.out.print(" " + arr[i]);
            }
            
        }
    }
}
