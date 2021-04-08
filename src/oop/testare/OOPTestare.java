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
}