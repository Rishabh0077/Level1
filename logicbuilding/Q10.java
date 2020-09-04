/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;

import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        String s;
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        System.out.println(s.substring(3));
    }
}
