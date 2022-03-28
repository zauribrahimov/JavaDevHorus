/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tasks.examples;

import java.util.stream.Stream;

/**
 *
 * @author Zaur Ibrahimov
 */
public interface Block {

    String getColor();

    String getMaterial();
    
    Stream<Block> toStream();
}
