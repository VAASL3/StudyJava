package Lesson3;

public class ThirdProgram {
    public static void main(String[] args) {
        double a, b, c;
        a = 1;
        b = 1;
        c = 5;

        double D = b * b - 4 * a * c;
        if (a == 0) System.out.println("Первый коэффициент не может быть равен 0");
        else if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уровнения:" + x1 + "," + x1);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Единственный корень уровнения:" + x);
        } else {
            System.out.println("Нет действительных решений уравнения");
        }
    }
}
