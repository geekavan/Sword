import java.util.ArrayList;
import java.util.Arrays;
public class Sword{

    /**
     * 面试题4，二维数组中的查找
     * @param target 要查找的数字
     * @param array 二维数组
     * @return  存在返回真，不存在返回假
     */
    public static boolean find(int target, int [][] array) {
        int r = array.length-1;
        int c = 0;
        while(r>-1 && c<array[0].length){
            if(target==array[r][c])
                return true;
            else if(target>array[r][c])
                c++;
            else
                r--;
        }
        return false;
    }

    /**
     * 剑指Offer面试题5，替换空格
     * @param str 原来的字符串
     * @return 替换空格后的字符串
     */
    public static String replaceSpace(StringBuffer str) {
        int spaceNumbers = 0;
        int strLength = str.length();
        for(int i=0; i<strLength; i++){
            if(str.charAt(i)==' ')
                spaceNumbers++;
        }
        int newStrLength = strLength+spaceNumbers*2;
        str.setLength(newStrLength);
        int index = newStrLength-1;
        for(int i=strLength-1;i>-1;i--){
            if(str.charAt(i)==' '){
                str.setCharAt(index--,'0');
                str.setCharAt(index--,'2');
                str.setCharAt(index--,'%');
            }
            else
                str.setCharAt(index--,str.charAt(i));
        }
        return str.toString();
    }

    /**
     * 面试题6，从尾到头打印链表
     * @param listNode
     * @return
     */
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode==null)
            return new ArrayList<Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        ListNode head = listNode;
        while(listNode!=null){
            al.add(listNode.val);
            listNode = listNode.next;
        }
        for(int i=al.size()-1;i>-1;i--){
            al.set(i, head.val);
            head = head.next;
        }
        return al;
    }

    //面试题6，从尾到头打印链表中用到的类
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 面试题7，重建二叉树
     * @param pre
     * @param in
     * @return
     */
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0)
            return null;
        TreeNode root = new TreeNode(pre[0]);
        int rootIndex = 0;
        while(pre[0]!=in[rootIndex]){
            rootIndex++;
        }
        int[] leftIn = Arrays.copyOfRange(in, 0, rootIndex);
        int[] rightIn = Arrays.copyOfRange(in, rootIndex+1, in.length);
        int[] leftPre = Arrays.copyOfRange(pre, 1, rootIndex+1);
        int[] rightPre = Arrays.copyOfRange(pre, rootIndex+1, pre.length);
        root.left = reConstructBinaryTree(leftPre , leftIn);
        root.right = reConstructBinaryTree(rightPre ,rightIn);
        return root; 
    }

    //面试题7重建二叉树中用到的类
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 面试题10斐波那契数列
     * @param n 计算斐波那契数列的第n项
     * @return  斐波那契数列的第n项值
     */
    public static int Fibonacci(int n) {
        if(n<0){
            throw new RuntimeException("n必须大于等于0");
        }
        int first = 0;
        int second = 1;
        int temp;
        for(int i=0;i<n;i++){
            first = first+second;
            temp = first;
            first = second;
            second = temp;
        }
        return first;
    }

    /**
     * 面试题11旋转数组的最小数字
     * @param array 旋转数组
     * @return  旋转数组的最小数字
     */
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

    /**
     * 剑指Offer面试题16，求一个数的整数次方，不考虑大数问题
     * @param base 底数
     * @param exponent 指数
     * @return 底数的指数次方
     */
    public static double power(double base, int exponent){
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
    public static int numberOf1(int number){
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
    public static void findNumsApperOnce(int[] arr, int[] num1, int[] num2){
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
    public static int findNumberApperingOnce(int[] arr){
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