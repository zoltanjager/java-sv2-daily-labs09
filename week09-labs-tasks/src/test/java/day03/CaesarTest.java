package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

    @Test
    void encryptsTest() {

        Encryption encryption = new Caesar(13);
        String input = "ALMA";

        assertEquals("ALMA", encryption.encrypts(encryption.encrypts(input)) );

    }
}