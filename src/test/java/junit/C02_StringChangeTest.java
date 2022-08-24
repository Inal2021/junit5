package junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class C02_StringChangeTest {

    C02_StringChange strChange=new C02_StringChange();  // Static olmayan class tan method call etmek icin obje olusturudk.

    @BeforeEach
    void setUp() {
        strChange=new C02_StringChange();
        System.out.println("test verisi CREAT edildi");
    }

    @AfterEach
    void tearDown() {
        strChange=null;
        System.out.println("test verisi DELETE edildi.");
        System.out.println("-------*******-------");
    }

    @ParameterizedTest
    @CsvSource(value = {"BC,AABC","B,AB","BCDE,BCDE","'',AA","B,B"}) //hiclik
    void ilkIkiASil(String kirpilmis, String girdi) {
        assertEquals(kirpilmis,strChange.ilkIkiASil(girdi));
        System.out.println("ilk ikide olan A lar silindi");
    }
}