import javax.swing.*;	// for JFrame, JPabnel, JLabel, JTextField, 
import java.awt.*;		// for BorderLayout
import java.awt.event.*;
import java.io.*;
import java.util.*;
/*
chris is stupid
*/
public class Breakthrough extends JFrame{
 static JButton [][] butts = new JButton[8][8];
   public Breakthrough(){
         add(new JPanelz());
         pack();
         setVisible(true);
   }
   class JButtonz extends JButton{
      
   }
   
   class JPanelz extends JPanel{
      public JPanelz(){
         setLayout(new GridLayout(8,8));
         for(int i = 0; i<8;i++){
            for (int j = 0; j <8;i++){
            
            }//end j for loop
         }//end i for loop
           // add(new JButtonz());
     }//end JPanelz Constructor
   }//end JPanelz
   public static void main(String[]args){
      Breakthrough bt = new Breakthrough();
   }//end main
}//end of Class Breakthrough