package org.example.dataprocessor.Factory;

import org.example.dataprocessor.Analysis.*;
import org.example.dataprocessor.enums.AnalysisType;

public class AnalysisFactory {

    public static AnalysisInterface CreateAnalysis(AnalysisType analysisType){
        switch (analysisType) {
            case MEAN:
                return new MEAN();
            case MEDIAN:
                return new MEDIAN();
            case STD_DEV:
                return new STD_DEV();
            case P90_NEAREST_RANK:
                return new P90_NEAREST_RANK();
            case TOP3_FREQUENT_COUNT_SUM:
                return new TOP3_FREQUENT_COUNT_SUM();
            default:
                throw new IllegalArgumentException("Invalid AnalysisType");
        }
    }
}
