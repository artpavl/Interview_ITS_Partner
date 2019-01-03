package com.artiom.pavlov.string;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public void getCountSymbol(String srtring) {
        if (srtring != null) {
            int size = srtring.length();
            HashMap <Character, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < size; i++) {
                Character character = srtring.toLowerCase().charAt(i);
                if (hashMap.containsKey(character)) {
                    Integer count = hashMap.get(character);
                    hashMap.replace(character, ++count);
                } else {
                    hashMap.put(character, 1);
                }
            }
            System.out.println("Строка : " + srtring);
            for (Map.Entry<Character, Integer> r : hashMap.entrySet()) {
                System.out.println("Символ  " + r.getKey() + "  количество " + r.getValue());
            }
        } else {
            System.out.println("Строка = null");
        }
    }

    public static void main(String[] args) {
        String s = " Мама мыла раму ";
        new Main().getCountSymbol(s);
    }
}
