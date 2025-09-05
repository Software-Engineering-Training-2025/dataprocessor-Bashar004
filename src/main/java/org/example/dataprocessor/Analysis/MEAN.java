package org.example.dataprocessor.Analysis;

import org.example.dataprocessor.Output.OutputInterface;

import java.util.List;

public class MEAN implements AnalysisInterface {


    @Override

    public double analyze(List<Integer> data) {
        if(data==null||data.isEmpty()){
            return Double.NaN;
        }

        int size = data.size();
        int sum = 0;
        for (Integer i : data) {
            sum += i;


        }
        return (double)sum/size;


    }
}
