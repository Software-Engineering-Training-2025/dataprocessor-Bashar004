package org.example.dataprocessor.Analysis;

import org.example.dataprocessor.Output.OutputInterface;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class P90_NEAREST_RANK implements AnalysisInterface{


    @Override
    public double analyze(List<Integer> data) {
        if(data==null||data.isEmpty()){
            return Double.NaN;
        }
          Collections.sort(data);

        int N = data.size();
        int rank = (int) Math.ceil(0.90 * N);
        return  data.get(rank-1);


    }
}
