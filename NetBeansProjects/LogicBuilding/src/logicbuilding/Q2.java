/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        String name1,name2,name3,shortname;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        name1 = sc.next();
        System.out.println("Enter Second Name");
        name2 = sc.next();
        System.out.println("Enter Third Name");
        name3 = sc.next();
        System.out.println("Name: " + name1 +" " + name2 +" " + name3);
        shortname = name1.charAt(0) + " " + name2.charAt(0) +" " + name3.charAt(0) +" ";
        System.out.println("Shortname " + shortname);
    }
    
}
