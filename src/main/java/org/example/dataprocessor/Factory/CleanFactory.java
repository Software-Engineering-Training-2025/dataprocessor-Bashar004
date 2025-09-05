package org.example.dataprocessor.Factory;

import org.example.dataprocessor.Cleaning.CleaningInterface;
import org.example.dataprocessor.Cleaning.REMOVE_NEGATIVES;
import org.example.dataprocessor.Cleaning.REPLACE_NEGATIVES_WITH_ZERO;
import org.example.dataprocessor.enums.CleaningType;

public class CleanFactory {

    public static CleaningInterface CreateCleaning(CleaningType cleaningType) {
        switch (cleaningType) {
            case REMOVE_NEGATIVES:
                return new REMOVE_NEGATIVES();
            case REPLACE_NEGATIVES_WITH_ZERO:
                return new REPLACE_NEGATIVES_WITH_ZERO();
            default:
                throw new IllegalArgumentException("Invalid CleaningType");
        }
    }
}
