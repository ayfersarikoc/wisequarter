package day24_ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class qyakadarisimyazma {
    public static void main(String[] args) {

        System.out.println(nameList());
    }
public static List<String> nameList(){
        Scanner scan;
        String name;
        List<String> allNameList=new ArrayList<>();

        do{
            scan=new Scanner(System.in);
            System.out.println("enter a name to add in the list, \n enter Q to finish the list");
            name=scan.nextLine();

            if(!name.equalsIgnoreCase("q")){
                allNameList.add(name);
            }

        }while (!name.equalsIgnoreCase("q"));

            return allNameList;
}


}
