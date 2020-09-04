/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;

import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        String any;
        int i,u;
        u=0;
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        any=sc.next();
        for(i=0;i<any.length();i++){
            if (Character.isUpperCase(any.charAt(i))) u++;
        }
        System.out.println(u);
        
}
    
}
