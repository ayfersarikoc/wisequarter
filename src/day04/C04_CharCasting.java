package day04;

import com.sun.swing.internal.plaf.synth.resources.synth_sv;

import java.util.Scanner;

public class C04_CharCasting {
    //kullanicidan bir char isteyin, sonraki 3 ardisik chari yazdirin.
    //ornegin; input:a;  output: b,c,d

    public static void main(String[] args) {




    Scanner scan =new Scanner(System.in);
        System.out.println("bir harf girin");
    char girilenK= scan.next().charAt(0);
        System.out.println(girilenK+1);





        }




}
