package buddmMatch;

import java.util.Scanner;

public class doWHILE_Karekok {
    public static void main(String[] args) {


    Scanner scan= new Scanner(System.in);

        boolean flag=false;
        int num=1;
        double sqrt=0;

        do{
            System.out.println("please write a positive number");
           num= scan.nextInt();
           sqrt=Math.sqrt(num);
            System.out.println(sqrt);
           if(num%sqrt==0){
               flag=true;

           }
            System.out.println(flag);
        }while(flag==false);
}
}