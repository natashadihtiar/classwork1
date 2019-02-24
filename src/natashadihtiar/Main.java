package natashadihtiar;
import java.io.Console;
import java.util.Scanner;

public class Main {

    private static void Example_1() {
        System.out.println("\nПример 1\n");
        Scanner scanner = new Scanner(System.in);

        double a, b, c, x1, x2, x;
        double D;

        System.out.println("Программа решает квадратное уравнение вида: ax^2 + bx + c = 0);");

        System.out.println("Введите a: ");
        a = scanner.nextDouble();

        System.out.println("Введите b: ");
        b = scanner.nextDouble();

        System.out.println("Введите c: ");
        c = scanner.nextDouble();

        D = b * b - 4 * a * c;
        if (D > 0) {

            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Первый корень уравнения х1 = " + x1);
            System.out.println("Второй корень уравнения х2 = " + x2);
        }
        else if (D < 0) {
            System.out.println("Уравнение не имеет действительных корней!");
        } else {
            x = -b / (2 * a);
            System.out.println("Уравнение имеет один корень: x = " + x);
        }
    }

    private static void Example_2() {
        System.out.println("\nПример 2\n");
        Scanner scanner = new Scanner(System.in);

        double a, b;
        double square, perimeter;
        System.out.println("Введите длину стороны а в сантиметрах:");

        a = scanner.nextDouble();

        System.out.println("Введите длину стороны b в сантиметрах:");

        b = scanner.nextDouble();

        perimeter = 2 * (a + b);
        square = a * b;
        System.out.println("Периметр прямоугольника= " + perimeter + " см; " + " площадь прямоугольника= " + square + " см2");

    }

    private static void Example_3() {
        System.out.println("\nПример 3\n");
        Scanner scanner = new Scanner(System.in);

        double perimeter, a;

        System.out.println("Введите периметр квадрата в сантиметрах");
        perimeter = scanner.nextDouble();

        a = perimeter/4;
        System.out.println("Длина стороны квадрата = " + a + " см");

    }

    private static void Example_4() {
        System.out.println("\nПример 4.1\n");
        Scanner scanner = new Scanner(System.in);

        double a, b, c, answer;
        System.out.println("Введите a");
        a = scanner.nextDouble();

        System.out.println("Введите b");
        b = scanner.nextDouble();

        System.out.println("Введите c");
        c = scanner.nextDouble();

        answer = (((b + (Math.sqrt(Math.pow(b, 2) + 4 * a * c))) / (2 * a)) - ((Math.pow(a, 3) * c) + Math.pow(b, -2)));
        System.out.println("Ответ: " + answer);
    }

    private static void Example_5()

    {
        System.out.println("\nПример 4.2\n");
        Scanner scanner = new Scanner(System.in);

        double x, answer;
        System.out.println("Введите x");
        x = scanner.nextDouble();

        answer = (x - (Math.pow(x, 3) / 3) + (Math.pow(x, 5) / 5));
        System.out.println("Ответ: " + answer);
    }


    private static void Example_6()

    {
        System.out.println("\nПример 4.3\n");
        Scanner scanner = new Scanner(System.in);

        double x, y, answer;
        System.out.println("Введите x");
        x = scanner.nextDouble();

        System.out.println("Введите y");
        y = scanner.nextDouble();

        answer = (((x+y)/(y+1)) - (((x*y) - 12)/(34+x)));
        System.out.println("Ответ: " + answer);
    }

    private static void Example_7()

    {
        System.out.println("\nПример 4.4\n");
        Scanner scanner = new Scanner(System.in);

        double x,  answer;
        System.out.println("Введите x");
        x = scanner.nextDouble();

        answer = ((Math.sin(Math.sqrt(x+1))) - (Math.sin(Math.sqrt(x-1))));
        System.out.println("Ответ: " + answer);
    }

    private static void Example_8()

    {
        System.out.println("\nПример 4.5\n");
        Scanner scanner = new Scanner(System.in);

        double x, y, answer;
        System.out.println("Введите x");
        x = scanner.nextDouble();

        System.out.println("Введите y");
        y = scanner.nextDouble();

        answer = (( 1 - Math.tan(Math.pow(x, (1/Math.tan(x))))) + Math.cos(x - y));
        System.out.println("Ответ: " + answer);
    }


    private static void Example_9()

    {
        System.out.println("\nПример 4.6\n");
        Scanner scanner = new Scanner(System.in);

        double x, y, answer;
        System.out.println("Введите x");
        x = scanner.nextDouble();

        System.out.println("Введите y");
        y = scanner.nextDouble();

        answer = (Math.log(Math.abs((y - Math.sqrt(Math.abs(x))) * ( x - (y / (x + (Math.pow(x, 2))/4)))))) ;
        System.out.println("Ответ: " + answer);
    }


    public static void main(String[] args) {

        Example_1();
        Example_2();
        Example_3();
        Example_4();
        Example_5();
        Example_6();
        Example_7();
        Example_8();
        Example_9();
    }
}

