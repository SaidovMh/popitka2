package lessons6;


public class Main {

    public static  void main(String[] args) {

        Dog dog = new Dog("Собака", 10, 5, 500);
        Cat cat = new Cat("Кошка", 0,2, 200);
        Bird bird = new Bird("Птица", 0, 1, 5);
        Horses horses = new Horses("Лошадь", 100, 3, 1500);

        dog.action();
        cat.action();
        bird.action();
        horses.action();

    }
}