package junit5Tutorials;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class J04_ParametirezedTest {
    //CISSS  asla onerilmezzzzzz.....
    @Test
    void uzunlukSifirdanBuyuk() {
        assertTrue("hakan".length() > 0);
        assertTrue("asli".length() > 0);
        assertTrue("ihsan".length() > 0);
        assertTrue("orhan".length() > 0);
        assertTrue("belkis".length() > 0);
    }
    /*
         lenght() metodunun aşağıdaki koşullar için 0'dan büyük değer döndürüp döndürmediğini test ediniz.
          Koşullar: "hakan", "asli", "ihsan", "orhan","belkis"--> bu veriler testi nasıl geçer...
     */
    // TEKİL ŞART
    @ParameterizedTest
    @ValueSource(strings = {"hakan", "asli", "ihsan", "orhan","belkis"})//passed

    // @ValueSource(strings = {"haluk", "salih", "yagmur","","orhan","belkis"})//failed

    void uzunlukSifirdanBuyukParametreli(String str) {//parametre elemanları (strings)method döngüye atıp run ediyor
        assertTrue(str.length() > 0);
    }

    //COKLU ŞART --> key value ikili parametre ile çalışır
    //CSV dosyası (Comma-Separated VariabIes) Virgülle ayrılmış değerler

    @ParameterizedTest(name = "(Expected)BUYUKHARF:{0},(actual)cevirilecek:{1}")//syntax
    //@ParameterizedTest  --> parametresi {} ile Expected:{0},actual:{1} yazılmalı..
    @CsvFileSource(resources = "/data.csv",numLinesToSkip = 1) // numLinesToSkip = 1 --> 1 line daki degerleri atla
    void upperCaseFromCsvFile(String kelime, String buyukHarf) {

        assertEquals(buyukHarf, kelime.toUpperCase());
    }

    @ParameterizedTest
    @CsvSource(value={"HAKAN,hakan","ORHAN,orhan"}) //key-value passed
        //@CsvSource(value={"HAKAN,hakan","ORHAN,orhan","BELKIS, belkis"}) //key-value failed
    void testBuyukHarfeCevir(String beklenenBigHarf,String isim){  //"HALUK,haluk"

        assertEquals(beklenenBigHarf,isim.toUpperCase());
    }


}
