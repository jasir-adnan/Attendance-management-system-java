/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attendance_management;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Student
 */
public class CP {
    static Connection con;
    public static Connection createC(){
        // load driver
        try{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        // create connection
        String user="root";
        String password= "Ravi@5798";
        String url="jdbc:mysql://localhost:3306/attendance";
        con=DriverManager.getConnection(url,user,password);
    } catch (Exception e){
    
    }
    return con;
}
}
