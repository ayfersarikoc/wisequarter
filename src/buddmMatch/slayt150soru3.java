package buddmMatch;

public class slayt150soru3 {
    public static void main(String[] args) {
        //While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        //donduren bir method olusturun.
        String str= "java guzeldir";
        int sayi=str.length()-1;
    String str1="";

        while(sayi>=0){

           str1+=str.charAt(sayi);
            sayi--;

        }
        System.out.println(str1);


    }
}
