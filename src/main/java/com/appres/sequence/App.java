package com.appres.sequence;

import com.appres.sequence.config.SequenceGeneratorConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    private static final Logger LOGGER= LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
      ApplicationContext context = new AnnotationConfigApplicationContext(SequenceGeneratorConfiguration.class);
      
      SequenceGenerator sequenceGenerator = context.getBean(SequenceGenerator.class);
      LOGGER.info("seq1: {}", sequenceGenerator.getSequence());
      LOGGER.info("seq2: {}", sequenceGenerator.getSequence());
      
  }

}
