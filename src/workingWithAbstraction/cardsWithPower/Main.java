package workingWithAbstraction.cardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputParser parser = new InputParser(scanner.nextLine(), scanner.nextLine());

        Card card = parser.parse();
        
        Printer printer = new Printer();
        printer.print(card);
    }
}
