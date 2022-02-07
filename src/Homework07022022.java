import java.util.Scanner;

public class Homework07022022 {
    /*Cast byte type to short type*/
    public static void wideningCasting(byte b) {
        short sh = b;
        System.out.println("byte" + " " + b + " " + "short" + " " + sh);
        int i = sh;
        System.out.println("short" + " " + sh + " " + "int" + " " + i);
        long l = i;
        System.out.println("int" + " " + i + " " + "long" + l);
        float f = i;
        System.out.println("long" + " " + l + " " + "float" + " " + f);
        double d = f;
        System.out.println("float" + " " + f + " " + "double" + " " + d);

    }

    public static void narrowCasting(double d1) {
        float f1 = (float) d1;
        System.out.println("double" + " " + d1 + " " + "float" + " " + f1);
        long l1 = (long) f1;
        System.out.println("float" + " " + f1 + " " + "long" + " " + l1);
        int i1 = (int) l1;
        System.out.println("long" + " " + l1 + " " + "int" + " " + i1);
        short sh1 = (short) i1;
        System.out.println("int" + " " + i1 + " " + "short" + " " + sh1);
        byte b1 = (byte) sh1;
        System.out.println("short" + " " + sh1 + " " + " byte" + " " + b1);

    }

    public static void convertTemp(double fahrenheint) {
        double celtemp = (fahrenheint - 32) / 1.8000;
        System.out.println("Convert temp from Fahrenheit to Celcius" + " " + celtemp);
        float res = (float) celtemp;
        System.out.println("Cast the result to float type" + " " + res);
        int result = (int) res;
        System.out.println("Cast the result to int type" + " " + result);
    }

    public static void circleAreaPerimeter(double radius) {
        double PI = 3.14159;
        double area = PI * radius * radius;
        double perimeter = 2 * radius * PI;
        System.out.println("Area of circle" + " " + area);
        System.out.println("Perimeter of circle" + " " + perimeter);
    }

    public static void resultExpression(double exp) {
        double doubleres = (double) 1 / 3;
        float floatres = (float) 1 / 3;
        System.out.println(doubleres);
        System.out.println(floatres);


    }

    public static void printNameYear() {
        char s = 'S';
        char a = 'a';
        char t = 't';
        char e = 'e';
        char n = 'n';
        char i = 'i';
        char k = 'k';
        int y = 1991;
        System.out.println("" + s + a + t + e + n + i + k + " " + y);
    }

    public static void castCharToInt(char ch) {
        int i = (int) ch;
        System.out.println("Char cast to int" + " " + i);
    }

    public static void averageofNameletter() {
        char s = 'S';
        char a = 'a';
        char t = 't';
        char e = 'e';
        char n = 'n';
        char i = 'i';
        char k = 'k';
        int sum = s + a + t + e + n + i + k;
        float average = sum / 7;
        System.out.println(average);
    }

    public static void inttoChar(int num) {
        char ch = (char) num;
        System.out.println(num + " " + ch);
    }

    public static void swapTwoNumber(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swap to int number" + " " + a + " " + b);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        byte input = scanner.nextByte();
        wideningCasting(input);
        double input1 = scanner.nextDouble();
        narrowCasting(input1);
        double fahrenheint = scanner.nextDouble();
        convertTemp(fahrenheint);
        double radius = scanner.nextDouble();
        circleAreaPerimeter(radius);
        resultExpression(1 / 3);
        printNameYear();
        char ch = scanner.next().charAt(0);
        castCharToInt(ch);
        averageofNameletter();
        int num = scanner.nextInt();
        inttoChar(num);
        int anum = scanner.nextInt();
        int bnum = scanner.nextInt();
        swapTwoNumber(anum, bnum);
    }
}


