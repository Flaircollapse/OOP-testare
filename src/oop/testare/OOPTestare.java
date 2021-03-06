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
public class OOPTestare {

    /**
     * @param args the command line arguments
     */
    //Här är main
    public static void main(String[] args) {
        wallet ob = new wallet(); //Skapa object för wallet class
        ob.setUserMoney(); //Anropa wallet class metod för att sätta pengar för användare
        menu(); //Anropa menu metod för att visa metod
    }
    static void menu() {
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
                   food ob = new food(); //Skapa food class object
                   ob.Description();  //Anropa Description metod för att visa beskrivningen
                   ob.Buy(); //Anropa Buy metod för att köpa produkt
                }
                case '2':
                {
                  clothing ob = new clothing(); //Skapa clothing class object
                   ob.Description();  //Anropa Description metod för att visa beskrivningen
                   ob.Buy(); //Anropa Buy metod för att köpa produkt  
                } 
                case '3':
                {
                  drink ob = new drink(); //Skapa drink class object
                   ob.Description();  //Anropa Description metod för att visa beskrivningen
                   ob.Buy(); //Anropa Buy metod för att köpa produkt  
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
    
}
