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
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setVisible(true);
   }
   class JButtonz extends JButton{
      
   }
   
   class JPanelz extends JPanel{
      public JPanelz(){
         setLayout(new GridLayout(8,8));
         for(int i = 0; i< 8;i++){
            for (int j = 0; j < 8;j++){
               butts[i][j] = new JButtonz();
               add(butts[i][j]);
               butts[i][j].addActionListener(new ActionListener(){
                  final int i = 0;
                  final int j = 0;
                  public void actionPerformed(ActionEvent ae){
                  
                     System.out.println(String.indexOf(butts[i][j]));
                  }
               });
            }//end j for loop
            
         }//end i for loop
         
     }//end JPanelz Constructor
   }//end JPanelz
   public static void main(String[]args){
      Breakthrough bt = new Breakthrough();
   }//end main
}//end of Class Breakthrough