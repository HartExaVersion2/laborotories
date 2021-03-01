import java.util.Scanner;
import static java.lang.Math.cos;
import static java.lang.Math.acos;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.log;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        double total;
        x = scanner.nextInt();
        if (x<=-4){
            total = calculated_the_value_of_the_function_for_a_argument_less_or_equal_than_minus_four(x);
        } else if (x>-4 && x<4){
            total = calculated_the_value_of_the_function_with_a_argument_from_minus_four_to_four(x);
        } else {
            total = calculated_the_value_of_the_function_with_an_argument_greater_than_or_equal_to_four(x);
        }
        System.out.print(total);
    }

    private static double calculated_the_value_of_the_function_for_a_argument_less_or_equal_than_minus_four(int x){
        return cos(x-1);
    }

    public static double calculated_the_value_of_the_function_with_a_argument_from_minus_four_to_four(int x){
        return acos((pow(x, 6))/(1+pow(x, 6)));
    }

    public static double calculated_the_value_of_the_function_with_an_argument_greater_than_or_equal_to_four(int x){
        return pow(abs(log(pow(x, 5) - pow(x, 3) + pow(10, x))/log(2)), 1.0/4.0);
    }
}
