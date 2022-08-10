package junit5Tutorials;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class J02_BeforeAfterEachAll {

    /*
    @BeforeEach ==> Her adimdan önce yapilir. Debriyaja basma metaforu.
    @AfterEach ==> Her adimdan sonra yapilir. Debriyajdan ayagi cekme metaforu.

    @BeforeAll ==> Namazda Tekbir getirmek
    @AfterAll ==> Mamaz sonrasi Selam vermek

     */

    @Test
    @DisplayName("Length metod Test")
    void testStringLength(){

        String str="Herkes bir gün Java ögrenecek";

        int actual = str.length();
        int expected = 29;

        assertEquals(expected, actual,"Degerler esit degil");
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
