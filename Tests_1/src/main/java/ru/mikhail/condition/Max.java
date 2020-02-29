package ru.mikhail.condition;

/**
 * Max
 * @author Mikhail Pushkarev
 * @since 29.02.2020
 * @version 0.5
 */
public class Max {
    /**
     * Method max - Использование тернарного оператора.
     * @param first - Первый параметр.
     * @param second - Второй параметр.
     * @return - Возвращает результат условия.
     */
    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }
}
