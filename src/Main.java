public class Main {
    public static void main(String[] args) {

        // Объявляем переменные для входных данных
        double initialBalance = 100.0;      // начальная сумма на счету: 100 рублей
        double replenishmentAmount = 300.0;  // сумма пополнения: 300 рублей
        int bonusThreshold = 1000;           // порог для бонуса: 1000 рублей

        double bonus = 0;  // переменная для хранения бонуса (пока 0)

        // Проверяем, превысила ли сумма пополнения порог
        if (replenishmentAmount > bonusThreshold) {
            // Если пополнение больше 1000 рублей, считаем бонус
            // Но в этом сценарии условие НЕ выполняется, так как 300 > 1000? Нет
            int fullHundreds = (int) (replenishmentAmount / 100);
            bonus = fullHundreds * 1;
        }
        // Если условие НЕ выполняется, бонус остаётся 0

        // Рассчитываем итоговую сумму на счету
        double totalBalance = initialBalance + replenishmentAmount + bonus;

        // Выводим результат на экран
        System.out.println("Начальный счёт: " + (int) initialBalance + " руб.");
        System.out.println("Сумма пополнения: " + (int) replenishmentAmount + " руб.");
        System.out.println("Бонус: " + (int) bonus + " руб.");
        System.out.println("Итоговый счёт: " + (int) totalBalance + " руб.");
    }
}