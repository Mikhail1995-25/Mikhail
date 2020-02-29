package ru.mikhail.condition;

/**
 * AlertDivByZero
 *
 * @author Mikhail Pushkarev
 * @since 29.02.2020
 * @version 0.2
 */
public class AlertDivByZero {
    /**
     * Method main - выводит результат на консоль.
     * @param args - Приимает параметр.
     */
    public static void main(String[] args) {
        possibleDiv(-1);
        possibleDiv(0);
    }

    /**
     * Method possibleDiv - Использует оператор условия для направления кода по ветке.
     * @param number - принимает параметр числа, для определения результата.
     *  Возвращает результат решения.
     */
    public static void possibleDiv(int number) {
        if(number == 0){
            System.out.println("Could not div by 0");
        } else {
            System.out.println("This is negative numbers");
        }
    }
}
