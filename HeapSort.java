public class HeapSort{
    public static void sort(Comparable[] arr){
        if(arr==null || arr.length==0)
            return ; 
        int len = arr.length-1;
        for(int k =(len-1)/2;k>=0;k--){
            sink(arr, 0, len);
        }
        while(len>0){
            swap(arr, 0, len--);
            sink(arr, 0, len);
        }
    }
    private static void sink(Comparable[] arr, int from, int to){
        int k = from;
        while((2*k+1)<=to){
            int j = 2*k+1;
            if(j<to && less(arr, j, j+1))    j++;
            if(!less(arr, k, j))           break;
            swap(arr, k, j);
            k = j;  
        }
    }
    private static void swap(Comparable[] arr, int i, int j){
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static boolean less(Comparable[] arr, int i, int j){
        return arr[i].compareTo(arr[j])<0;
    }
}
class Test1{
    public static void main(String[] args){
        Integer[] arr = null;
        HeapSort.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}