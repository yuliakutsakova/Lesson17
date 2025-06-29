package Main.Main;

import java.util.Scanner;
import java.util.function.Supplier;

public class lesson5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supplier<String> str = () -> {
            System.out.println("Введите строку");
            String text = scanner.nextLine();
            String result = "";
            for (int i = text.length() - 1; i >= 0; i--)
                result += text.charAt(i);
            return result;
        };
        System.out.println(str.get());
    }
}
