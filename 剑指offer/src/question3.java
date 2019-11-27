/*
    ·题目：数组中重复的数字
    找出数组中重复的数字，给定数组长度n，所有数字都在0~n-1的范围内。
    任意数字可重复，也可重复多次，找出任意一个重复的数字
    例：长度为7的数组{2,3,1,0,2,5,3}，对应输出为2或者3
 */
public class question3 {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,3,2,6};
        //数组需要指定长度
        int[] duplication = new int[1];

        boolean is =  duplicate(a,a.length,duplication);
        System.out.println(is);
        if (is == true)
            System.out.println(duplication[0]);

    }

    public static boolean duplicate(int[] nums,int length, int[] duplication){
        //数组为空
        if (nums == null || length <= 0){
            return false;
        }
        //数组中的数不符合规则
        for (int i = 0; i < length; i++){
            if (nums[i] < 0 || nums[i] >= length){
                return false;
            }
        }
        //
        for (int i = 0; i < length; i++){
            //如果当前位置跟索引不同，交换
            while (nums[i] != i){
                //如果这两个位相等，则找到一重复数字
                if (nums[i] == nums[nums[i]]){
                    duplication[0] = nums[i];
                    return true;
                }
                swap(nums,i,nums[i]);
            }
        }

        return false;
    }

    //常量是值传递，传入的是副本，对原来无影响
    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
