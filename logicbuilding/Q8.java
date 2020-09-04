/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;

import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String s;
        s=sc.nextLine();
        String a="";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch))
                ch=Character.toLowerCase(ch);
            else
                ch=Character.toUpperCase(ch);
            a=a+ch;
        }
        System.out.println(a);
    }
}
