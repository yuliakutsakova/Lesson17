import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate user = LocalDate.of(1995,7,30);
        LocalDate years = user.plusYears(100);
        System.out.println(years);
    }
}