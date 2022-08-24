package junit;

public class C02_StringChange {

    /*
    Verilen bir String'deki ilk iki harf A var ise bunlari silen method creat ediniz.

    ABCD -> CD
    ABC -> BC
    A -> ""
    AA -> ""
    B -> B
     */


    public String ilkIkiASil(String str) {

        if (str.length()<=2) {
            return str.replaceAll("A","");
        }

        String ilkIkiKarakter=str.substring(0,2); // 0 ve 1. karakter
        String ilkIkiKarakterSonrasi=str.substring(2);

        return ilkIkiKarakter.replaceAll("A","")+ilkIkiKarakterSonrasi;

        }



}
