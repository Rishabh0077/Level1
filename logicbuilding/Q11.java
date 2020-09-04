/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;

import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        String s;
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        int i,p=0;
        for(i=0;i<s.length();i++){
            s.toLowerCase();
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                break;
            }
        }
        //if(p==0)
            //System.out.println(s);
        //else
            System.out.println("Piglatin word " + s.substring(i) + s.substring(0, i) + "ay");
    }
}
