class Test{
    public static void main(String[] args){

        Integer[] al = new Integer[5];
        al[0] = 3;
        al[1] = 5;
        al[2] = 1;
        al[3] = 4;
        al[4] = 2;

        for(int i=0;i<al.length;i++)
            System.out.print(al[i]);

        MergeSort.sort(al);

        System.out.println("");

        for(int i=0;i<al.length;i++)
            System.out.print(al[i]);

        // int[] arr0 = null;
        // int[] arr1 = {};
        // System.out.println(arr0==null);
        // System.out.println(arr0.length==0);//Exception in thread "main" java.lang.NullPointerException
        // System.out.println(arr1==null);
        // System.out.println(arr1.length==0);

        //面试题5 替换空格
        // StringBuffer str = new StringBuffer("hello world");
        // String newStr = Sword.replaceSpace(str);
        // System.out.println(newStr);

        
        // StringBuffer str = new StringBuffer(13);
        // System.out.println(str.length());
        // System.out.println(str.capacity());


        //面试题15
        // int s15  = Sword.numberOf1(127);
        // System.out.println(s15);

        //面试题16
        // double s16  = Sword.power(5, -2);
        // System.out.println(s16);

        //面试题31

        // int[] pushA = {1,2,3,4,5,6,7,8};
        // int[] popA = {1,2,3,6,8,7,5,4,9};
        // System.out.println(Sword.IsPopOrder(pushA, popA));

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