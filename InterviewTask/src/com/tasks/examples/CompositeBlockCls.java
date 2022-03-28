/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tasks.examples;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/**
 *
 * @author Zaur Ibrahimov
 */
public class CompositeBlockCls extends BlockCls implements CompositeBlock {

    private List<Block> blocks = new LinkedList<>();

    public CompositeBlockCls(String color, String material) {
        super(color, material);
    }

    @Override
    public List<Block> getBlocks() {
        return (List<Block>) Collections.unmodifiableCollection(blocks);
    }

    public void addBlock(Block block) {
        blocks.add(block);
    }

   

    @Override
    public Stream<Block> toStream() {
        return Stream.concat(super.toStream(), blocks.stream().flatMap(Block::toStream));
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.blocks);
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
        final CompositeBlockCls other = (CompositeBlockCls) obj;
        if (!Objects.equals(this.blocks, other.blocks)) {
            return false;
        }
        return true;
    }

    
    

}
