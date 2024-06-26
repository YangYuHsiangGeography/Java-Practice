import java.util.Scanner;

// 這個範例只是 ifelse 與 switch 關係的範例
// 他輸入不符合指令的參數沒有重新出入的功能


// 兩個斜線可以新增單行註解

/*

這樣一個斜線＋星星 可以讓整個段落都變成註解

 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示使用者輸入字母
        System.out.println("請輸入a~g以獲取對應的星期：");
        String key = scanner.nextLine();

        // Switch 可以跟 ifelse  相互交互使用，
        // Switch 的變數查找與對應可以用字串 與 整數，但不適用浮點數。

        switch (key) {
            case "a":
                System.out.println("星期日");
                break;
            case "b":
                System.out.println("星期一");
                break;
            case "c":
                System.out.println("星期二");
                break;
            case "d":
                System.out.println("星期三");
                break;
            case "e":
                System.out.println("星期四");
                break;
            case "f":
                System.out.println("星期五");
                break;
            case "g":
                System.out.println("星期六");
                break;
            default:
                System.out.println("請輸入a~g");
                break;
        }

        // 如果你想使用 if 語句來處理數字輸入，可以取消以下註解

        System.out.println("請輸入1~7以獲取對應的星期：");
        int num = scanner.nextInt();

        if (num == 1) {
            System.out.println("星期日");
        } else if (num == 2) {
            System.out.println("星期一");
        } else if (num == 3) {
            System.out.println("星期二");
        } else if (num == 4) {
            System.out.println("星期三");
        } else if (num == 5) {
            System.out.println("星期四");
        } else if (num == 6) {
            System.out.println("星期五");
        } else if (num == 7) {
            System.out.println("星期六");
        } else {
            System.out.println("請輸入1~7");
        }

    }
}
