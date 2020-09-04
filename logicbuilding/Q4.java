/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;

import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        int n,i;
        String a;
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        a.toLowerCase();
        n=0;
        for(i=0;i<a.length();i++){
            if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u' )
                n++;
        }
        System.out.println(n);
    }
    
}
