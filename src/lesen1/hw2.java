package lesen1;

public class hw2 {

    public static void goodArray(){
       int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < mass.length; i++){
           if (mass[i] == 0){
                mass[i] = 1;
           }else {
                mass[i] = 0;
           }
           System.out.println("Вывод" + mass[i]);
       }
    }
}
