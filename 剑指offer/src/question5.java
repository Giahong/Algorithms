/*
    ·题目：替换空格
    给定字符串中有空格，将空格替换成%20，
    难点：一个位替换成三个位，字符串中数组实现
 */

public class question5 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("We are happy");
//        StringBuffer buffer = new StringBuffer("a a a a a a a a a a a");
        System.out.println(replaceSpace(buffer));
    }


    public static String replaceSpace(StringBuffer str){
        //先计算第一个串的长度，生成更大的数组长度
        int P1 = str.length() - 1;
        for (int i = 0; i <= P1; i++){
            if (str.charAt(i) == ' '){
                str.append("  ");
            }
        }
        //从后往前遍历，复制字符串数组
        int P2 = str.length() - 1;
        while (P1 >= 0 && P2 > P1){
            if (str.charAt(P1) != ' '){
                str.setCharAt(P2--, str.charAt(P1--));  //复制后要移位
            }else {
                str.setCharAt(P2--,'0');
                str.setCharAt(P2--,'2');
                str.setCharAt(P2--,'%');
                P1--;
            }
        }
        return str.toString();
    }


//    public static String replaceSpace(StringBuffer str) {
//        int P1 = str.length() - 1;
//        for (int i = 0; i <= P1; i++)
//            if (str.charAt(i) == ' ')
//                str.append("  ");
//
//        int P2 = str.length() - 1;
//        while (P1 >= 0 && P2 > P1) {
//            char c = str.charAt(P1--);
//            if (c == ' ') {
//                str.setCharAt(P2--, '0');
//                str.setCharAt(P2--, '2');
//                str.setCharAt(P2--, '%');
//            } else {
//                str.setCharAt(P2--, c);
//            }
//        }
//        return str.toString();
//    }

}
