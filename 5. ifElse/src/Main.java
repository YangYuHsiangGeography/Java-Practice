//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean rain = false;

        if (rain) {
            System.out.println("drive to work");
        }else{
            System.out.println("walk to work");
        }


        // Beitou Puglic Hotspring Facility, Taipei City, Taiwan
        int age =27;
        if(age>=65){
            System.out.println("entry fee is 30 NTD.");
        } else if (age>18) {
            System.out.println("entry fee is 60 NTD.");
        }else{
            System.out.println("entry fee is 30 NTD. ");
        }

// 運算符號
        // && means AND; || means OR; ! means NOT
        // == means equal; != means not equal
        // 自川鄉等比較使用 .equals()

        System.out.println(18<age && age <30); // 若只有寫成這樣 18<age <30 會出錯
        System.out.println(18<age || age <30); // 若只有寫成這樣 18<age <30 會出錯
        System.out.println(64<age && age <100); // 若只有寫成這樣 18<age <30 會出錯
        System.out.println(64<age || age <100);// 若只有寫成這樣 18<age <30 會出錯
        System.out.println(age==25);
        System.out.println(age!=26);

        String petname="turtle";
        System.out.println(petname.equals("cat")); //看字串的相等比較
        System.out.println(petname.equals("turtle"));


    }
}