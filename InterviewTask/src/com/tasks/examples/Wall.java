/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tasks.examples;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 *
 * @author Zaur Ibrahimov
 */
public class Wall implements Structure {

    //private List blocks;
    private final List<Block> blocks = new LinkedList<>();

    public Wall(Block... blocks) {
        Arrays.stream(blocks).forEach(this::addBlock);
    }

    @Override
    public Block findBlockByColor(String color) {
        if (color == null) {
            throw new IllegalArgumentException("Color is null!");
        }
        return findByPredicate(n -> color.equals(n.getColor()));
    }

    @Override
    public Block findBlocksByMaterial(String material) {
        if (material == null) {
            throw new IllegalArgumentException("Material is null!");
        }
        return findByPredicate(n -> material.equals(n.getMaterial()));
    }

    @Override
    public int count() {
        return (int) blocks.stream().flatMap(Block::toStream).count();
    }

    private Block findByPredicate(Predicate<Block> predicate) {
        return blocks.stream().flatMap(Block::toStream).filter(predicate).findFirst().orElse(null);
    }

    public void addBlock(Block block) {
        blocks.add(block);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.blocks);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Wall other = (Wall) obj;
        if (!Objects.equals(this.blocks, other.blocks)) {
            return false;
        }
        return true;
    }

}
