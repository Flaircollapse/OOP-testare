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
//food klass extends från product klass för att implementera product klass metoder
public class food extends product {
    Scanner scan = new Scanner(System.in);
    @Override
    void Description() {
        System.out.println("Here is Chicken to eat");
        System.out.println("Description:");
        System.out.println("This item contain grilled chicken.");
        System.out.println("Item cost is 30£.");
    }

    @Override
    void Buy() {
       char choice2;
        System.out.println("Do you want to buy? Enter y OR Back to main menu? Enter m: ");
        choice2 = scan.next().charAt(0);//scan choice
        String amount;
                    switch (choice2) {
                        case 'y':
                        {
                            wallet ob = new wallet(); //skapa wallet class object
                            while(true)
                                try{
                                    System.out.println("Item cost is 30£.");
                                    System.out.println("Enter your amount: Format eg.(1,£,1), (1,£,5), (1,£,10)");
                                    amount = scan.next(); //scan amount
                                    System.out.println(amount);
                                    String[] amount2 = amount.split(","); //Dela upp beloppet på basis av
                                    int totalAmount = (Integer.parseInt(amount2[0]) * Integer.parseInt(amount2[2])); //räkna total belopp
                                    if (totalAmount == 30) { //Kontrollera om belopppet är lika med eller inte
                                        
                                        if (ob.updateUserMoney(Integer.parseInt(amount2[2]), Integer.parseInt(amount2[0]))) {
                                            System.out.println("Total price paid by you is: " + totalAmount);
                                            Use(); //anropa use metod
                                        }
                                        
                                            OOPTestare.menu(); //Gå tillbaka till menu
                                    }else {
                                        System.out.println("Enter correct amount");
                                    }
                                    
                                }catch (Exception e) {
                                    System.out.println("Enter correct format");
                                }
                        }
                        case 'm':
                        {
                            OOPTestare.menu(); //Gå tillbaka till menu
                        }
                        default:
                        {
                            System.out.println("Enter correct Choice");
                        }
                    }
                            
    }

    @Override
    void Use() {
        System.out.println("Product has been eaten");
    }
    
}
