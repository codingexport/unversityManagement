/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Akhilesh
 */
public class TeacherLeave extends JFrame implements ActionListener{
    
    JButton submit;
    JButton cancel;
    Choice cEmpId,ctime;
    JDateChooser dcdate;
   TeacherLeave() {
        setSize(500, 400);
        setLocation(550, 100);
        setLayout(null);
       

        getContentPane().setBackground(Color.white);

        JLabel heading = new JLabel("Apply Leave (Teacher)");
        heading.setBounds(40, 50, 300, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);

        JLabel lblrollno = new JLabel("Search by EmpId");
        lblrollno.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblrollno.setBounds(40, 100, 200, 30);
        add(lblrollno);

        cEmpId = new Choice();
        cEmpId.setBounds(240, 105, 150, 20);
        add(cEmpId);

        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from Teacher");
            while (rs.next()) {
                cEmpId.add(rs.getString("impolId"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        JLabel lbldate = new JLabel("Date");
        lbldate.setFont(new Font("Tahoma", Font.BOLD, 15));
        lbldate.setBounds(40, 140, 200, 30);
        add(lbldate);
        
      this.dcdate = new JDateChooser();
      this.dcdate.setBounds(100, 140, 150, 30);
      this.add(this.dcdate);
        
        JLabel lbltime = new JLabel("Time Duration");
        lbltime.setFont(new Font("Tahoma", Font.BOLD, 15));
        lbltime.setBounds(40, 180, 120, 30);
        add(lbltime);

        ctime = new Choice();
        ctime.setBounds(160, 185, 150, 20);
        ctime.add("Full day");
        ctime.add("half day");
        add(ctime);

      this.submit = new JButton("Submit");
      this.submit.setBounds(40, 250, 120, 30);
      this.submit.setBackground(Color.BLACK);
      this.submit.setForeground(Color.WHITE);
      this.submit.addActionListener(this);
      this.submit.setFont(new Font("Tahoma", 1, 15));
      this.add(this.submit);
      this.cancel = new JButton("Cancel");
      this.cancel.setBounds(200, 250, 120, 30);
      this.cancel.setBackground(Color.BLACK);
      this.cancel.setForeground(Color.WHITE);
      this.cancel.addActionListener(this);
      this.cancel.setFont(new Font("Tahoma", 1, 15));
      this.add(this.cancel);

         
        
         setVisible(true);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new TeacherLeave();
    }

    @Override
       public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String empId = cEmpId.getSelectedItem();
            String date = ((JTextField) dcdate.getDateEditor().getUiComponent()).getText();
            String duration = ctime.getSelectedItem();
            
            String query = "insert into TeacherLeave values('"+empId+"', '"+date+"', '"+duration+"')";
            
            try {
                conn c = new conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Leave Confirmed");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }


}
