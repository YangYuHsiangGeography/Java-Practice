
public class Main {
    public static void main(String[] args) {
//    String[] names={"turtle","cat","dog"}; //創造儲存字串的陣列(arrary)
//        System.out.println(names[0]);
//        System.out.println(names[1]);
         //也可以先設定陣列的大小，再賦值
     String[] names=new String[6];
     names[0]="1";
        names[1]="2";
        names[2]="3";
        names[3]="4";
        names[4]="5";
        names[5]="6";
        System.out.println(names[5]);


    int[] age = {2,3,4};
        System.out.println(age[1]);

    double[] length = {1.1,1.2,1.3};
        System.out.println(length[1]);
        length[1]=3.2;
        System.out.println(length[1]);


    // 2D array 2為陣列，陣列裡面再儲存陣列

    int[][] nums={ //也可以改成 浮點數double 或是字串 String(注意大寫)
            {1,2,3},
            {4,5,6},
            {7,8,9}};
    System.out.println(nums[1][1]);
    System.out.println(nums[0][0]);

    }
}