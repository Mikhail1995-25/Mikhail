package ru.mikhail.tracker;

import java.util.Arrays;

public class DropArrays {
    public static void main(String[] args) {
        String[] names = {"Petr", null, "Ivan", "Stepan", null};
        String[] namesWithoutNull = new String[names.length];
        int size = 0;

        for (int index = 0; index < names.length; index++) {
            String n = names[index];
            if (n != null) {
                namesWithoutNull[size] = n;
                size++;
            }
        }
        namesWithoutNull = Arrays.copyOf(namesWithoutNull, size);
        for (int index = 0; index < namesWithoutNull.length; index++) {
            System.out.println(namesWithoutNull[index]);
        }
    }
}
