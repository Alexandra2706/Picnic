package Servise;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFromFile {

    public String readFile(String filename) {
        String content = "";
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                content += line + " ";
            }
            content = content.strip();
            content = content.replaceAll("[\\s]{2,}", " ");
        } catch (IOException ex) {
            System.out.println("Ошибка чтения файла " + ex.getMessage());
        }
        return content;
    }
}
