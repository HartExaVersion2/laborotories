import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args){
        int x;
        double arcsin, logarifm_1, logarifm_2, logarifm_total, total;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        arcsin = Math.asin(Math.pow(x, 8) / (Math.pow(x, 8) + 3));
        logarifm_1 = Math.pow(2, Math.cos(Math.sqrt(Math.abs(x+1))));
        logarifm_2 = Math.pow(Math.abs(x+1), 5 * Math.sin(Math.sqrt(3*x+1)));
        logarifm_total = Math.log(logarifm_1 + logarifm_2);
        total = Math.pow(Math.abs(arcsin+logarifm_total), 1.0/3.0);
        System.out.println(total);
        if (total<=8.0 && x<=8.0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
// akozadaev@inbox.ru