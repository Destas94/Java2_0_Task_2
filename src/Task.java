import java.util.Scanner;
/**
 * Сложение дробных чисел.
 * @author Dmitry Makhinya IBS Appline
 * @see Math#sum(double, double) осуществляет сложение дробных числе, которые были введены изначально
*/
public class Task {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое дробное число: ");
        double a = input.nextDouble();
        System.out.println("Введите второе дробное число: ");
        double b = input.nextDouble();
        Math.sum(a,b);
    }
}
