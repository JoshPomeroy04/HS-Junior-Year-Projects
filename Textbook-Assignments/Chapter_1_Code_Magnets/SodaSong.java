public class SodaSong{
    public static void main(String[] args) {
        int sodaNum = 99;
        String word = "cans";

        while (sodaNum > 0){
            if (sodaNum == 1){
                word = "can";
            }

            System.out.println(sodaNum + " " + word + " of soda on the wall");
            System.out.println(sodaNum + " " + word + " of soda.");
            System.out.println("Take on down.");
            System.out.println("Pass it around.");
            sodaNum = sodaNum - 1;

            if (sodaNum == 0){
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }
}

