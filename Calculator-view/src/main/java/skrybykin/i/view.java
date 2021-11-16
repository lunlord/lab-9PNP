package skrybykin.i;

import skrybykin.i.Calc;

import java.util.Scanner;

public class view {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число:");
        int number1 = s.nextInt();
        int number2 = s.nextInt();
        int a = Calc.summa(number1,number2);
        int b = Calc.diff(number1,number2);
        double c = Calc.div(number1,number2);
        int d = Calc.mult(number1,number2);
        System.out.println("сумма " + a);
        System.out.println("разность " + b);
        if(number2!=0) System.out.println("деление " + c );
        System.out.println("умножение " + d);
    }
}
