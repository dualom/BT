import javax.swing.*;	// for JFrame, JPabnel, JLabel, JTextField, 
import java.awt.*;		// for BorderLayout
import java.awt.event.*;
import java.io.*;
import java.util.*;

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
         for(int i = 0; i<64;i++){
            
            add(new JButtonz());
         }
      }
   }//end JPanelz
   public static void main(String[]args){
      Breakthrough bt = new Breakthrough();
   }//end main
}//end of Class Breakthrough