public class hm1 {
    //Задание 1
    public static void main(String[] args)
    //Задание 6
    {printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    //Задание 2
    public static void printThreeWords()
    {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //Задание 3
    public static void checkSumSign() {
        int a = 3;
        int b = -5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else if (sum < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    //Задание 4
    public static void printColor() {
        int value = 23;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    //Задание 5
    public static void compareNumbers()
    {
        int a = 6;
        int b = 22;
        if (a>=b)
        {
            System.out.println("a>=b");
        }
        else if (a<b)
        {
            System.out.println("a<b");
        }
    }
}
