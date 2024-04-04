/**
 *
 * @author Akhilesh
 */
import java.awt.*;
//import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JButton login,Cancel;
    JTextField tfusername ;
    JPasswordField tfpassword;
    
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 20);
        lblusername.setForeground(Color.BLACK);
        add(lblusername);
          
        tfusername = new JTextField();
        tfusername.setBounds(120, 22, 150, 20);
        add(tfusername);

        JLabel lbpassword = new JLabel("Password");
        lbpassword.setBounds(40, 50, 100, 20);
        lbpassword.setForeground(Color.BLACK);
        add(lbpassword);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(120, 50, 150, 20);
        add(tfpassword);

        login = new JButton("Login");
        login.setBounds(40, 140, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        login.setFont(new Font("Tohona", Font.BOLD, 16));
        add(login);

        Cancel = new JButton("Cancel");
        Cancel.setBounds(180, 140, 120, 30);
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
        Cancel.addActionListener(this);
        Cancel.setFont(new Font("Tohona", Font.BOLD, 16));
        add(Cancel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,200,170);
        add(image);

        setSize(600, 300);
        setLocation(400, 250);
        setVisible(true);

    }
   
    public void actionPerformed(ActionEvent ae){
       
        if (ae.getSource() == login) {
            String username=tfusername.getText();
            String password=tfpassword.getText();
            
            
            String query="select*from login where username='"+username+"'and password='"+password+"'";
            try {
               conn c = new conn();
               ResultSet rs = c.s.executeQuery(query);
                if (rs.next()) {
                    setVisible(false);
                    new Project();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                    setVisible(false);
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        } else if(ae.getSource() == Cancel){
            setVisible(false);
        }
}

    public static void main(String args[]) {
        new Login();
    }

}
