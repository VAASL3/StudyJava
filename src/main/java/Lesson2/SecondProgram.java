package Lesson2;

public class SecondProgram {
    public static void main(String[] args) {
        long summa1 = plus(3, 5);
        System.out.println(summa1);
        long yetAnotherSumma = plus(15, 77);
        System.out.println(yetAnotherSumma);

        long subtract = minus(100, 77);
        System.out.println(subtract);

        long multiplication = multiply(1500, 158);
        System.out.println(multiplication);
        long division = div(126, 2);
        System.out.println(division);
    }

    /**
     * Метод будет складывать два аргумента и возвращать результат этой операции.
     *
     * @param arg1 первый аргумент
     * @param arg2 второй аргумент
     * @return результат сложения двух чисел
     */
    public static long plus(int arg1, int arg2) {
        int result = arg1 + arg2;
        return result;
    }

    /**
     * Метод будет вычитать два аргумента и возвращать результат этой операции.
     *
     * @param arg1 первый аргумент
     * @param arg2 второй аргумент
     * @return результат вычитания двух чисел
     */
    public static long minus(int arg1, int arg2) {
        return arg1 - arg2;
    }

    /**
     * Метод будет умножать два аргумента и возвращать результат этой операции.
     *
     * @param arg1 первый аргумент
     * @param arg2 второй аргумент
     * @return результат умножения двух чисел
     */
    public static long multiply(int arg1, int arg2) {
        return arg1 * arg2;
    }

    /**
     * Метод будет делить два аргумента и возвращать результат этой операции.
     *
     * @param arg1 первый аргумент
     * @param arg2 второй аргумент
     * @return результат деления двух чисел
     */
    public static long div(int arg1, int arg2) {
        return arg1 / arg2;
    }
}