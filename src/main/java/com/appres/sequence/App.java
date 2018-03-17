package com.appres.sequence;

import com.appres.sequence.config.SequenceGeneratorConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    private static final Logger LOGGER= LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
      ApplicationContext context = new AnnotationConfigApplicationContext("com.appres.sequence");
      
      SequenceGenerator sequenceGenerator = context.getBean(SequenceGenerator.class);
      LOGGER.info("seqGen1: {}", sequenceGenerator.getSequence());
      LOGGER.info("seq Gen2: {}", sequenceGenerator.getSequence());
      
        SequenceDao bean = context.getBean(SequenceDao.class);
        
        LOGGER.info("1 Sequence Dao next val : {}", bean.getNextValue("IT"));
        LOGGER.info("2 Sequence Dao next val : {}", bean.getNextValue("IT"));
      
  }

}
