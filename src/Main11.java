import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первое число");
        String x = Integer.toString(s.nextInt());
        System.out.println("Введите второе число");
        int y = s.nextInt();
        System.out.println(Math.max( Integer.parseInt(x),  y));
        System.out.println(new Double(Math.min( Integer.parseInt(x),  y)));
    }
}
