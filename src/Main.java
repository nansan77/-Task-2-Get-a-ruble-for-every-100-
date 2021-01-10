public class Main {
    public static void main(String[] args) {
        boolean topup = false;
        int adding;
        if (topup) {
            adding = 1000;
        } else {
            adding = 100;
        }
        int every = 100;
        int limit = 1000;
        int bonus = adding / every;
        if (adding < limit) {
            bonus = 0;
        }
        System.out.println(bonus);


    }

}
