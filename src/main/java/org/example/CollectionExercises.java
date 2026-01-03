package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExercises {
    public String[] makeFruitStringArray() {
        String[] fruits = {"apple", "banana", "cherry", "date", "elderberry"};
        return fruits;
    }

    public String[] makeFruitStringArrayWithSize(int size) {
        String[] fruits = {"apple", "banana", "cherry", "date", "elderberry"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        return fruits;
    }

    public String[] makeTopThreeArray(String[] fruits) {
        String[] threeFruits = {"apple", "banana", "cherry"};
        return threeFruits;
    }

    public ArrayList<String> makeFruitList() {
        ArrayList<String> fruitList = new ArrayList<String>();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("cherry");
        fruitList.add("date");
        fruitList.add("elderberry");
        return fruitList;
    }

    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {
        ArrayList<String> threeFruitList = new ArrayList<String>();
        threeFruitList.add("apple");
        threeFruitList.add("banana");
        threeFruitList.add("cherry");
        return threeFruitList;
    }

    public HashMap<String, String> makeFruitMap() {
        HashMap<String, String> fruit = new HashMap<String, String>();
        fruit.put("apple", "red");
        fruit.put("banana", "yellow");
        fruit.put("Charlie", "red");
        fruit.put("date", "brown");
        fruit.put("elderberry", "black");
        return fruit;
    }

    public String lookupAppleColor(HashMap<String, String> fruitMap) {
        HashMap<String, String> fruit = new HashMap<String, String>();
        fruit.put("apple", "red");
        fruit.put("banana", "yellow");
        fruit.put("Charlie", "red");
        fruit.put("date", "brown");
        fruit.put("elderberry", "black");

        String color = fruit.get("apple");
        return color;
    }

    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {
        HashSet<String> fruit = new HashSet<String>();
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("Charlie");
            return fruit;
    }
}
