/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;

import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        String s1;
        System.out.println("Enter first string");
        Scanner sc = new Scanner(System.in);
        s1=sc.nextLine();
        String s2;
        System.out.println("Enter second string");
        Scanner sx = new Scanner(System.in);
        s2=sx.nextLine();
        String s3;
        System.out.println("Enter third string");
        Scanner se = new Scanner(System.in);
        s3=sx.nextLine();
   System.out.println(s1.equals(s2));  
   System.out.println(s1.equalsIgnoreCase(s2));
   System.out.println(s1.compareTo(s2));  
   System.out.println(s1.compareTo(s3));
   System.out.println(s3.compareTo(s1));
   
    }
    
}
