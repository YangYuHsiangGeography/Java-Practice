public class Main {
    public static void main(String[] args) {
        int i = 0;

        // while loop
        while (i < 6) {
            System.out.println(i);
            i++; // i=i+1 or i+=1
        }

        i = 0;
        while (i < 3) {
            System.out.println(i);
            i++;
        }

        // do-while loop
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 3);

        // while loop with array
        int[] nums = {10, 20, 30, 40};
        int j = 0;
        while (j < nums.length) {
            System.out.println(nums[j]);
            j++;
        }

        // for loop
        for (int t = 0; t < 5; t++) {
            System.out.println(t);
        }

        // for loop with increment
        for (int k = 0; k < 9; k += 2) {
            System.out.println(k);
        }

        // for loop decrementing
        for (int r = 10; r > 1; r -= 2) {
            System.out.println(r);
        }

        // for loop with sum and printing
        int sum = 0;
        for (int u = 1; u <= 100; u++) {
            sum += u;
            System.out.println(u);
            System.out.println(sum);
        }

        // For loop with array (corrected)
        int[] number = {10, 20, 30, 40, 50};
        for (int h = 0; h < number.length; h++) {
            System.out.println(number[h]);
        }

        // Enhanced for loop (for-each) with array
        int[] nnumber = {10, 20, 30, 40, 50};
        for (int num : nnumber) {
            System.out.println(num);
        }
    }
}
