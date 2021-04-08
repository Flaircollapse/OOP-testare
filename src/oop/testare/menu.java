/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.testare;

import java.util.Scanner;

/**
 *
 * @author preec
 */
public class menu {
      public static Scanner scan = new Scanner(System.in);
    public static void menu() {
       Scanner scan = new Scanner(System.in); //Skapa scan object för input
        
        while (true){
            
            char choice;
            System.out.println("Here is menu");
            System.out.println("1. Chicken");
            System.out.println("2. Dress");
            System.out.println("3. Soft Drink");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = scan.next().charAt(0); //scan choice för vad ska ske nästa
            
            switch (choice) {
                case '1':
                {
                    food();
                   
                }
                case '2':
                {
                   clothing();
                  
                } 
                case '3':
                {
                   drink();
                   
                }
                case '4':
                {
                    System.exit(0); //Avsluta konsolen/maskinen
                } 
                default:
                {
                    System.out.println("Enter correct input");
                }    
            }
            
        }
    }
    
   public static void food() {
        
        System.out.println("Here can you see available product to buy");
        
        
        System.out.println("1. Chicken");
        System.out.println("0. Exit");
        
        String input = scan.nextLine();
        switch(input){
            case "1":
                food.chicken.Description(); //Anropa Description metod för att visa beskrivningen
                break;
            case "0":
                break; 
            default:
                
                System.out.println("Enter correct input");
                food();
        }
        
    }

    public static void clothing() {
        
         System.out.println("Here can you see available product to buy");
        
        
        System.out.println("1. Clothing");
        System.out.println("0. Exit");
        
        String input = scan.nextLine();
        switch(input){
            case "1":
                clothing.dress.Description(); //Anropa Description metod för att visa beskrivningen
                break;
            case "0":
                break;
            default:
                
                System.out.println("Enter correct input");
                clothing();
        }
    }

    public static void drink() {
         System.out.println("Here can you see available product to buy");
        
        
        System.out.println("1. Drink");
        System.out.println("0. Exit");
        
        String input = scan.nextLine();
        switch(input){
            case "1":
                food.chicken.Description(); //Anropa Description metod för att visa beskrivningen
                break;
            case "0":
                break;
            
            default:
                
                System.out.println("Enter correct input");
                drink();
        } 
    }
}


