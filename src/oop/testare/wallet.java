/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.testare;

/**
 *
 * @author preec
 */
public class wallet {
    //Skapa variabel för hela nummer
    static int denomination1;
    static int denomination5;
    static int denomination10;
    
    void setUserMoney(){
        //Initialisering av denominations
        denomination1 = 10;
        denomination5 = 10;
        denomination10 = 10;
    }
    //Updatera användarens pengar
    //Anvädare kan välja att betala mellan 1x10, 5x10 eller 10x10 £
    //Vid köp av produkt pengar minskar 
    boolean updateUserMoney(int denomination, int numOfDenomination){
        if (denomination == 1){
            denomination1 -= numOfDenomination;
            if (denomination1 < 0){
                System.out.println("This number of 1£ denomination not available");
                denomination1 += numOfDenomination;
                return false;
            }
            System.out.println("Your Remaining Of Denomination Are:");
            System.out.println("Denomination 1£: " + denomination1);
            System.out.println("Denomination 5£: " + denomination5);
            System.out.println("Denomination 10£: " + denomination10);
            return true;
        }else if (denomination == 5){
            denomination5 -= numOfDenomination;
            if (denomination5 < 0){
                System.out.println("This number of 5£ denomination not available");
                denomination5 += numOfDenomination;
                return false;
            }
            System.out.println("Your Remaining Of Denomination Are:");
            System.out.println("Denomination 1£: " + denomination1);
            System.out.println("Denomination 5£: " + denomination5);
            System.out.println("Denomination 10£: " + denomination10);
            return true;
        }else if (denomination == 10){
            denomination10 -= numOfDenomination;
            if (denomination10 < 0){
                System.out.println("This number of 10£ denomination not available");
                denomination10 += numOfDenomination;
                return false;
            }
            System.out.println("Your Remaining Of Denomination Are:");
            System.out.println("Denomination 1£: " + denomination1);
            System.out.println("Denomination 5£: " + denomination5);
            System.out.println("Denomination 10£: " + denomination10);
            return true;
        }
        return false;
    }    
}
