/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;

import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        String day;
        System.out.println("Enter day");
        Scanner sc = new Scanner(System.in);
        day = sc.nextLine();
        if(day.equalsIgnoreCase("Monday"))
            System.out.println("Day No." + 1);
       
        else if(day.equalsIgnoreCase("Tuesday"))
            System.out.println("Dy No." + 2);
        else if(day.equalsIgnoreCase("Wednesday"))
            System.out.println("Dy No." + 3);
        else if(day.equalsIgnoreCase("Thursday"))
            System.out.println("Dy No." + 4);
        else if(day.equalsIgnoreCase("Friday"))
            System.out.println("Dy No." + 5);
        else if(day.equalsIgnoreCase("Saturday"))
            System.out.println("Dy No." + 6);
        else if(day.equalsIgnoreCase("Sunday"))
            System.out.println("Dy No." + 7);
        else
            System.out.println("Wrong Choice");
    }
    
}
