/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package attendance_management;

import java.util.Scanner;
//import javax.swing.JOptionPane;

/**
 *
 * @author Student
 */
public class AttendanceManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Please enter your user ID: ");
        int user_id=scanner.nextInt();
        System.out.println("Please enter your pass key: ");
        scanner.nextLine();
        String pass_key=scanner.nextLine();
        Student login=new Student(user_id,pass_key);
        
        String role=AttendanceDao.Student(login);
        
        if (role!= null){
            if (role.equals("Admin")){
        while (true){
        
            System.out.println("WELCOME ADMIN!");
            System.out.println("press 1 to add students: ");
            System.out.println("press 2 to display students: ");
            System.out.println("press 3 to mark attendance: ");
            System.out.println("press 4 to update student ");
            System.out.println("press 5 to delete student: ");
            System.out.println("press 6 to exit app: ");
            int num=scanner.nextInt();
            
            if (num==1){
                System.out.println("enter username: ");
                
                scanner.nextLine();
                String name= scanner.nextLine();
                
                System.out.println("enter Cnic: ");
                String cnic= scanner.nextLine();
                
                System.out.println("enter email: ");
                String email=scanner.nextLine();
                
                System.out.println("enter passkey: ");
                String passkey=scanner.nextLine();
                
               
                
                Student st=new Student(name,cnic, email, passkey);
                boolean answer=AttendanceDao.addStudentstoDB(st);
                if(answer){
                    System.out.println("student has been added successfully");
                } else {
                    System.out.println("Something went wrong. Please try again");
                }
                System.out.println(st);
            }
            else if (num==2){
                System.out.println("Displaying students");
                AttendanceDao.displayStudents();
            }
            else if(num==3){
                System.out.println("Enter Student ID for which you want to mark attendance: ");
                scanner.nextLine();
                int userId =scanner.nextInt();
                boolean answer=AttendanceDao.addAttendance(userId);
                if (answer){
                    System.out.println("Attendace has been marked successfully");
                }
            }
                else if (num==4){
                    System.out.println("Enter student ID which you want to update");
                    scanner.nextLine();
                    int userId =scanner.nextInt();
                    System.out.println("enter Student name: ");
                
                scanner.nextLine();
                String name= scanner.nextLine();
                
                System.out.println("enter CNIC: ");
                
                String CNIC= scanner.nextLine();
                
                System.out.println("enter Email: ");
                scanner.nextLine();
                String Email=scanner.nextLine();
                
                System.out.println("Mark attendace: true or false");
                boolean attendance=scanner.nextBoolean();
                
                System.out.println("enter passkey: ");
                String passkey=scanner.nextLine();
               
                
                
                Student st=new Student(userId, name, CNIC,Email,attendance,passkey);
                boolean answer=AttendanceDao.updateStudent(st);
                if (answer){
                    System.out.println("Student has been updated successfully");
                }
                }
                else if(num==5){
                    System.out.println("Enter user id: ");
                scanner.nextLine();
                int userId =scanner.nextInt();
               
                boolean answer= AttendanceDao.deleteStudentToDB(userId);
                if (answer){
                    System.out.println("Student was deleted successfully");
                }
                
                } 
                
                else if (num==6){
                      break;

                   
               }
            else {
                
       
            }
            
          System.out.println("Thankyou");
          
          
        }}  else if(role.equals("Student")){
                
                System.out.println("press 1 to mark attendance: ");
                int num=scanner.nextInt();
                
                if(num==1){
                System.out.println("Enter Student ID for which you want to mark attendance: ");
                scanner.nextLine();
                int userId =scanner.nextInt();
                boolean answer=AttendanceDao.addAttendance(userId);
                if (answer){
                    System.out.println("Attendace has been marked successfully");
                }
                
      }  else{
                System.out.println( "Wrong credentials, Please try again");
               }}
        else{
            
        }
        
        }
}
}
    