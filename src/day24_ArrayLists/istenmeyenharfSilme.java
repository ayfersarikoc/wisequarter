package day24_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class istenmeyenharfSilme {
    public static void main(String[] args) {

        String[] arr= {"Mehmet","Ramazan","Ozan","Berk","Nergiz","Ayfer","Bugra"};
        List<String> names=new ArrayList<>();
        for (int i=0; i< arr.length; i++) {
            names.add(arr[i]);

        }
        System.out.println(deletedUnwantedLettersName(names,"a"));
    }
    public static List<String> deletedUnwantedLettersName (List<String> names, String unwantedLetter){
       List<String> letter1=new ArrayList<>();
        for (int i=0; i<names.size();i++){
            if(!(names.get(i).toLowerCase().contains(unwantedLetter.toLowerCase()))) {
                letter1.add(names.get(i));

            }


        }
        return letter1;

    }

}
