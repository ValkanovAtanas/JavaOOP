package inheritance.randomArrayList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<Integer> randomArrayList = new RandomArrayList<>(new Random());
        randomArrayList.add(1);
        randomArrayList.add(2);
        randomArrayList.add(3);
        randomArrayList.add(4);
        randomArrayList.add(5);
        Random random = new Random();
        System.out.println(randomArrayList.getRandomElement());
        System.out.println(randomArrayList);
    }
}