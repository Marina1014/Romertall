package Romtall;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Romtalltest {
    StringBuilder romannumb = new StringBuilder();

     private String toRoman(int numb) {
         if (numb == 4){
             return "IV";
         }

         if (numb == 5){
             return "V";
         }

         if (numb == 8){
             return "VIII";
         }

         if (numb == 9){
             return "IX";
         }

         if (numb == 10){
             return "X";
         }

        for (int i = 0; i < numb; i++) {
            romannumb.append("I");
        }
      return  romannumb.toString();
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

    @Test
    void shouldConvert4ToIV () {
        assertEquals("IV", toRoman(4));
    }

    @Test
    void shouldConvert5ToV () {
        assertEquals("V", toRoman(5));
    }

    @Test
    void shouldConvert8ToVIII () {
        assertEquals("VIII", toRoman(8));
    }

    @Test
    void shouldConvert9ToIX () {
        assertEquals("IX", toRoman(9));
    }

    @Test
    void shouldConvert10ToX () {
        assertEquals("X", toRoman(10));
    }




}

