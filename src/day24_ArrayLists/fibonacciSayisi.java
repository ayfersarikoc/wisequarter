package day24_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class fibonacciSayisi {
    public static void main(String[] args) {
        System.out.println("fibonacciList(9) = " + fibonacciList(9));

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
            for (int i=0; i<x-2; i++){
                fibonaccilist.add(fibonaccilist.get(fibonaccilist.size()-1)+fibonaccilist.get(fibonaccilist.size()-2));

            }
            return fibonaccilist;
        }

    }

}
