/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.testare;

import java.util.Scanner;
import static oop.testare.menu.menu;

/**
 *
 * @author preec
 */
//drink class extends från product klass för att implementera product klass metoder
public class drink extends product implements productfunktions {
    Scanner scan = new Scanner(System.in);
    
     public static drink soft = new drink("Soft Drink", "sweet sour", 10);
    
     public drink(String name, String description, double cost) {
        super(name, description, cost);
    }

    
    
    @Override
    public void Description() {
        System.out.println(name);
        System.out.println(description);
        System.out.println(cost);
        Buy();
    }

    @Override
    public void Buy() {
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
                                    System.out.println("Item cost is 10£.");
                                    System.out.println("Enter your amount: Format eg.(1,£,1), (1,£,5), (1,£,10)");
                                    amount = scan.next(); //scan amount
                                    System.out.println(amount);
                                    String[] amount2 = amount.split(","); //Dela upp beloppet på basis av
                                    int totalAmount = (Integer.parseInt(amount2[0]) * Integer.parseInt(amount2[2])); //kalkyl total belopp
                                    if (totalAmount == cost) { //Kontrollera om belopppet är lika med eller inte
                                        
                                        if (ob.updateUserMoney(Integer.parseInt(amount2[2]), Integer.parseInt(amount2[0]))) {
                                            System.out.println("Total price paid by you is: " + totalAmount);
                                            Use(); //anropa use metod
                                        }
                                        
                                            menu(); //Anropa menu metod för att visa menu
                                    }else {
                                        System.out.println("Enter correct amount");
                                    }
                                    
                                }catch (Exception e) {
                                    System.out.println("Enter correct format");
                                }
                        }
                        case 'm':
                        {
                            menu(); //Gå tillbaka till menu
                        }
                        default:
                        {
                            System.out.println("Enter correct Choice");
                        }
                    }
                            
    }

    @Override
    public void Use() {
        System.out.println("You just drink " +name);
    }
}
