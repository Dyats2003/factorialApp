import java.io.FileWriter;
import java.io.IOException;

public class Main {

    // Метод для вычисления числа Фибоначчи
    public static int calculateFactorial(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 10; // Факториал какого числа мы хотим получить

        // Вычисляем факториал
        int factorial = calculateFactorial(n);

        // Создаем файл для записи факториала
        try {
            FileWriter writer = new FileWriter("factorial.txt");
            writer.write("Факториал для индекса " + n + " равeн: " + factorial);
            writer.close();
            System.out.println("Factorial is successfully written to factorial.txt");
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}