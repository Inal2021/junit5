package junit5Tutorials;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class J01_Assertions {

    @Test
    @DisplayName("ToAssert testi")
    void testToAssert(){

        int actual="hakan".length(); //5
        int expected=5;

        // assertEquals(); ==> actual ve expected esit olmasi durumunda basarili olur.

        assertEquals(expected,actual,"Test passed");

        // inLine style; ==> Her daim kullanilmaz code cosmetic e aykiridir.

        assertEquals(5,"ihsan".length(),"Bu yöntem cok kullanilmaz");

        // assertNotEquals(); ==> actual ve expected esit olmamasi durumunda basarili olur.
        expected=4;
        assertNotEquals(expected,actual,"Test passed");

        // assertTrue() ==> olusturulan sart (boolean) true ise test basarili
        expected=5;
        assertTrue(expected==actual, "sart saglanmadi FALSE degeri verdi");

        // assertFalse() ==> olusturulan sart (boolean) false ise test basarili
        expected=4;
        assertFalse(expected==actual, "sart saglandi ve TRUE verdi");



    }

    @Test
    @DisplayName("ToConvertUpper Test")
    void testToConvertUpper(){

        String expected="ASLI";
        String actual="asli".toUpperCase(Locale.ROOT);

        assertEquals(actual,expected); // passed ==> test datalar esitse asarili

        assertTrue(expected.equals(actual)); // passed ==> true ise basarili
        assertFalse(!expected.equals(actual)); // passed

        actual=null;
        assertNull(actual,"actual deger null degil"); // passed ==> test parametresi NULL ise basarili

        actual="asli";
        assertNotNull(actual,"actual deger null"); // passed
    }

    @Test
    @DisplayName("ToContain Testi")
    void testToContain(){

        boolean actual = "hakan".contains("hi");
        boolean expected= false;

        assertEquals(expected,actual,"degerler esit degil"); // actual = false, expected=false ==> actual = expected --> test=passed

    }

    @Test
    @DisplayName("Arrays Test")
    void testWithArrays(){

        String str="Junit5 ile test degerleri";
        String[] actual=str.split(" ");
        String[] expected={"Junit5","ile","test","degerleri"};
                
        assertArrayEquals(expected, actual,"array degerleri esit degil!");

    }


}
