/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;

import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 names");
        String arr[]=new String[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextLine();
        }
        System.out.println("The names that starts with vowels are  ");
        for(int i=0;i<5;i++){
            char ch = Character.toLowerCase(arr[i].charAt(0));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                System.out.println(arr[i]);
        }
    }
    
}
