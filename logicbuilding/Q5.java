/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        int n,i;
        String a;
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        n=1;
        for(i=0;i<a.length();i++){
            if(a.charAt(i)==' ')
                n++;
        }
        System.out.println("The no.of words in string are " + n);
    }
    
}
