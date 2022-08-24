package junit5Tutorials;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class J06_PerformanceTesting {

    @Test
    void performanceInteger1(){    // Integer veriyle 0 dan 1000000 a kadar 1 saniyenin üzerinde ilerledigi icin test failed oldu.
        assertTimeout(Duration.ofSeconds(1), ()-> IntStream.rangeClosed(0,1000000).forEach(System.out::print));
    }

    @Test
    void performanceInteger2(){    //  Integer veriyle 0 dan 1000 e kadar 1 saniyenin altinda ilerledigi icin test passed oldu.
        assertTimeout(Duration.ofSeconds(1), ()-> IntStream.rangeClosed(0,1000).forEach(System.out::print));
    }

    @Test
    void performanceWithLong(){   // Long veriyle 1 saniyede 10000 e kadar test basarili
        assertTimeout(Duration.ofSeconds(1), ()-> LongStream.rangeClosed(0,10000).forEach(System.out::print));
    }

    @Test
    void performanceInteger3(){    //  Integer veriyle 0 dan 100 e kadar 10 milisaniyenin altinda toplama yaptigi icin test passed oldu.
        assertTimeout(Duration.ofMillis(10), ()-> IntStream.rangeClosed(0,100).sum());
    }

}
