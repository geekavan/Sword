class Test{
    public static void main(String[] args){

        //面试题5 替换空格
        // StringBuffer str = new StringBuffer("hello world");
        // String newStr = Sword.replaceSpace(str);
        // System.out.println(newStr);

        
        StringBuffer str = new StringBuffer(13);
        System.out.println(str.length());
        System.out.println(str.capacity());


        //面试题15
        // int s15  = Sword.numberOf1(127);
        // System.out.println(s15);

        //面试题16
        // double s16  = Sword.power(5, -2);
        // System.out.println(s16);

        /* 面试题56 题目一
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        int[] arr = {1,2,3,4,5,6,8,7,9,5,4,3,1,8,9,7};
        Sword.findNumsApperOnce(arr, num1, num2);
        System.out.println(num1[0]+"____"+num2[0]);
        */

        /* 面试题56 题目二
        int[] arr = {1,1,1,2,2,2,3,3,3,6,6,6,9,9,9,8,8,8,7,7,7,4,2,2,2};
        int num = Sword.findNumberApperingOnce(arr);
        System.out.println(num);
        */
    }
}