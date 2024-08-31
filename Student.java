/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attendance_management;

/**
 *
 * @author Student
 */
public class Student {
    private int studentid;
    private String studentName;
    private String studentCnic;
    private String studentEmail;
    private Boolean studentAttendance;
    private String studentPass;
    private String studentRole;

    public Student(int studentid, String studentName, String studentCnic, String studentEmail, Boolean studentAttendance, String studentPass, String studentRole) {
        this.studentid = studentid;
        this.studentName = studentName;
        this.studentCnic = studentCnic;
        this.studentEmail = studentEmail;
        this.studentAttendance = studentAttendance;
        this.studentPass = studentPass;
        this.studentRole = studentRole;
    }
    

    public Student(String studentName, String studentCnic, String studentEmail, String studentPass, String studentRole) {
        this.studentName = studentName;
        this.studentCnic = studentCnic;
        this.studentEmail = studentEmail;
        
        this.studentPass = studentPass;
        this.studentRole = studentRole;
    }
    

    public Student(int studentid, String studentName, String studentCnic, String studentEmail,Boolean studentAttendance,String studentPass) {
        this.studentid = studentid;
        this.studentName = studentName;
        this.studentCnic = studentCnic;
        this.studentEmail = studentEmail;
        this.studentAttendance=studentAttendance;
        this.studentPass=studentPass;
    }

    public Student(String studentName, String studentCnic, String studentEmail,Boolean studentAttendance,String studentPass) {
        this.studentName = studentName;
        this.studentCnic = studentCnic;
        this.studentEmail = studentEmail;
        this.studentAttendance= studentAttendance;
        this.studentPass=studentPass;
    }

    public Student(String studentName, String studentCnic, String studentEmail,String studentPass) {
        this.studentName = studentName;
        this.studentCnic = studentCnic;
        this.studentEmail = studentEmail;
        this.studentPass=studentPass;
    }

    public Student(int studentid, String studentPass) {
        this.studentid = studentid;
        this.studentPass = studentPass;
    }
    

    

     public Student(){
        super();
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCnic() {
        return studentCnic;
    }

    public void setStudentCnic(String studentCnic) {
        this.studentCnic = studentCnic;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    public Boolean getStudentAttendance() {
        return studentAttendance;
    }

    public void setStudentAttendance(Boolean studentAttendance) {
        this.studentAttendance = studentAttendance;
    }

    public String getStudentPass() {
        return studentPass;
    }

    public void setStudentPass(String studentPass) {
        this.studentPass = studentPass;
    }

    public String getStudentRole() {
        return studentRole;
    }

    public void setStudentRole(String studentRole) {
        this.studentRole = studentRole;
    }
    

    @Override
    public String toString() {
        return "Student{"  + ", studentName=" + studentName + ", studentCnic=" + studentCnic + ", studentEmail=" + studentEmail +", studentAttendance=" + studentAttendance+",studentPass="+studentPass+",studentRole="+studentRole+'}';
    }
    
     
    
}
