package org.example.dataprocessor.Analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TOP3_FREQUENT_COUNT_SUM implements AnalysisInterface{
    @Override
    public double analyze(List<Integer> data) {
        if (data == null || data.isEmpty()) {
            return 0.0;
        }

         HashMap<Integer, Integer> iterator  = new HashMap<>();
        for (Integer numbers : data) {
           iterator.merge(numbers, 1, Integer::sum);
        }

        List<Map.Entry<Integer, Integer>> sortlist = new ArrayList<>(iterator.entrySet());
        sortlist.sort(Map.Entry.<Integer,Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()));

        double sum = 0;
        for (int i = 0; i < Math.min(3, sortlist.size()); i++) {
            sum += sortlist.get(i).getValue();
        }

        return sum;


    }
}
