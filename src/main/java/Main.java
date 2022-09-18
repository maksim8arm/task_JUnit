import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Convector convector = new Convector();
        Scanner scanner = new Scanner(System.in);
        System.out.println("!!! При вводе числа разделителем десятичной дроби должна быть точка !!!");
        System.out.print("Введите число -> ");
        String num = scanner.nextLine();
        try {
            Double numToDouble = Double.parseDouble(num);
            System.out.println(convector.inchToMetre(numToDouble));
        } catch (NumberFormatException e) {
            System.err.println("Введено неправильное число");
        }
    }
}



