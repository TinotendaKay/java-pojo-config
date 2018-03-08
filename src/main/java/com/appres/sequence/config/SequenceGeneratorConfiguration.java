/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appres.sequence.config;

import com.appres.sequence.SequenceGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author tinotenda
 */
@Configuration
public class SequenceGeneratorConfiguration {
    
    @Bean
    public SequenceGenerator sequenceGenerator() {
        SequenceGenerator sequenceGenerator = new SequenceGenerator();
        sequenceGenerator.setPrefix("30");
        sequenceGenerator.setInitial(100000);
        sequenceGenerator.setSuffix("A");
        return sequenceGenerator;
    }
    
}
