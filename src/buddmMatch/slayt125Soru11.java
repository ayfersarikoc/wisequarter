package buddmMatch;

import java.util.Scanner;

public class slayt125Soru11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir Sayi girin");
        int sayi=scanner.nextInt();
    boolean b=false;
        for (int i=2; i<=sayi; i++){
            if (sayi%i==0 ){
               b=false;
            }else{
               b=true;
            }
        }
        if (b==true){
           System.out.println("bu bir asal sayidir");
        }else {
            System.out.println("bu bir asal sayi degildir");
        }

    }
}
