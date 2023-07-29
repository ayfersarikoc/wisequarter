package teamQuestions;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("please input a String");
        String str= scan.next();

        StringLetter(str,3,5);
    }
    public static void StringLetter( String str, int firstIndx, int lastIndx ){

        if(firstIndx>lastIndx){
            System.out.println("First Index should be smaller than Last index");

        }else if(lastIndx>str.length()){
            System.out.println("Last index should be smaller than the length");
        }else{
        System.out.println(str.substring(firstIndx,lastIndx) );// ikinci yontem
           // for(int i=firstIndx; i<lastIndx; i++){ // ilk yontem
            //    System.out.print(str.charAt(i));

            }
        }

    }

