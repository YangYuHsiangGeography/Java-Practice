import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner_yang = new Scanner(System.in);
        System.out.println("please type your name here.");
        String userName = scanner_yang.nextLine();
        System.out.println("Hello, " + userName + "!"); // 使用者輸入的文字會回傳（覆蓋）到掃瞄器呼叫的地方
    }
}