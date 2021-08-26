package Romtall;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Romtalltest {


    @Test
    void shouldConvert1ToI() {
        assertEquals("1", toRoman(1));
    }

    static private String toRoman(int i) {
        if (i == 1) {
            return "I";
        }
        if (i == 2) {
            return "II";

        } {
            return "III";
        }
    }

        @Test
        void shouldConvert2ToII () {
            assertEquals("II", toRoman(2));
        }

        @Test
        void shouldConvert3ToIII () {
            assertEquals("III", toRoman(3));
        }


}

