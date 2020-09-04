/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;

import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        s = sc.nextLine();
        s = s.toLowerCase();
        if(s.startsWith("mr "))
            System.out.println("Male");
        else if(s.startsWith("miss "))
            System.out.println("Female");
        else if(s.startsWith("mrs "))
            System.out.println("Married Female");
        else if(s.startsWith("Kumari M"))
            System.out.println("Un-married Female");
        else
            System.out.println("Cannot determine");
            
    }
    
}
