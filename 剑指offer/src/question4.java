
/*
    ·题目：二维数组中的查找
    给定一个二维数组，每一行从左到右递增，每一列从上到下递增，构造一个函数输入二维数组和整数。
    返回这个整数是否在这个数组中

    ·思路：从右上角开始，因为该位置下面的都比他大，左边的都比它小，可作为筛选条件
 */


public class question4 {

    public static void main(String[] args) {
        int[][] a = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24}
        };
//        int[][] b = new int[5][];
//        System.out.println(find(b,b.length,b[0].length,23)); //空指针测试
        System.out.println(find(a,a.length,a[0].length,23));


    }

    //数组，行，列，要查的数字
    public static boolean find(int[][] arrays, int rows, int cols, int number){

       int r = 0;
       int c = cols - 1;

       //条件检查
       if (arrays != null && rows > 0 && cols > 0){
            while (r<=rows-1 && c>=0){
                if (arrays[r][c] == number){
                    return true;
                }else if (arrays[r][c] > number){  //该列下的数据都比number大
                    c--;
                }else if(arrays[r][c] < number){    //该行左边的数据都比number小
                    r++;
                }
            }
       }
       return false;
    }


}
