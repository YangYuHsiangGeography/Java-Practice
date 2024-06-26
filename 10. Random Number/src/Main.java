//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Random random=new Random();
        int x = random.nextInt(6)+1; //像是骰子一樣隨機產生1~6
        // 因為java是從0開始編寫，因此在最後呈現後要+1。

        //產生其他隨機的值
        //double x = random.nextDouble(6)+1; //浮點數
        //boolean x = random.nextBoolean(); //布林值
        System.out.println(x);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}