public class Sword{

    /**
     * 剑指Offer面试题16，求一个数的整数次方，不考虑大数问题
     * @param base 底数
     * @param exponent 指数
     * @return 底数的指数次方
     */
    static double power(double base, int exponent){
        if(base==0 && exponent==0)
            return 0;
        if(exponent<0)
            return 1/(power(base, -exponent));
        if(exponent==0)
            return 1;
        if(exponent%2==0){
            double temp = power(base, exponent/2);
            return temp*temp;
        }
        else
            return base*power(base, (exponent-1));
    }

    /**
     * 剑指Offer面试题15，求一个数二进制表示中1的个数
     * @param number 要求的二进制中1的个数的数字 
     * @return  1的个数
     */
    static int numberOf1(int number){
        int result = 0;
        while(number!=0){
            result++;
            number = number&(number-1);
        }
        return result;
    }
    
    /**
     * 找到一个数组中只出现一次的两个数字，其他数字都出现了两次
     * @param arr 
     * @param num1 用来存储两个数字之一
     * @param num2 用来存储两个数字之一
     */
    static void findNumsApperOnce(int[] arr, int[] num1, int[] num2){
        if(arr.length < 2)
            return;
        num1[0] = arr[0];
        num2[0] = arr[1];
        int temp = arr[0];
        for(int i = 0;i<arr.length;i++){
            temp = temp^arr[i];
        }
        int pos;
        for(pos = 0;(temp&1)!=1;pos++)
            temp = temp>>1;
        for(int i=0;i<arr.length;i++){
            if((arr[i]>>pos)==0)
                num1[0]^=arr[i];
            else
                num2[0]^=arr[i];
        }
    }

    /**
     * 用查找一个数组中只出现过一次的数字，其他数字都出现了三次
     * @param arr
     * @return 返回该数字
     */
    static int findNumberApperingOnce(int[] arr){
        int[] bit = new int[32];
        for(int i=0;i<arr.length;i++){
            int temp = 1;
            for(int j=0;j<32;j++){
                bit[j]+=(arr[i]&(temp<<j))>>>j;
            }
        }
        int res = 0;
        for(int i=0;i<32;i++){
            if(bit[i]%3==1)
                res+=(1<<i);
        }
        return res;
    }
}