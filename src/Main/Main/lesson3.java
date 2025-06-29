package Main.Main;

import java.util.function.Function;

public class lesson3 {
    public static void main(String[] args) {
        Function<String, Double> usd = s -> {
            String [] m = s.split(" ");
            double str = Double.parseDouble(m[0]);
            double well = 2.962;
            return str / well;
        };
        String summa = "100 BYN";
        System.out.println(usd.apply(summa)+ "$");
    }
}