/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;

import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Plz Enter any Sentences");
        int l,count=0;
        char ch;
        String st = " ";
        String str =sc.nextLine();
        str = str + " ";
        l= str.length();
        System.out.println("The Sentence is Greater than 5 words");
        for(int i =0;i<l;i++)
        {
          ch = str.charAt(i);
          if(ch!= ' ')
          {
              st = st + ch; 
          }
          else
          {
              if(st.length()>=5)
              {
                  System.out.println(st);
              }
              
              st = "";
          }
          
          
        }
    }
    
}
