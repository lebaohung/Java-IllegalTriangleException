import java.util.Scanner;

public class IllegalTriangleException {
    static double a;
    static double b;
    static double c;

    public void inputTriangle() {
        System.out.println("Enter triangle side.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = scanner.nextDouble();
        System.out.print("Enter b: ");
        b = scanner.nextDouble();
        System.out.print("Enter c: ");
        c = scanner.nextDouble();
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || c + b <= a) throw new ArithmeticException();
    }

    public static void main(String[] args) {
        IllegalTriangleException test = new IllegalTriangleException();
        try {
            test.inputTriangle();
        } catch (ArithmeticException exception) {
            System.out.println("Lỗi nè");
        }
    }
}
