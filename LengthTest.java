import java.util.ArrayList;
class LengthTest{
    public static void main(String[] args){
        int[] arr = new int[8];
        int arrLength = arr.length;
        System.out.println("arrLength: "+arrLength);

        String s = new String();
        s = " hello world ";
        System.out.println("sLength: "+s.length());
        s = s.trim();
        System.out.println("sLength: "+s.length());

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        System.out.println("arrListLength: "+arrList.size());
        arrList.add(5);
        System.out.println("arrListLength: "+arrList.size());
    }
}