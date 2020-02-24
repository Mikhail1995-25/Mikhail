package ru.mikhail.array;

/**
 * MinDiapason
 * @author Mikhail Pushkarev
 * @since 24.02.2020
 * @version 0.2;
 */

public class MinDiapason {
    /**
     * Method findMin
     *
     * @param array - Принимает массив значений.
     * @param start - Начальный диапазон значений массива.
     * @param finish - Конечный виапазон значений массива.
     * @return - Возвращает минимальный индекс массива.
     */
    public static int findMin(int[] array, int start, int finish){
        int min = array[start];
        for(int index = start; index < finish; index++){
            if(array[index] < min){
                min = array[index];
            }
        }
        return min;
    }
}
