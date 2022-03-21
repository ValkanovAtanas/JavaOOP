package inheritance.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animalList = new ArrayList<>();

        String animalType = "";
        while (!"Beast!".equals(animalType = scanner.nextLine())) {
            String[] animalInfo = scanner.nextLine().split("\\s+");
            String animalName = animalInfo[0];
            int animalAge = Integer.valueOf(animalInfo[1]);
            String gender = animalInfo[2];
            Animal animal = null;
            try {
                switch (animalType) {
                    case "Cat":
                        animal = new Cat(animalName, animalAge, gender);
                        break;
                    case "Dog":
                        animal = new Dog(animalName, animalAge, gender);
                        break;
                    case "Frog":
                        animal = new Frog(animalName, animalAge, gender);
                        break;
                    case "Kitten":
                        animal = new Kitten(animalName, animalAge);
                        break;
                    case "Tomcat":
                        animal = new Tomcat(animalName, animalAge);
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            animalList.add(animal);
        }

        for (Animal animal : animalList) {
            System.out.println(animal);
        }
    }
}
