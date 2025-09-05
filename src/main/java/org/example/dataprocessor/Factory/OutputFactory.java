package org.example.dataprocessor.Factory;

import org.example.dataprocessor.Output.CONSOLE;
import org.example.dataprocessor.Output.OutputInterface;
import org.example.dataprocessor.Output.TEXT_FILE;
import org.example.dataprocessor.enums.AnalysisType;
import org.example.dataprocessor.enums.CleaningType;
import org.example.dataprocessor.enums.OutputType;

import java.io.Console;

public class OutputFactory {
    public static OutputInterface CreateOutput(OutputType outputType){
        switch (outputType) {
            case CONSOLE:
                return new CONSOLE();
            case TEXT_FILE:
                return new TEXT_FILE();
            default:
                throw new IllegalArgumentException("Invalid OutputType");
        }
    }
}
