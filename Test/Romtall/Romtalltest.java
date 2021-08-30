package Romtall;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Romtalltest {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", romTallConvert.toRoman(1));
    }

    @Test
    void shouldConvert2ToII () {
        assertEquals("II", romTallConvert.toRoman(2));
    }

    @Test
    void shouldConvert3ToIII () {
        assertEquals("III", romTallConvert.toRoman(3));
    }

    @Test
    void shouldConvert4ToIV () {
        assertEquals("IV", romTallConvert.toRoman(4));
    }

    @Test
    void shouldConvert5ToV () {
        assertEquals("V", romTallConvert.toRoman(5));
    }

    @Test
    void shouldConvert8ToVIII () {
        assertEquals("VIII", romTallConvert.toRoman(8));
    }

    @Test
    void shouldConvert9ToIX () {
        assertEquals("IX", romTallConvert.toRoman(9));
    }

    @Test
    void shouldConvert10ToX () {
        assertEquals("X", romTallConvert.toRoman(10));
    }

    @Test
    void shouldConvert32ToXII () {
        assertEquals("XXXII", romTallConvert.toRoman(32));
    }

    @Test
    void shouldConvert37ToXXXVII () {
        assertEquals("XXXVII", romTallConvert.toRoman(37));
    }
}

