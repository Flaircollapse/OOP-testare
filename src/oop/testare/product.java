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
public abstract class product {
    String name, description;
    double cost;
    //parametrar till initiering av varor
    public product(String name, String description, double cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

}
