package buddmMatch;

import java.util.Arrays;

public class slayt174Soru1Array {
    //Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
    //olusturun. Eski array’i yeni haliyle kaydedin.
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        arr=new int[ikiArttir(arr)];

    }

    public static void ikiArttir(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] += 2;
        }
        System.out.println(Arrays.toString(arr));

    }
//        //Soru 1- Verilen bir int array’in tum elemanlarini
//        // 2 artirip bize donduren bir method olusturun.
//        // Eski array’i yeni haliyle kaydedin.
//       arr=arrayElementlerini2Artir(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//      public static int[] arrayElementlerini2Artir(int[]arr){
//        for (int i = 0; i <arr.length ; i++) {
//            //arr[i]=arr[i]=+2;
//            arr[i]+=2;
//
//        }
//
//        return arr;
}
