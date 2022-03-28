/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tasks.examples;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Zaur Ibrahimov
 */
public interface Structure {
    // returns any element with the given color 

    //Optional findBlockByColor(String color);
    Block findBlockByColor(String color);

// returns all items from the given material 
    //List findBlocksByMaterial(String material);
    Block findBlocksByMaterial(String material);

// returns the total number of elements that make up the structure 
    int count();
}
