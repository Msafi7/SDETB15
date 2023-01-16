package Class4;

public class NestIF1 {
    public static void main(String[] args) {
        int money = 1000;
        String day = "Sunday";
        Boolean mood = false;

        if (money > 700) {

            if (mood) {

                System.out.println("lets go shopping");
            } else {
                System.out.println("lets save some money first");
            }
        }
    }
}
