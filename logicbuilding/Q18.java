/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;

import java.util.Scanner;
public class Q18 {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("plz enter an string");
      String str;
      int l;
      str = sc.nextLine();
      str = str.toLowerCase();
      l = str.length();
      char ch;
      int a1;
      for(a1='a';a1<='z';a1++)
      {
          int count = 0;
         for(int i=0;i<l;i++)
         {
            ch = str.charAt(i);
            if(ch==a1)
            {
               count++; 
            }
         }
          
         if(count>0)
         {
             System.out.println("The Frequency of an no. is" + " " + a1 + " " + count);
         }
      }
        
      
    }
    
}
