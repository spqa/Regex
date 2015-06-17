/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author QuangAnh
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Student> ListSt = new ArrayList<>();
        int choice;
        int n;
        while (true) {
            System.out.println("1.Input");
            System.out.println("2.Check Regex");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter your choice!:");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter n:");
                    n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        Student s = new Student();
                        s.Input();
                        ListSt.add(s);
                    }
                    break;
                case 2:
                    System.out.println("Checking!!!");
                    for (Student ListSt1 : ListSt) {
                        ListSt1.Regex();
                    }
                    break;
                case 3:
                    for (Student ListSt1 : ListSt) {
                        System.out.println(ListSt1);
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
