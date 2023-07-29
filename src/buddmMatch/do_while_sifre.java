package buddmMatch;

import java.util.Scanner;

public class do_while_sifre {
    /*Soru 2- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
    kontrol edin ve sifredeki hatalari yazdirin.
    Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
    sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
- Sifre kucuk harf icermelidir
- Sifre buyuk harf icermelidir
- Sifre ozel karakter icermelidir
- Sifre en az 8 karakter olmalidir.*/
    public static void main(String[] args) {

        Scanner scan;
        String password;
        boolean result = false;

        while (result == false) {
            scan = new Scanner(System.in);
            System.out.println("please enter your password");
            password = scan.nextLine();
            result = passwordcheck((password) );
        }

    }

    public static boolean passwordcheck(String a) {
        boolean result = true;
        boolean lowerCase = false;
        boolean upperCase = false;
        boolean specialChar = false;
        boolean passwordLength = false;

        for (int i = 0; i < a.length(); i++) {
            if (Character.isLowerCase(a.charAt(i))) {
                lowerCase = true;
            }
            if (Character.isUpperCase(a.charAt(i))) {
                upperCase = true;
            }
            if (!Character.isLetterOrDigit(a.charAt(i))) {
                specialChar = true;
            }
            if (a.length() >= 8) {
                passwordLength = true;
            }


        }
        if (lowerCase == false) {
            System.out.println("Password must contain  lowercase letters ");
            result = false;
            return result;
        } else if (upperCase == false) {
            System.out.println("Password must contain uppercase letters");
            result = false;
            return result;
        } else if (specialChar == false) {
            System.out.println("Password must contain special characters");
            result = false;
            return result;
        } else if (passwordLength == false) {
            System.out.println("Password length must be at least 8 characters");
            result = false;
            return result;
        } else {
            return result;
        }

    }
}


