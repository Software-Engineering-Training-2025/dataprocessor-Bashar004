package org.example.dataprocessor.Analysis;

import org.example.dataprocessor.Output.OutputInterface;

import java.util.List;

public class STD_DEV implements AnalysisInterface {


    @Override
    public double analyze(List<Integer> data) {
        if(data==null||data.isEmpty()){
            return Double.NaN;
        }
        int N = data.size();

        double mean = 0.0;
        for (double val : data) {
            mean += val;
        }
        mean /= N;

        double variance = 0.0;
        for (double val : data) {
            variance += Math.pow(val - mean, 2);
        }

        variance /= N;

        return Math.sqrt(variance);


    }
}
