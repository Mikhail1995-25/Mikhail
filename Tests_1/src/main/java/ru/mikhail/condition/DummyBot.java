package ru.mikhail.condition;

/**
 * DummyBot
 *
 * @author Mikhail Pushkarev
 * @since 29.02.2020
 * @version 0.4
 */
public class DummyBot {
    /**
     * Method answer - В этом методе операторы условия сравнивают строки.
     * @param question - Параметр принимает аргументы строки.
     * @return - Возвращает результат условия.
     */
    public static String answer(String question) {
        String rs1 = "Это ставит меня в тупик. Задайте другой вопрос";
        if ("Привет, Бот.".equals(question)) {
            rs1 = "Привет, умник";
        } else if ("Пока.".equals(question)) {
            rs1 = "До скорой встречи.";
        }
        return rs1;
    }
}
