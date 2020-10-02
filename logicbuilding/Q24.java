/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;

import java.util.Scanner;
public class Q24 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       String country[] ={"india","France","usa","brazil","china"};
       String wonder[] = {"tajmahal","afieltower","liberty","football","the great wall of china"};
       String cn;
       int i;
        System.out.println("..........Enter any country name is to be serach........");
        cn = sc.nextLine();
       for( i =0 ;i<7 ;i++)   
       {
        if(country[i].equalsIgnoreCase(cn))
        {
            System.out.println(wonder[i]);
        }
       }
    } 
    
}
