public class Main {
    public static void main(String[] args) {
   System.out.println(12+18);
   System.out.println(12.2+18.3);
   System.out.println("12"+"18");
   System.out.println(true);
   System.out.println(false);

   String name="goat"; // 設定一個字串（String 要大寫）的變數名稱為 name
   System.out.println(name);
   //String name ="fish"; // 設定一個字串（String 要大寫）的變數名稱為 name  這樣會失敗，記得不要再寫一次 String
   //System.out.println(name); //ariable name is already defined in method main(java.lang.String[])

   name ="fish"; // 把變數原本的字串"goat" 改成 "fish"
   System.out.println(name); //ariable name is already defined in method main(java.lang.String[])

   char lastname= 'E'; // 注意一定要單引號
   System.out.println(lastname);

        // 整數 位數儲存由小到大，通常都使用 int
        // byte :-128~127
        //short:-32768~32767
        //*int:-2147483648~214748647 （21億）
        //long :-9223372036854665808~9223372036854775807 // 要在數字後面加上大寫的L

   int age=18;
        System.out.println(age);

        // 浮點數
        // float : 精準到小點下7位 //要在數字後面加上小寫 f
        // *double : 精準到小點下15位
   double height=177.84;
        System.out.println(height);

   boolean gay = true;
        System.out.println(gay);

// 用 + 加號讓 字串 與 數值 或其他元素並陳。
    System.out.println(name+"'s height is "+height + " cm.");

    }
}
// 變數命名規則
// 1. 子能是字母、數字、底線（_） 或是 錢字號 $ 的組合
// 2. 數字不能開頭
// 3. 不能是保留字, 例如 int, char, String等
//4. 變數命名習慣 一個單字全小寫（age） 兩個單字合併要用大寫標明(myAge)
//5.  要取有意義的變數名稱，不要取看不懂的 abc等