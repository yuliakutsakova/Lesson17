package Main.Main;

import java.util.function.Consumer;

public class lesson4 {
    public static void main(String[] args) {
        String summa = "100 BYN";
        double result[]=new double[1];
        Consumer<String> usd = s -> {
            String[] m= s.split(" ");
            double well = 2.962;
            double str =Double.parseDouble(m[0]);
            result[0] = str/well;
        };
        usd.accept(summa);
        System.out.println(result[0]+"$");
    }
}
