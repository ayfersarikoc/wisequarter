package buddmMatch;

import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir pozitif  bir sayi girin: ");
        int sayi=scanner.nextInt();
for(int i=1 ; i<=sayi; i++){

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            }else{
                System.out.println(i);
            }
        }
    }
}
