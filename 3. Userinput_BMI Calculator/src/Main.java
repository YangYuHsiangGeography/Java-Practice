import java.util.Scanner; //引入掃瞄器 Scanner

public class Main {
    public static void main(String[] args) {
        Scanner scanner_yang = new Scanner(System.in); // 呼叫掃描器，給使用者輸入
        System.out.println("please type your name here.");
        String userName = scanner_yang.nextLine();
        System.out.println("Hello, " + userName + "!"); // 使用者輸入的文字會回傳（覆蓋）到掃瞄器呼叫的地方

        System.out.println("please type your year of birth.");
        int birthYear=scanner_yang.nextInt();
        System.out.println("Mr./Ms. "+userName +" is " + (2024-birthYear) +" years old, Welcome.");

        System.out.println("please type your year of height(cm).");
        double height=scanner_yang.nextDouble();

        System.out.println("please type your year of weight(kg).");
        double weight=scanner_yang.nextDouble();
        System.out.println("Mr./Ms. "+userName +" 's BMI(Body Mass Index) is " + (weight/((height/100)*(height/100))) +". Good for you.");
// 計算BMI的錯誤：
//在計算BMI時，您使用了 ^ 符號來計算身高的平方，但在Java中，^ 符號表示按位異或運算，不是數學上的指數運算。應該使用 Math.pow() 方法或直接將身高平方，這裡使用直接乘法來計算身高的平方。



    }
}