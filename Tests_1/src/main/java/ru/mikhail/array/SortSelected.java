package ru.mikhail.array;

/**
 * SortSelected
 * @author Mikhail Pushkarev
 * @since 24.02.2020
 * @version 0.4
 */

public class SortSelected {
    /**
     * Method sort
     * @param data - Принимает массив значений.
     * @return - Возвращает упорядоченный массив значений.
     */
    public static int[] sort(int[] data){
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length);
            int index = FindLoop.Min(data, min, i, data.length);
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        return data;
    }
}
