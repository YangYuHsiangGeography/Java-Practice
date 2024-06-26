
// Nested Loop 巢狀回圈（回圈裡面包回圈）
public class Main {
    public static void main(String[] args) {
        for(int i=0; i<3; i++ ){
            for(int j=0; j<3; j++){
                System.out.println((i + " , " + j));
            }
        } //  先執行最裏面（內層）的回圈，跑到滿足條件後會跳出來，再跑外面的回圈

int[][] nums = {{1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}};
 for(int i=0; i<4; i++ ){
        for(int j=0; j<3; j++){
        //System.out.println((nums[i][j]));
            System.out.print((nums[i][j]));
        }
     System.out.println();
        } //  先執行最裏面（內層）的回圈，跑到滿足條件後會跳出來，再跑外面的回圈


        // Break & Continue
     for (int k=0;k<10;k++){
         if(k==5){
             break;
             //continue;
         }
         System.out.println(k);
     }

        for (int u = 0; u <10; u++){
            if(u ==5){
                u++;
                continue;  // 跳過5繼續
            }
            System.out.println(u);
        }


    }
}
