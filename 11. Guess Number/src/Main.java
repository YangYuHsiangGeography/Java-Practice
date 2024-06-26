// yangyuhsiang 楊宇翔
// Guess Number 猜數字
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Random random=new Random();
        int answer =random.nextInt(100)+1;
        //System.out.println(answer);

        Scanner scanner = new Scanner(System.in);
        while(true){ //可以無限做猜測
            System.out.print("Please input number between 1 and 100 : ");
            int guess=scanner.nextInt();

            if(guess<answer){
                System.out.println("Please guess bigger"); //println 會換行 //print 不會換行
            }
            else if(guess>answer){
                System.out.println("Please guess smaller");
            }
            else if(guess==answer){
                System.out.println("Bingo!");
                break;
            }
        }

    }
}
