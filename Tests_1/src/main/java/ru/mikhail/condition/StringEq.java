package ru.mikhail.condition;

/**
 * StringEq
 * @author Mikhail Pushkarev
 * @since 29.02.2020
 * @version 0.3
 */
public class StringEq {
    /**
     * Method check - Сравнивает строки спомощью equals.
     * @param login - Принимает строковое значение для сравнения.
     * @return - Возвращает результат сравнения.
     */
    public static boolean check(String login) {
        String root = new String("root");
        boolean access = root.equals(login);
        return access;
    }

    /**
     * Method Main - Выводит результат на консоль.
     * @param args - Принимает параиетры.
     */
    public static void main(String[] args) {
        String your = "your_name";
        boolean userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);
    }
}
