/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author QuangAnh
 */
public class Student implements Serializable {

    String rollNo;
    String RegexRollNo = "[C][0-9]{7}";
    String fullname;
    String RegexFullname = "[A-Z]([a-zA-Z]){0,62}";
    String deskphone;
    String RegexDeskphone = "[0-9]{3}.[0-9]{6,7}";
    String cellphone;
    String RegexCellPhone = "[0-9]{10,11}";
    int Yearofbirth;
    String email;
    String RegexEmail = "^[a-zA-Z0-9-\\+]+(\\.[a-zA-Z0-9-]+)*@"+"[a-zA-Z0-9-]+(\\.[a-zA-Z0-9]+)*(\\[A-Za-z]{2,})$";

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDeskphone() {
        return deskphone;
    }

    public void setDeskphone(String deskphone) {
        this.deskphone = deskphone;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public int getYearofbirth() {
        return Yearofbirth;
    }

    public void setYearofbirth(int Yearofbirth) {
        this.Yearofbirth = Yearofbirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(this.rollNo + "\n" + this.Yearofbirth + "\n" + this.cellphone
                + "\n" + this.deskphone + "\n" + this.email + "\n" + this.fullname);
    }
    public void Regex(){
        Pattern p=Pattern.compile(RegexRollNo);
        Matcher m=p.matcher(rollNo);
        if(!m.matches()){
            System.err.println("Wrong RollNo!");
        }
        Pattern p1=Pattern.compile(RegexCellPhone);
        Matcher m1=p.matcher(cellphone);
        if(!m1.matches()){
            System.err.println("Wrong Cellphone!");
        }
        Pattern p2=Pattern.compile(RegexDeskphone);
        Matcher m2=p.matcher(RegexDeskphone);
        if(!m2.matches()){
            System.err.println("Wrong deskphone!");
        }
        Pattern p3=Pattern.compile(RegexEmail);
        Matcher m3=p.matcher(email);
        if(!m3.matches()){
            System.err.println("Wrong Email!");
        }
        Pattern p4=Pattern.compile(RegexFullname);
        Matcher m4=p.matcher(fullname);
        if(!m4.matches()){
            System.err.println("Wrong Fullname!");
        }
        if(this.Yearofbirth>1996){
            System.err.println("too Young!!");
        }else if(this.Yearofbirth<1970){
            System.err.println("Too old :((");
        }
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter RollNo:");
        this.rollNo = sc.nextLine();
        System.out.println("Enter Fullname:");
        this.fullname = sc.nextLine();
        System.out.println("Enter Deskphone:");
        this.deskphone = sc.nextLine();
        System.out.println("Enter Cellphone:");
        this.cellphone = sc.nextLine();
        System.out.println("Enter Email:");
        this.email = sc.nextLine();
        System.out.println("Enter YearOf birth:");
        this.Yearofbirth = sc.nextInt();
        

    }

}
