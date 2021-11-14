package Lesson2;

public class Formula {

    public static void main(String[] args) {
        long tr = area(10, 15);
        System.out.println("Формула площади треугольника:"+ tr);
        long tr1 = area(42, 888);
        System.out.println("Формула площади треугольника:"+ tr1);
    }

    /**
     * Вычисление площади треугольника по формуле: S=1/2a*h
     *
     * @param arg1 длина стороны треугольника
     * @param arg2 высота треугольника
     * @return площадь треугольника
     */
    public static long area(int arg1, int arg2) {
        return (arg1 * arg2) / 2;
    }
}

