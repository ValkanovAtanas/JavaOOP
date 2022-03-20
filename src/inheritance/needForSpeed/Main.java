package inheritance.needForSpeed;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(30,100);
        car.drive(100);

        Motorcycle motorcycle = new Motorcycle(2.5, 200);
        motorcycle.drive(100);

        CrossMotorcycle crossMotorcycle = new CrossMotorcycle(2.5, 100);
        crossMotorcycle.drive(100);

        FamilyCar familyCar = new FamilyCar(3, 100);
        familyCar.drive(100);

        System.out.println();
    }
}
