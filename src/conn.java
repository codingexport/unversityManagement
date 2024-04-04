/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author Akhilesh
 */
public class conn {

    /**
     * @param args the command line arguments
     */
    Connection c;
    Statement s;
    
      conn() {
          try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              c = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem","root","akhil8127798282");
              s = c.createStatement();
          }
          catch(Exception e){
              e.printStackTrace();
          }
      }
    
    public static void main(String args[]) {
        // TODO code application logic here
        new conn();
    }
}
/*
connecting jdbc
1.Register the Driver Class
2.Creating Connection String
3.Creating Statement
4.Executing Mysql Queries
5.Closing the Connection(optional)
*/
