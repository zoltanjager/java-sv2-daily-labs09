package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> shortestWords(List<String> words) {

        List<String> result = new ArrayList<>();

        int minLength = getMinLength(words);

        for (String actual : words) {
            if (actual.length() == minLength){
                result.add(actual);
            }
        }
        return result;
    }

    private int getMinLength (List<String> words) {
        int min = Integer.MAX_VALUE;

        for (String actual : words) {
            if (actual.length() < min) {
                min = actual.length();
            }
        }
        return min;
    }
}
