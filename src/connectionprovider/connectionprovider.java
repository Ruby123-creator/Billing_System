/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectionprovider;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruby
 */
public class connectionprovider {
  public static Connection getCon(){
      try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdetails","root","Ru01#123pal");
         return con;
      }
      catch(Exception e){
          JOptionPane.showMessageDialog(null,e.toString());
          return null;
      }
  }  
}
