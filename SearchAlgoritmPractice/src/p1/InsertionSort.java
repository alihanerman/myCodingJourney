package p1;

public class InsertionSort{

    public  static void insertionSort (int[] arr){
        int a, l , i ;
        for(a=1; a< arr.length ; a++){
        i =arr[a]; // yerleştirilecek eleman
        l= a;

            while (l > 0 && arr[l-1]>i) {
                arr[l] = arr[l-1];
                l--;
            }
            arr[l]= i ;
        }

    }
}
