package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {
    public int encode(String input, char x) {
        if(!isValidLetter(x)) {
            throw new IllegalArgumentException("Char not valid");
        }
        int counter = 0;
        Path path = Path.of(input);
        try(BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while((line=br.readLine()) != null) {
               for(int i = 0; i < line.length(); i++) {
                   if(line.charAt(i) == x) {
                       counter++;
                   }
               }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
        return counter;
    }

    private boolean isValidLetter(char c) {
        return c == 'x' || c == '1' || c == '0';
    }
}
