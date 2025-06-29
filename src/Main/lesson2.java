package Main;

import java.util.function.Predicate;

public class lesson2 {
    public static void main(String[] args) {
            int[] number = {22, 16, -356, -11, 9};
            Predicate<Integer> num = plus -> plus > 0;
            for (int plus : number){
                if (num.test(plus)){
                    System.out.println(plus);
                }
            }
        }
    }