package buddmMatch;

import java.util.Scanner;

public class slayt125Soru9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir String girin");
        String str=scanner.nextLine();

        for (int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }


    }
}
