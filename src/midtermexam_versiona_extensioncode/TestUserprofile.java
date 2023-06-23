/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;
/**
 *
 * @author tongx
 */
public class TestUserprofile {
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String userName = input.nextLine();
        
        System.out.print("Please enter your favorite genre (choose from the below list): ");
        String userGenres = input.nextLine();
        
        UserProfile newUser = new UserProfile("id001",userGenres);
        System.out.println("Your profile is created");

        
    }
           
//    public static String generateUserID(UserProfile user){
//        // generate random Id between 10000 and 99999 
//        Random random = new Random();
//        return "id" + (random.nextInt(99999) + 10000); 
//        
//    };
}

