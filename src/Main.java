//Найдите значение функции z = ((a - 3) * b/2) + c

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Enter a: ");
        Scanner temp_a = new Scanner(System.in);
        double a = temp_a.nextDouble();

        System.out.println("Enter b: ");
        Scanner temp_b = new Scanner(System.in);
        double b = temp_b.nextDouble();

        System.out.println("Enter c: ");
        Scanner temp_c = new Scanner(System.in);
        double c = temp_c.nextDouble();

        double z;
        z = ((a - 3) * b / 2) + c;
        System.out.println("Function value = " + z);
    }
}
