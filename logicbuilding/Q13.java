/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;

import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        String s,s1;
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.println("Enter two strings");
        s = sc.nextLine();
        s1 = sc.nextLine();
        r = s.compareToIgnoreCase(s1);
        if(r==0){
            System.out.println("Same string");
        }
        else if(r>0){
            System.out.println(s + " Comes Later");
        }
        else
            System.out.println(s1 + " Comes Later");
    }
    
}
