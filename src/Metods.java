public class Metods {
    public static void printThreeWords () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSing() {
        int a = 8;
        int b = -15;
        int sum = a + b;
        if (sum >= 0) {
           System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 108;
        if (value <= 0) {
            System.out.println("Красный");
        } else if(value >= 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Желтый");
        }
    }
    public static void compareNumbers() {
        int a = 20;
        int b = 108;
        if (a >= b) {
            System.out.println("a >= b");
        } else if (a < b) {
            System.out.println("a < b");
        }
    }
    public static boolean checkSumBetween(int a, int b) {
        boolean result;
        if ((10 <= a + b) & (a + b <= 20)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    public static void checkNumber(int a) {
        if (0 <= a) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

}
