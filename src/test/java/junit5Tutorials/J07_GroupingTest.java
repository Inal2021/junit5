package junit5Tutorials;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class J07_GroupingTest {

    @ParameterizedTest
    @CsvSource(value={"12,3,4","5,5,1","12,-2,-6"})
    void carp(int sonuc, int x, int y){
        assertEquals(sonuc,(x*y));
    }


    @Nested // parenti olan class levelde calisir. Classindaki tüm testleri ayni anda run eder.
    @DisplayName("Group Test run")
    class SifirIcerenCarpim{
    @ParameterizedTest
    @CsvSource(value={"0,0,4","0,5,0","0,0,-6"})
    void carp(int sonuc, int x, int y){
        assertEquals(sonuc,(x*y));
    }

    @ParameterizedTest
    @CsvSource(value={"7,3,4","6,5,1","-8,-2,-6"})
    void topla(int sonuc, int x, int y){
            assertEquals(sonuc,(x+y));
        }

    }

}
