/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;

import java.applet.Applet;  
import java.awt.Color;
import java.awt.Graphics; 
public class applet extends Applet{
    public void paint(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillOval(40,40,120,150);    
g.setColor(Color.pink);
g.fillOval(60,75,20,30);
g.fillOval(115,75,20,30);
g.setColor(Color.black); 
g.drawArc(60,110,80,55,180,180);
g.drawLine(135,139,145,137);
g.drawLine(65,138,55,136);
g.fillOval(27,92,15,30);
g.fillOval(158,92,15,30);
g.drawLine(90,125,97,110);
g.drawLine(90,125,103,125);
g.drawLine(97,110,103,125);
    }
   
}
