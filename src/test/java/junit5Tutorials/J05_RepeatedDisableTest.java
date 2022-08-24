package junit5Tutorials;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class J05_RepeatedDisableTest {

     /*
     @RepeatedTest(a) ==> test edilecek metod 'a' kadar döngü icinde test edilir.
     Junit 5 ile gelmistir.

      */


    @AfterEach
    void afterEach() {
        System.out.println("AfterEach calisti");
        System.out.println("=======*********========");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("before calisti");
    }

    @RepeatedTest(7)
    @DisplayName("Contains method 7 ez test edildi")
    void containsTest(){
        assertFalse("Hakan".contains("na"));  //Hakan kelimesi 'na' icermediginden test basarili.
        System.out.println("7 kez test basarili");
    }

    @RepeatedTest(5)
    @DisplayName("Topla metodu 5 kez test edildi")
    void toplaTest(){
        assertEquals(5, (2+3));
        System.out.println("Topla metodu calisti");
    }


    @Disabled("metodu denemeyin akilli olun!")
    @Test
    void akilliOlun() {
        String akilliAdam="akilli adam gelecegi azbucuk sezer";
        assertEquals(34,akilliAdam.length());
    }


}
