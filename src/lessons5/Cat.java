package lessons6;

public class Cat extends Animal {

    public Cat(String allName, int maxSwim, int maxJump, int maxRun) {
        super(allName, maxSwim, maxJump, maxRun);
    }

    @Override
    void action() {
        System.out.println(allName + ": " + " Не умеет плавать! " + " Прыжок = " + maxJump + " Бег = " + maxRun);
    }

    public String getAllName() {
        return allName;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public int getMaxRun() {
        return maxRun;
    }

}
