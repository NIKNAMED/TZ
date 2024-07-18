import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе целое число b: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        System.out.println("Произведение: " + (a * b));

        if (b != 0) {
            System.out.println("Частное: " + (a / b));
        } else {
            System.out.println("Деление на 0 невозможно");
        }

        scanner.close();
    }
}