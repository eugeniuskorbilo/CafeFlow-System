package com.cafeflow;

/**
 * Головний клас системи керування замовленнями в кафе «CafeFlow».
 * Проведено рефакторинг: логіку авторизації та обробки замовлень розділено на окремі методи.
 */
public class Main {
    
    public static void main(String[] args) {
        Main app = new Main();
        app.runSystem();
    }

    /**
     * Основний життєвий цикл запуску системи кафе.
     */
    public void runSystem() {
        System.out.println("--- [CafeFlow System Started] ---");
        
        // Імітація успішної авторизації офіціанта за PIN-кодом
        if (authenticateStaff("1234")) {
            processOrder("Стіл №5", "Піца Маргарита");
        }
    }

    /**
     * Валідація та перевірка прав доступу працівника.
     */
    public boolean authenticateStaff(String pinCode) {
        if (pinCode == null || pinCode.trim().isEmpty()) {
            System.out.println("Помилка: PIN-код не може бути порожнім.");
            return false;
        }
        return pinCode.equals("1234");
    }

    /**
     * Формування замовлення та миттєва передача на кухню.
     */
    public void processOrder(String targetTable, String dishName) {
        System.out.println("Замовлення сформовано для: " + targetTable);
        System.out.println("Додано страву: " + dishName);
        System.out.println("Статус: Успішно передано на KDS-монітор кухні.");
    }
}