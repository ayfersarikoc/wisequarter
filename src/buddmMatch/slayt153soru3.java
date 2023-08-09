package buddmMatch;

import java.util.Scanner;

public class slayt153soru3 {
    public static void main(String[] args) {
        // Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
        //bulunuz, tamkare ise true değilse false yazdırınız.
        //Ornek : input : 16, output: 4
        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen bir sayi girin");

        int sayi = scanner.nextInt();
        int i = 1;
        boolean b = false;

        do {
                if (sayi / i == i) {
                b=true;
            }
                i++;

        } while (i<sayi & b==false);
        System.out.println(b);
    }
}
