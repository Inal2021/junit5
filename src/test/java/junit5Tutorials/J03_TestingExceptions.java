package junit5Tutorials;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class J03_TestingExceptions {

    // assertThrow() metodu ==> belirtilen islemin (executable), belirtilen türde bir Exception olusturup olusturmadigini kontrol eder.
    // Dolayisiyla iki parametre alir;
    // 1. parametre  => expected
    // 2. parametre => actual


    @Test
    @DisplayName("NumberFormat Exception")
    void testException1() {
//        String strSayi = "1453";
//        Integer intSayi = Integer.parseInt(strSayi);


        assertThrows(NumberFormatException.class,()->Integer.parseInt("14a3"),"Bu test basarili olmadigi icin bu yaziyi okuyorsunuz");
        // NumberFormatException'in parenti Exception oldugu icin asagidaki test de gecer.
        assertThrows(Exception.class,()->Integer.parseInt("14a3"),"Bu test basarili olmadigi icin bu yaziyi okuyorsunuz");

    //! assertThrows(); metodunun anlami= iddia ediyorum hata verir!!!
        // passed olursa hata veriyor. failed olursa hata vermiyor demektir.

    }


    @Test
    @DisplayName("NullPointer Exception")
    void testException2(){
        String str = null;
//        str.length();

        assertThrows(NullPointerException.class,()->str.length(),"Bu test basarili olmadigi icin bu yaziyi okuyorsunuz");

        String str1="hakan";
        str1.length();

        assertThrows(NullPointerException.class,()->str1.length(),"Bu test basarili olmadigi icin bu yaziyi okuyorsunuz");
        // Bu ikinci testimiz gecmedi. Cünkü str1 in hakan kadar uzunlugu var. Yani NullPointer olamaz!!!

    }

    @Test
    @DisplayName("illegal")
    void testException3(){
        assertThrows(IllegalArgumentException.class, ()-> agePrint(-2)); // passed
        assertThrows(IllegalArgumentException.class, ()-> agePrint(7)); // passed
        assertThrows(IllegalArgumentException.class, ()-> agePrint(8 )); // passed

    }

    void agePrint(int age){
        if (age<8) {
            throw new IllegalArgumentException();
        }
            else System.out.println(age);
    }


}
