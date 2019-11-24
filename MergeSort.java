public class MergeSort{
    private static Comparable[] aux;
    public static void sort(Comparable[] arr){
        aux = new Comparable[arr.length];
        sort(arr, 0, arr.length-1);
    }
    private static void sort(Comparable[] arr, int lo, int hi){
        if(lo>=hi)
            return;
        int mid = (lo+hi)/2;
        sort(arr, lo, mid);
        sort(arr, mid+1, hi);
        merge(arr, lo, mid , hi);
    }
    private static void merge(Comparable[] arr, int lo, int mid, int hi){
        for(int k=lo;k<=hi;k++){
            aux[k] = arr[k];
        }
        int i = lo;
        int j = mid+1;
        for(int k=lo;k<=hi;k++){
            if(i>mid)      arr[k] = aux[j++];
            else if(j>hi)        arr[k] = aux[i++]; 
            else if(less(arr, i, j))     arr[k] = aux[i++];
            else                        arr[k] = aux[j++];
        }
    }
    private static boolean less(Comparable[] arr, int i, int j){
        return arr[i].compareTo(arr[j])<0;
    }
}
class Test2{
    public static void main(String[] args){
        Integer[] arr = {1,9,8,7,3,5,4,6,2};
        HeapSort.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}