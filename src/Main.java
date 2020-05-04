public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int incoming = 1500; // Сумма пополнения
        int bonus;
        if (incoming > 1000) {
            bonus = incoming / 100;
        } else {
            bonus = 0;
        }
        balance += incoming + bonus;
        System.out.println("Ваш баланс = " + balance);
        System.out.println("Вам начислен бонус = " + bonus);
    }
}