public class hw1ch1 {

    public static void main(String[] args) {

    }

    //Создать переменные всех пройденных типов данных, и инициализировать их значения;
    int integer = 2020;
    long longVal = 382L;
    byte byteVal = -127;
    short shortVal = 32000;
    double doubleVal = 3.5d;
    float floatVal = 2.4f;
    char ch1 = '5';
    String StringVal = "ааааааа";
    boolean booleanVal = false;


    //Написать метод вычисляющий выражение a * (b + (c / d)) и
    // возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static int calculate(int a, int b, int c, int d) {
        a = 3;
        b = 2;
        c = 4;
        d = 8;
        return ( a * (b + (c / d)));
    }

    //Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в п
    // ределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false
    public static boolean task10and20(int a, int b) {
        a = 6;
        b = 6;
        return 10 <= a + b && a + b <= 20;
    }

    //Создать метод, который принимает число. Если данное число больше 100 и меньше 999 включительно - вывести
    //в консоль цифры данного числа в обратном порядке. Например, введено число 725 -> в консоле будет: 527.
    public static void isPositiveOrNegative(int x) {
        x = 254;
        if(x > 100 && x < 999) {
            System.out.println("452");
        } else {
            System.out.println("что-то пошло не по плану");
        }
    }

    //Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
    public static void six(int year) {
        year = 400;
        if(year / 100 != 0 && year / 4 == 0 || year / 400 == 0) {
            System.out.println("високосный");
        } else {
            System.out.println("неа");
        }
    }

    //Честно говоря я не уверен сделал ли я хоть одно задание правильно. Когда я проверял коды, ни один код не выдал то что я забивал в System.out.println
}

