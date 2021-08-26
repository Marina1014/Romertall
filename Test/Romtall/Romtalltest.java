package Romtall;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Romtalltest {


    @Test
    void shouldConvert1ToI(){
        assertEquals("I", toRoman(1));
    }

    static private String toRoman(int i) {
        if ( i == 1){
            return "I";
        }
        else
        {
            return "II";
        }
    }


    @Test
    void shouldConvert2ToII() { assertEquals( "II", toRoman(2));}



}
