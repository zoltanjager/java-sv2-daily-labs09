package day03;

import java.util.Locale;

public class Caesar extends Encryption{
    private int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypts(String input) {
        char[] output = input.toUpperCase().toCharArray();

        for (int i = 0; i < input.length(); i++) {
            output[i] += offset;
            if(output[i] > 'Z'){
                output[i] -= 'Z' - 'A' + 1;
            }
        }
        return new String(output);
    }
}
