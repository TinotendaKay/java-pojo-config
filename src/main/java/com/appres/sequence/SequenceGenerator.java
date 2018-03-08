/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appres.sequence;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author tinotenda
 */
public class SequenceGenerator {
    private String prefix;
    private String suffix;
    private int initial;
    private final AtomicInteger counter = new AtomicInteger(5);

    public SequenceGenerator() {
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public int getInitial() {
        return initial;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("SequenceGenerator{");
        builder.append("prefix=").append(prefix);
        builder.append(", suffix=").append(suffix);
        builder.append(", initial=").append(initial);
        builder.append(", counter=").append(counter.getAndIncrement());
        return builder.toString();
    }
    
    public String getSequence() {
        StringBuilder builder = new StringBuilder();
        builder.append(prefix);
        builder.append(initial);
        builder.append(counter.getAndIncrement());
        builder.append(suffix);
        return builder.toString();
    }
    
    
            
    
}
