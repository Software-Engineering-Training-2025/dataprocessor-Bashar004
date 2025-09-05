package org.example.dataprocessor.Cleaning;

import org.example.dataprocessor.Output.OutputInterface;

import java.util.ArrayList;
import java.util.List;

public class REPLACE_NEGATIVES_WITH_ZERO implements CleaningInterface{

    @Override
    public List<Integer> clean(List<Integer> data) {


        List<Integer> copy = new ArrayList<>(data);


        copy.replaceAll(x -> x < 0 ? 0 : x);

        return copy;

    }
}
