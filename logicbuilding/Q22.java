/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;

import java.util.Scanner;
public class Q22 {
    public static void main(String[] args) {
        System.out.println("------Plz enter any String-------");
        Scanner sc = new Scanner(System.in);
        String w="";
        char ch;
        int w1,j;
        String str = sc.nextLine();
        str = str + " ";
        
        for(int i =0 ; i< str.length();i++)
        {
            ch = str.charAt(i);
            if(ch!= ' ') 
            {
              w = w + ch;  
            }
            else
            {
                 w1 = w.length();
                for( j =0 ; j<w1-1;j++)
                {
                    if(w.charAt(j) == w.charAt(j+1))
                    {
                        break;
                        
                    }
                }
                    if(j<w1-1)
                    {
                        System.out.println(w);
                    }
                    w = "";
                }
            
        }
    }
}
