public class Main {
    public static void main(String[] args) {
        int price = 80;
        int rubmile = 20;
        int ticket = 20;
        int total = price * ticket;
        boolean isRegistered = true;

        int bonus = isRegistered ? total / rubmile : 0;

        System.out.printf("Бонус с покупки " + bonus);}

}
