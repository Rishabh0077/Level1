/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;
import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        String s,r="";
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        s=" "+s;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch== ' '){
                r=r+ch;
                i++;
                ch=Character.toUpperCase(s.charAt(i));
            }
            else{
                ch=Character.toLowerCase(s.charAt(i));
            }
            r=r+ch;
        }
        System.out.println(r.substring(1));
        
    }
    
}
