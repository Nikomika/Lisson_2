import java.lang.reflect.Array;
import java.util.Arrays;

public class Metods {
    public static void printThreeWords () { //Задание 1
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSing() { //Задание 2
        int a = 8;
        int b = -15;
        int sum = a + b;
        if (sum >= 0) {
           System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() { //Задание 3
        int value = 108;
        if (value <= 0) {
            System.out.println("Красный");
        } else if(value >= 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Желтый");
        }
    }
    public static void compareNumbers() { //Задание 4
        int a = 20;
        int b = 108;
        if (a >= b) {
            System.out.println("a >= b");
        } else if (a < b) {
            System.out.println("a < b");
        }
    }
    public static boolean checkSumBetween(int a, int b) { //Задание 5
        boolean result;
        if ((10 <= a + b) & (a + b <= 20)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    public static void checkNumber(int a) { //Задание 6
        if (0 <= a) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean checkNumberTwo(int a) { //Задание 7
        if (0 <= a) {
            return false;
        } else {
            return true;
        }
    }
    public static void loopStringWrite(String sentence, int num) { //Задание 8

        for (int i = 0; i < num; i++) {
            System.out.println(sentence);
        }
    }
    public static boolean yearVerification (int a) { //Задание 9
        if (((a % 4 == 0) | (a % 400 == 0)) ^ (a % 100 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void newArrayReplaceSymbol () { //Задание 10
        int [] boolArray = new int[]{1,0,1,0,1,1,0,1,0,0,0,1};
        for (int i = 0; i < boolArray.length; i++) {
            switch (boolArray[i]) { // Ветвление с помощью switch сделала потому что в массиве всего два значения
                case 1:
                    boolArray[i] = 0;
                    break;
                case 0:
                    boolArray[i] = 1;
                    break;
            }
        }
        System.out.println(Arrays.toString(boolArray));
    }
    public static void newArrayHundred () { //Задание 11
        int [] inOderArray = new int[100];
        for (int i = 0; i < inOderArray.length; i++) {
            inOderArray[i] = i+1;
        }
        System.out.println(Arrays.toString(inOderArray));
    }
    public static void newArrayMultiplyBySix () { //Задание 12
        int [] numberArray = new int[]{1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] < 6) {
                numberArray[i] = numberArray[i] * 2;
            }
        }
        System.out.println(Arrays.toString(numberArray));
    }
    public static void twoDimensionalArray () { //Задание 13
        int[][] myTwoDimensionalArray = new int[6][6];
        int j = myTwoDimensionalArray.length - 1;
        int y = 0;
        for (int i = 0; i < myTwoDimensionalArray.length; i++) {
            myTwoDimensionalArray [i][i] = 1;
        }
       while ((j >= 0) & (y < 6)) {
                myTwoDimensionalArray[y][j] = 1;
                y++;
                j--;
       }

        for (int o = 0; o < 6; o++) {
            for (int f = 0; f < 6; f++) {
                System.out.print(" " + myTwoDimensionalArray[o][f] + " ");
            }
            System.out.println();
        }
    }
    public static int [] myNewArray (int len, int initialValue) { //Задание 14
        int[] myArrayNew = new int[len];
        for (int i = 0; i < myArrayNew.length; i++) {
            myArrayNew[i] = initialValue;
        }
        return myArrayNew;
    }
}


