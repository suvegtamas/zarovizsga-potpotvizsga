package hu.nive.ujratervezes.zarovizsga.uniquefinder;


import java.util.ArrayList;
import java.util.List;


public class UniqueFinder {
    public List<Character> uniqueChars(String text) {
        if(text == null) {
            throw new IllegalArgumentException("No input");
        }
        List<Character> characters = new ArrayList<>();
        for(char c : text.toCharArray()) {
            if(!characters.contains(c)) {
                characters.add(c);
            }
        }
       return characters;
    }
}
