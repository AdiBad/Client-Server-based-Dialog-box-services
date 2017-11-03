/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csmenu;

import java.awt.Color;
import java.awt.EventQueue;  
import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;  

public class MyOptionPane {  

   int MyOptionPan() {  
        JFrame frame = new JFrame("Input");
        Object result = JOptionPane.showInputDialog(frame, "Enter your choice :\n 1. Area of Circle\n 2. Area of rectangle\n "
                + "3. Convert string to uppercase\n 4. Convert string to lower case\n" +" 5. Find all vowels in string\n "+"-1. Quit\n");
        System.out.println(result);
        
      int h = Integer.valueOf((String) result);
   return h;
   }  

    public static void main(String[] args) {  
        
        EventQueue.invokeLater(new Runnable() {  
            @Override  
            public void run() {  
                MyOptionPane mOP = new MyOptionPane();  
                 int choice = mOP.MyOptionPan();
               System.out.println("User chose : "+choice);
               String rad = null;
                  Socket s;
                try {
                    s = new Socket("127.0.0.11",2000); 
                    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                    PrintStream ps=new PrintStream(s.getOutputStream());
                    
               switch(choice)
               {
                   case 1:     ps.println(1);
                               JFrame frame = new JFrame();
                               Object result = JOptionPane.showInputDialog(frame, "Enter radius:");
                               //rad ="1\n"+ result.toString();
                               rad=result.toString();
                               System.out.println(result+"\n"+rad);
                               ps.println(rad);
                               break;
                   case 2:     ps.println(2);
                               JTextField length = new JTextField();
                               JTextField breadth = new JTextField();
                               Object[] message={"Length  ", length, "Breadth ", breadth};
                               //result = JOptionPane.showInputDialog(frame, "Enter length:");
                               JOptionPane.showConfirmDialog(null, message, "Rectangle", JOptionPane.OK_CANCEL_OPTION);
                               ps.println(length.getText());
                               ps.println(breadth.getText());
                               
                               break;
                    case 3:    ps.println(3);
                               frame = new JFrame();
                               result = JOptionPane.showInputDialog(frame, "Enter string:");
                               rad = String.valueOf((String) result);
                               ps.println(rad);
                               break;
                    case 4:    ps.println(4);
                               frame = new JFrame();
                               result = JOptionPane.showInputDialog(frame, "Enter string:");
                               rad = String.valueOf((String) result);
                               ps.println(rad);
                               break;
                    case 5:    ps.println(5);
                               frame = new JFrame();
                               result = JOptionPane.showInputDialog(frame, "Enter string:");
                               rad = String.valueOf((String) result);
                               ps.println(rad);
                               break;
                    default:
                       break;
               }
            
              
		//String rad;
		//System.out.println("Enter radius of the circle ");
		//rad=br.readLine();
                //server s1;
                //s1 = new server();
		
		
		BufferedReader fs=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String result=fs.readLine();
                
                 UIManager UI=new UIManager();
                 UI.put("OptionPane.background", Color.blue);
                 UI.put("Panel.background", Color.green);
                 javax.swing.UIManager.put("OptionPane.font", new Font("Bookshelf Symbol 7", Font.BOLD, 30));
                 //UI.put("Panel.textColor", Color.blue);

                JOptionPane.showMessageDialog(null,result,"Result",JOptionPane.INFORMATION_MESSAGE);
		System.out.println("From Server : "+result);
		br.close();
		fs.close();	
		ps.close();
		s.close();
            
             } catch (IOException ex) {
                    Logger.getLogger(MyOptionPane.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
            
        });  
       // System.out.println("User chose : "+choice);
        
    }  
}