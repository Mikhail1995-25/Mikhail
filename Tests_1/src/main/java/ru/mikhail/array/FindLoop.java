package ru.mikhail.array;

/**
 * FindLoop
 *
 * @author Mikhail Pushkarev
 * @since 24.02.2020
 * @version 0.1
 *
 *
 */

public class FindLoop {
    /**
     * Method Min
     * @param array - Принимает массив значений.
     * @param el - Принимает минимальный элемент.
     * @return - Возвращает минимальный индекс массива.
     */
    public static int Min (int[] array, int el){
        int str1 = -1;
        for(int index = 0; index < array.length-1; index++){
            if(array[index] == el){
                str1 = index;
            }
        }
        return str1;
    }

    /**
     * Method Min
     * @param array - Принимает массив значений.
     * @param el - Принимает минимальный элемент.
     * @param start - Принимает начальный индекс в массиве.
     * @param finish - Принимает конечный индекс  в массиве.
     * @return - Возвращает минимальный индекс в допустимых индексах массива.
     */
    public static int Min(int[] array, int el, int start, int finish){
        int str1 = -1;
        for(int index = start; index < finish; index ++){
            if(array[index] == el){
                str1 = index;
            }
        }
        return str1;
    }
}
