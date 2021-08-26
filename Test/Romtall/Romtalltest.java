package Romtall;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Romtalltest {


    @Test
    void shouldConvert1ToI(){
        assertEquals("I", toRoman(1));
    }

    static private int toRoman(int i) {
        return i;
    }



}
