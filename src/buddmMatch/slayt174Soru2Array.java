package buddmMatch;

public class slayt174Soru2Array {
    public static void main(String[] args) {
      //  Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
     //   method yaziniz.

        int[]  arr= {10,20,30,40,50};
  ArrayToplam(arr);

    }
    public static void ArrayToplam(int[] arr){
        int sum=0;
       // for (int i=0; i< arr.length;i++){
            //sum+=arr[i];
       // }
        for (int each:arr
             ) {
            if(each>0)
                sum+=each;
        }
        System.out.println(sum);


    }


}
