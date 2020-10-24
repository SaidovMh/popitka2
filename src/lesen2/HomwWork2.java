package lesen1;

public class HomwWork2 {

    //1 Задать целочисленный массив, состоящий из элементов 0 и 1.
    //Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
    public static void goodArray() {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 0) {
                mass[i] = 1;
            } else {
                mass[i] = 0;
            }
            System.out.println("Вывод" + mass[i]);
        }
    }

    //2 Задать пустой целочисленный массив размером 8. Написать метод,
    //который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
    public static void arrayAll() {
        int[] array2 = new int[8];
        for (int i = 1; i < array2.length; i++){
            int a = 0;
            array2[i] = a;
            a =+ 3;
        }
        System.out.println(array2);

    }

    //3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
    //написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
    public static void three() {
        int[] threeArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < threeArray.length; i++){
            if (threeArray[i] < 6) {
                threeArray[i] *= 2;
            }
        }
    }

    //4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
    public static void four(){
        int[] fourArray = {3, 4, 5, 7, 9};
        for (int i =0; i < fourArray.length; i++){
            if (fourArray[i] == 9 && fourArray[i] == 3)
                System.out.println("максимальное число 9 " + "минимальное число 3");
        }

    }

    //5 ^ Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
    //заполнить его диагональные элементы единицами, используя цикл(ы);
    public static void five(){
        int[][] fiveArray = new int[10][10];
        for (int i = 0; i < fiveArray.length; ){
            for (int j = 0; j < fiveArray[i].length; ){
                //fiveArray[i].push(1); оставил на потом не до пер как это сделать
            }
        }


    }


    //6 ^^ Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true
    //если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры:
    //checkBalance([1, 1, 1, || 2, 1]) → true,
    //checkBalance ([2, 1, 1, 2, 1]) → false,
    //checkBalance ([10, || 1, 2, 3, 4]) → true.
    public static void six(){
        int[] sixArray = {1, 1, 1, 1, 2};
        int[] sixArray2 = {2, 1, 1, 3, 2};

        int sixArraySum = 0;
        int sixArraySum2 = 0;

        for (int i = 0; i < sixArray.length; i++){
            sixArraySum = (sixArraySum + sixArray[i]) / 2;
            //      if (sixArraySum / 2);
        }

        for (int i = 0; i < sixArray2.length; i++){
            sixArraySum2 = (sixArraySum2 + sixArray[i]) / 2;
            System.out.println(true || false);
        }
    }

}
