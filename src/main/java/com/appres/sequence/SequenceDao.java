package com.appres.sequence;

/**
 *
 * @author tinotenda
 */
public interface SequenceDao {
    Sequence getSequence(String sequenceId);
    int getNextValue(String sequenceId);
    
}