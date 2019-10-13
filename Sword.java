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
}