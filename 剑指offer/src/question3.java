

/*
    找出数组中重复的数字，给定数组长度n，所有数字都在0~n-1的范围内。
    任意数字可重复，也可重复多次，找出任意一个重复的数字
    例：长度为7的数组{2,3,1,0,2,5,3}，对应输出为2或者3
 */
public class Question3 {
    public static void main(String[] args) {
        int[] a = {2,3,1,0,2,5,3};

        for (int i=0; i<a.length;i++){
            //如果当前位置需要一直比较，则不用动，可以用while实现
            //当当前位置上的数不相等时，
            while (a[i] != i){
                if ()
            }
        }

        int e = 0,d =1;
        swap(e,d);
        System.out.println(e);
        System.out.println(d);
    }

    //常量是值传递，传入的是副本，对原来无影响
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

}
