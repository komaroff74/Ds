public class Main {
    public static void main(String[] args) {
        int amount = 23300;
        int score = 0;
        int total = amount + score;
        if (amount > 1000) {
            int bonus = amount / 100;
            int prize = amount + score + bonus;
            System.out.println("ваш счет равен" + prize);
            System.out.println("ваш бонус" + bonus);
        } else {
            System.out.println("Ваш счет равен" + total);
        }
    }
}