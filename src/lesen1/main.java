package lesen1;

public class main {

    //это точка входа перевод:public мадификатор доступа,
    //static метод статичный, void метод не чего не возврашает,
    //main уже метод
    public static void main(String[] args) {

        /*//цифровые переменные:
        //int это переменная, они бывают цилачисленные и с плавоюшей точкой
        //сейчас рассамтриваются цилапчисленные
        //в себя они хронят числа инт для больших чисел лонг для очень больших
        int integerValue = 2020;
        long longValue = 382L;
        byte byteValue = -127;
        short shortValue = 32000;

        //цифровые переменные числа с плавоюшей точкой:
        double doubleValue = 3.5d;
        float floatValue = 2.4f;

        //Буквенные переменные:
        //char это одна символ String переменна которая пишится с большой буквы
        //также он является Классом
        //String пишутся символы и состовляется в сторку. Кавычки свои у каждой.
        char ch1 = '5';
        String StringValue = "qwerty";

        //логическая переменная:
        //boolean это - отвечает за логику true и false и принимает оба их значения
        boolean booleanValue = false;

        //литералы:
        //буквы в конце цифр у переменных сделать что бы указать
        //системе js к какой кокретно переменной относятся цифры: long 385l l = long

        //Как писать переменные: индификатор тип переменой наименов = число
        //long(тип переменой) longValue (наименов) = 382L

        //Динамическое объявление переменно:
        float secondValue;
        //где то в коде записал переменную и позже дал ей значение
        secondValue = 1.5f;*/

        /*Матиматические действия, в дробях такое написание обязательно:
        float summa =  5 / 2f;
        System.out.println(summa);*/

        //Матиматические действия, остаток от деления (%):
        //int summa2 =  13 % 2; //остаток от него будет 1

        //инкримент ++ как он работает: если ++summa3 то получится +1 к
        //++summa3 если после summa3++ для прибовления нужно след
        //действие без этого ответ останится прежним тоже саммое работает с --
        //int summa3 =  12;
        //System.out.println(++summa3);

        //Условные операторы: > >= < <= == !=(не) (== означает груша == груша т.е.
        // они одинаковы) (= означает 12 = яблоко т.е. яблоко это есть 12)
        // > >= < <= числовые операторы == != можнои к строкам и к числам

        //&& - и || - или

        //Условные операторы if
        int a = 50;
        int b = 300;

        if (a > b){
            System.out.println("А больше Б");
        } else {
            System.out.println("Б больше А");
        }


    }
}
