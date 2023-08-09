package buddmMatch;

import java.util.Scanner;

public class slayt125Soru10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir String girin");
        String str = scanner.nextLine();
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 += str.charAt(i);
        }
        System.out.println(str1);

    }
}

