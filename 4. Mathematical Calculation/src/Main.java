public class Main {
    public static void main(String[] args) {
    int x=10;
    System.out.println(x%4); // 10%2 = 10/4 的餘數
    System.out.println(x/3);
    x=x+1; //把右邊的計算是的結果存到等數左邊的變數裡面
    x+=1; // 此行等於x=x+1 其他 +-*/ 均可使用此格式
    System.out.println(x);

    double y=10.0; // 變數名稱不能再用x了，因為用過了
    System.out.println(y/3);


    // 比大小
        int larger=Math.max(101,51); // 為用最大的數字覆蓋變數 larger
                System.out.println(larger);

        int smaller=Math.min(13,32); // 為用最小的數字覆蓋變數 smaller
        System.out.println(smaller);



//   做次方 Math.pow Math.pow(3,2)
        double pow1=Math.pow(3,2);
        System.out.println(pow1);
//  次方大於三
//  若指數次方大於三，我們可以用剛學到的唸法表示，例如：
//「五的四次方」讀作
// five to the power of four
// = five to the fourth power
// = five to the fourth
//
//「七的五次方」讀作
//  seven to the power of five
//  = seven to the fifth power
//  = seven to the fifth
//
//  平方與立方
//  遇到「二次方」和「三次方」則有不一樣的唸法：
//
//「二次方」又稱作「平方」，英文是 square。
// 「五的平方」我們就會說 five squared。
//「三次方」又稱作「立方」，英文是 cube。
// 「五的立方」我們就會說 five cubed。


     // round the number 四捨五入

        System.out.println(Math.floor((4.0*7)/3.0)); //無條件捨去
        System.out.println(Math.ceil((4*7)/3.00)); //無條件進位
        System.out.println(Math.round((4*7)/3.000)*10/10.0); //變成整數 四捨五入

    }
}