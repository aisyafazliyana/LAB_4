/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class l4q1 {
public class Cjw {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String username = "aisya";
        String password = "aisya25";
        int attempt = 0;

        //user input
        System.out.println("Enter Your username :");
        String usernameInput = input.nextLine();

        System.out.println("Enter Your Password : ");
        String passwordInput = input.nextLine();

        //check username and pass
        if (usernameInput.equals(username) && passwordInput.equals(password)) {
            System.out.println("Login successful. You have been authenticated");
        } else {
            System.out.println("Wrong password , please try again");
            attempt++;
        }
        boolean incorrectpassword = !passwordInput.equals(password);

        while (incorrectpassword) {
            System.out.println("Enter Your username :");
            usernameInput = input.nextLine();

            System.out.println("Enter Your Password : ");
            passwordInput = input.nextLine();

            if (usernameInput.equals(username) && passwordInput.equals(password)) {
                System.out.println("Login successful");
                break;

            } else {
                System.out.println("Please try again");
                attempt++;
            }

            if (attempt == 3) {
                System.out.println("You have been blocked , please contact us ");
                break;
            }
        }
  
    }
}

//untuk another pass System.out.println("username is" + username ); //System.out.println ("password is" + password);   

}
