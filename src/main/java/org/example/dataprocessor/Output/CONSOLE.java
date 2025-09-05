package org.example.dataprocessor.Output;

public class CONSOLE implements OutputInterface{
    @Override
    public void output(double value) {
        System.out.println("Result = " + value);


    }
}
