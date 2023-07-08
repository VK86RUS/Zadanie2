public class Main {
    public static void main(String[] args) {

        int startingScore = 100; // Начальный счёт
        int replenishment = 1000; // Сумма пополнения счёта

        int bonus = replenishment / 100;
        if (replenishment > 1000) {
            System.out.println("Итоговый счёт" + (startingScore + replenishment + bonus));
            System.out.println("Количество бонусных рублей" + bonus);
        }
        else {
            System.out.println("Итоговый счёт" + (startingScore + replenishment));
            System.out.println("Количество бонусных рублей" + 0);
        }
    }
}