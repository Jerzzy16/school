/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyInput2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author CSS123L-BM6-08
 */
public class sample4 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name=br.readLine();
        System.out.println("Hello..."+name);
        System.out.print("Enter your age: ");
        int age=Integer.parseInt(br.readLine());
        System.out.println("You are "+age+" Years old.");
        System.out.print("Enter your Salary PHP: ");
        double salary=Double.parseDouble(br.readLine());
        System.out.println("Your salary is "+String.format("%.2f", salary));
 
    }
}
