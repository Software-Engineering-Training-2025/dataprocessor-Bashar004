package org.example.dataprocessor.Output;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;
import static java.nio.file.StandardOpenOption.WRITE;

public class TEXT_FILE implements OutputInterface {
    private static final String TARGET_DIR = "target";
    private static final String FILE_NAME = "result.txt";

    @Override
    public void output(double value) throws IOException {

        Path dir = Paths.get(TARGET_DIR);
        Files.createDirectories(dir);


        Path file = dir.resolve(FILE_NAME);


        try (BufferedWriter bw = Files.newBufferedWriter(
                file, StandardCharsets.UTF_8, CREATE, WRITE, TRUNCATE_EXISTING)) {
            bw.write("Result = " + value);
            bw.newLine();
        }

    }
}
