/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyInput;

import java.util.Scanner;

/**
 *
 * @author CSS123L-BM6-08
 */
public class sample3 {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello..." +name);
        System.out.print("Enter your Age: ");
        int age=scan.nextInt();
        System.out.println("Your age:"+age);
        
        System.out.print("Enter your salary PHP:");
        double salary=scan.nextDouble();
        System.out.println("Salary is PHP"+String.format("%.2f", salary));
    }
    
}
