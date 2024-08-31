/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attendance_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Student
 */
public class AttendanceDao {

   public static boolean addStudentstoDB(Student st) {
         boolean f=false;
         try{  Connection con=CP.createC();
        // we need to fire query and store the variable st in database
        String q="Insert into students(Student_name,CNIC,Email,passkey) values(?,?,?,?)";
        PreparedStatement pstmt =con.prepareStatement(q); //query is not yet complete
        //set the values for parameters
        pstmt.setString(1, st.getStudentName());//int 1 is for firrst ?
        pstmt.setString(2, st.getStudentCnic());
        pstmt.setString(3, st.getStudentEmail());
        pstmt.setString(4, st.getStudentPass());
        // execute query
        pstmt.executeUpdate();
        f=true;
         }
         catch (Exception e){
             e.printStackTrace();
         }
        return f;
    }

    public static void displayStudents() {
        try{  
        Connection con=CP.createC();
        // we need to fire query and store the variable st in database
        String q="select * from students;";
       
        //Statement stmt = con.createStatement(q); //creating statemnet rather thjan preparing
        Statement stmt= con.createStatement();
        ResultSet set=stmt.executeQuery(q);// we execute query when we want to retrieve smth from database and we use ResultSet to get queries
        
        while(set.next()){
            int id=set.getInt(1); //passing first column (consists of id)
            String Student_name=set.getString(2);
            String CNIC=set.getString(3);
            String Email=set.getString(4);
            boolean attendance=set.getBoolean(5);
            String passkey=set.getString(6);
            
            System.out.println("ID: "+ id);
            System.out.println("User Name: "+Student_name);
            System.out.println("CNIC: "+CNIC);
            System.out.println("Email: "+ Email);
            System.out.println("Attendance: "+attendance);
            System.out.println("Passkey: "+passkey);
            System.out.println("+++++++++++++++++++++++++++++++");
        }
        // execute query
        
        
        
    } catch(SQLException e){
        e.printStackTrace();
    }
    }

    static boolean addAttendance(int userId) {
        boolean f=false;
      try{  Connection con=CP.createC();
        // we need to fire query and store the variable st in database
        String q="update students set attendance=? where ID=?";
        PreparedStatement pstmt =con.prepareStatement(q); 
        pstmt.setBoolean(1, true);
        pstmt.setInt(2, userId);
        pstmt.executeUpdate();
        f=true;
    }catch (Exception e){
          e.printStackTrace();
      }
        return f;}

    static boolean updateStudent(Student st) {
       boolean f=false;
       try{  Connection con=CP.createC();
        // we need to fire query and store the variable st in database
        String q="update students set Student_name=?,CNIC=?,Email=?, attendance=? ,passkey=? where ID=?";
        PreparedStatement pstmt =con.prepareStatement(q); 
        
        pstmt.setString(1,st.getStudentName());
        pstmt.setString(2,st.getStudentCnic());
        pstmt.setString(3,st.getStudentEmail());
        pstmt.setBoolean(4, st.getStudentAttendance());
        pstmt.setString(5, st.getStudentPass());
        pstmt.setInt(6, st.getStudentid());
        
        pstmt.executeUpdate();
        f=true;
        
    }catch (Exception e){
          e.printStackTrace();
      }
        return f;}

    static boolean deleteStudentToDB(int userId) {
        
        boolean f=false;
      try{  Connection con=CP.createC();
        // we need to fire query and store the variable st in database
        String q="delete from students where ID=?";
        PreparedStatement pstmt =con.prepareStatement(q); //query is not yet complete
        //set the values for parameters
        pstmt.setInt(1, userId);//int 1 is for firrst ?
        
        // execute query
        pstmt.executeUpdate();
        f=true;
        
    } catch(Exception e){
        e.printStackTrace();
    }
       return f;
        
    }

  public static String Student(Student login) {
        
         try{  
        Connection con=CP.createC();
        // we need to fire query and store the variable st in database
        String q="SELECT role from students where ID= ? AND passkey= ?";
        
        
        PreparedStatement pstmt =con.prepareStatement(q);
       
        pstmt.setInt(1,login.getStudentid());
        pstmt.setString(2,login.getStudentPass());
        
        ResultSet resultset=pstmt.executeQuery();
        if(resultset.next()){
            
        String role=resultset.getString("role");
       return role;
        }
        
    }catch (Exception e){
          e.printStackTrace();
      }
        return null;}

    }
    
    




    

