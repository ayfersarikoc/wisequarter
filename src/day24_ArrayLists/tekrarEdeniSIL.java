package day24_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tekrarEdeniSIL {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(tekrarsiz(new int[]{2, 3, 2, 5, 6, 5, 4})));
    }

    public static int[] tekrarsiz(int[] arr1){
        List<Integer> aList1 = new ArrayList<>();
        for(int i=0; i<arr1.length;i++){
          if(!(aList1.contains(arr1[i]))){
              aList1.add(arr1[i]);
            }
        }
        int[] arr= new int[aList1.size()];

        for(int i=0; i<arr.length; i++){
            arr[i]=aList1.get(i);
        }
        return arr;
    }
}
