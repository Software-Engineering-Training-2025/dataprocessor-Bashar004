package org.example.dataprocessor.Cleaning;

import org.example.dataprocessor.Output.OutputInterface;

import java.util.List;


public class REMOVE_NEGATIVES implements CleaningInterface {

    @Override
    public List<Integer> clean(List<Integer> data) {

       data.removeIf(x->x<0);
       return data;

    }
}
