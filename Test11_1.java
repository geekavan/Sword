public class Test11_1{
    public static void main(String[] args){
        int[] arr0 = {1,0,1,1,1,1,1};
        int[] arr1 = {5,6,7,8,0,1,2,3,4};
        int[] arr2 = {0,1,2,3,4,5,6,7,8};
        int min = minNumberInRotateArray(arr1);
        System.out.println(min);
        System.exit(0);
    }
    public static int minNumberInRotateArray(int[] array) {
        if(array==null)
            throw new RuntimeException("数组不可以为空");
        int leftIndex = 0;
        int rightIndex = array.length-1;
        if(array[leftIndex]<array[rightIndex]){
            return array[leftIndex];
        }
        int midIndex;
        while((rightIndex-leftIndex)>1){
            midIndex = (leftIndex + rightIndex)/2;
            int temp;
            if(array[leftIndex] > array[midIndex])
                rightIndex = midIndex;
            else if(array[leftIndex] < array[midIndex])
                leftIndex = midIndex;
            else if((array[leftIndex] == array[midIndex]) || (array[rightIndex] == array[midIndex])){
                temp = leftIndex+1;
                if(array[leftIndex] == array[temp])
                    leftIndex++;
                temp = rightIndex-1;
                if(array[rightIndex] == array[temp])
                    rightIndex--;
            }
        }
        return array[rightIndex];
    }
}