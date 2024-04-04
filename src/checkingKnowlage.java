/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Akhilesh
 */
public class checkingKnowlage extends JFrame {
    
    
     checkingKnowlage(){
         setSize(400,300);
         setLocation(450, 200);
         setLayout(null);
  
         JLabel name = new JLabel("Name");
         name.setBounds(40, 40, 50, 50);
         add(name);    
         
         JTextField username = new JTextField();
         username.setBounds(140,55,100,20);
         add(username);      
         setVisible(true);
                 
         JButton  tLogin = new JButton("Login");
         tLogin.setBounds(40,155,100,30);
         tLogin.setBackground(Color.BLACK);
         tLogin.setForeground(Color.WHITE);
         add(tLogin);
         
         JButton  tCancel = new JButton("Cancel");
         tCancel.setBounds(150,155,100,30);
         tCancel.setBackground(Color.BLACK);
         tCancel.setForeground(Color.WHITE);
         add(tCancel);
         
         JLabel passWord = new JLabel("Password");
         passWord.setBounds(40, 80, 150, 50);
         add(passWord);
         JTextField password = new JPasswordField();
         password.setBounds(140,95,100,20);
         add(password);
         setVisible(true);
         
         
     }
     
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new checkingKnowlage();
        // TODO code application logic here
    }

 
}
