/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;

import java.util.Scanner;
public class wipro {
    public static void main(String[] args) throws Exception {
    FastReader sc = new FastReader();
//    int t = sc.nextInt();
//
//    for (int t1 = 0; t1 < t; ++t1) {

    String s[]= sc.nextLine().trim().split(" ");

    String k[] = new String[s.length];
    for(int i=0;i<s.length;++i)
    {
      int n = s[i].length();
      long sum=0;
      for(int j=0;j<=n/2;++j) {
        if (j != n - 1 - j && j<n-1-j) {
          sum += Math.abs(s[i].charAt(j) - s[i].charAt(n - 1 - j));
        }
        else if(j==n-1-j)
        {
          char ch=s[i].charAt(j);
          ch=Character.toLowerCase(ch);
          sum+=ch-96;
        }

      }

      k[i] = Long.toString(sum);

    }
    for (int i = 0; i < k.length; ++i) {
      System.out.print(k[i]);
    }

    }
    
}
