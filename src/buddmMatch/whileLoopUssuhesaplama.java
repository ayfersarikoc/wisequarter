package buddmMatch;

import java.util.Scanner;

public class whileLoopUssuhesaplama {
    public static void main(String[] args) {
        Scanner scan =new Scanner((System.in));
        System.out.println("please write a number");
        int sayi=scan.nextInt();
        System.out.println("please write a number for times calculating");
        int us=scan.nextInt();

        uslusayihesaplama(sayi,us);

    }

    public static void uslusayihesaplama(int sayi , int us){
    int sonuc=1;

        while( us>0){
            sonuc=sonuc*sayi;
            us--;
        }
        System.out.println("sonuc :"+sonuc);



    }

}
