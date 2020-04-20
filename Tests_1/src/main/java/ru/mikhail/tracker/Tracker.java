package ru.mikhail.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;

    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item[] findByName(String key) {
       Item[] item = new Item[position];
       int size = 0;
       for (int index = 0; index < position; index++) {
           if (items[index].getName().equals(key)) {
               item[size++] = items[index];
           }
       }
       return Arrays.copyOf(item, size);
    }

    public Item findById(String id) {
       int index = indexOf(id);
       return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    private int indexOf(String id) {
        int rs1 = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rs1 = index;
                break;
            }
        }
        return rs1;
    }

    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        boolean rs1 = index != -1;
        if (rs1) {
            item.setId(id);
            items[index] = item;
        }
        return rs1;
    }
}
