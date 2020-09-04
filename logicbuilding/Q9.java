/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;

import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the string");
        s=sc.nextLine();
        String s1="";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            s1=ch+s1;
        }
        if(s.equals(s1)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not pallindrome");
        }
    }
}
