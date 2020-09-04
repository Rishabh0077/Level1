/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;

/**
 *
 * @author Neeraj Mishra
 */
public class Q14 {
    public static void main(String[] args) {
        String s1 = "15 august is independence day";
        System.out.println(s1);
        String s2 = s1.replace("15", "26");
        String s3 = s2.replace("august", "january");
        String s4 = s3.replace("independence", "republic");
        System.out.println(s4);
    }
    
}
