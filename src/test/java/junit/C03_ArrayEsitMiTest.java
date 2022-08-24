package junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C03_ArrayEsitMiTest {



    @ParameterizedTest
    @MethodSource("ArrayFabric") // parametrenin alinacagi method name girilir. Haricten bir method bu teste parametre gönderecek!
    void diziKiyaslaya(Boolean result, Object[]a,Object[]b) {

        assertEquals(result,C03_ArrayEsitMi.diziKiyaslaya(a,b));

    }


    static Stream<Arguments> ArrayFabric() {  // Trick: return tek parametre dondururken Stream<> coklu veri döndürecek.
// ÖNEMLI NOT!!! Stream<Arguments> kullanmamizin nedeni, methodumuzu lambda mantigi ile random  generator haline dönüstürmek, yani coklu veri.
// ArrayFabric() Stream classina Arguments parametresi return ediyor.


        Integer [] a1={1,2,3};
        Integer [] a2={3,1,2};

        String [] s1={"h","a","y"};
        String [] s2={"y","a","h"};

        Double [] d1={1.2,3.4,8.9};
        Double [] d2={3.4,1.2,8.9};

        Float [] f1={1f,5.6f,2f};
        Float [] f2={1f,5.6f,3f};

        return Stream.of(
                Arguments.of(true,a1,a2),
                Arguments.of(true,s1,s2),
                Arguments.of(true,d1,d2),
                Arguments.of(false,f1,f2)
        );
    }




}