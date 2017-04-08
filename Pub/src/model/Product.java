/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rossi.alessandroachi
 */
public abstract class Product {
    private String Nome;
    private float Price;
    private static final int MAX_PREZZO = 100;
    public String getName(){
        
        return Nome;
    }
}
