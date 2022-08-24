package junit5Tutorials;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class J02_BeforeAfterEachAll {

    /*
    A) @BeforeEach ==> Her adimdan önce yapilir. Debriyaja basma metaforu.

    B) @AfterEach ==> Her adimdan sonra yapilir. Debriyajdan ayagi cekme metaforu.

    C) @BeforeAll ==> Namazda Tekbir getirmek gibidir. Tüm test ögelerinden önce veritabani calistirilmak istenebilir.
    Veya cloud ile baglanti kurulabilir ki oradan belli degerler alinabilsin. Bu durumda bu annatation kullanilir.

    D) @AfterAll ==> Mamaz sonrasi Selam vermek gibidir. Tüm test ögeleri tamamlandiktan sonra veri tabanini veya cloud baglantisini
    kesmek icin kullanilir.

    @Before ve @After arasinda creat/yazim siralamasi farketmez. Java After gördügünde bunu en son compile etmesi gerektigini bilir.
    @BeforeAll ve @AfterAll metodlarinin kullanildigi metodlar static olmalidir.

     */

@BeforeAll
static void awsCloudOpening() {
    System.out.println("AWS started");    // veritabani baglantisi kuruldu
}

@AfterAll
static void  awsCloudClosing() {
    System.out.println("AWS finished");   // veritabani baglantisi kaldirildi
}


    @BeforeEach
            void setup(TestInfo info) {  // TestInfo --> @DisplayName degerini return eder.
        str="Junit5 ile test degerleri";
        System.out.println("@BeforeEach calisti ve "+info.getDisplayName()+" basarili oldu.");
    }

    @AfterEach
            void clean() {
        str="Default olarak bu metne döndüm.";
        System.out.println(str);

    }


    String str="";


    @Test
    @DisplayName("Length metod Test")
    void testStringLength(){



        int actual = str.length();
        int expected = 25;

        assertEquals(expected, actual,"Degerler esit degil");

        System.out.println("1. metod calisti");
    }


    @Test
    @DisplayName("Arrays Test")
    void testWithArrays(){


        String[] actual=str.split(" ");
        String[] expected={"Junit5","ile","test","degerleri"};

        assertArrayEquals(expected, actual,"array degerleri esit degil!");

        System.out.println("2. metod calisti");
    }


}
