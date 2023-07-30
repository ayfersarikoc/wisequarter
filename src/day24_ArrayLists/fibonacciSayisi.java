package day24_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class fibonacciSayisi {
    public static void main(String[] args) {

    }
    public static List<Integer> fibonacciList (int x){
        List<Integer> fibonaccilist= new ArrayList<>();
        int first=0;
        int second=1;
        int temp;

        if(x<=0){
            System.out.println("don't be silly");
            return fibonaccilist;
        }else if(x==1){
            fibonaccilist.add(first);
            return fibonaccilist;
        }else{
            fibonaccilist.add(first);
            fibonaccilist.add(second);
            for (int i=1; i<=x-2; i++){
                fibonaccilist.add(first+second)
            }
        }

    }

}
