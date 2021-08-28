package Romtall;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Romtalltest {
    StringBuilder romannumb = new StringBuilder();




     private String toRoman(int numb) {

        for (int i = 0; i < numb; i++) {

        }
      return  romannumb.append("I").toString();
    }

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", toRoman(1));
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

