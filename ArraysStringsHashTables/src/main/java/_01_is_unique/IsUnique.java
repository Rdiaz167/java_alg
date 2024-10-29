package _01_is_unique;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {

    private static final int NUMBER_OF_CHARS = 128;

    public boolean isUnique(String s) {

        if(s.length() > NUMBER_OF_CHARS) return false;

        Set<Character> characters = new HashSet<>();
        for(Character c : s.toCharArray()) {
            if(characters.contains(c)) return false;
            characters.add(c);
        }
        return true;
    }
}
