package lessons6;


public class Animal {

    protected String allName;
    protected int maxSwim;
    protected int maxJump;
    protected int maxRun;

    public Animal(String allName, int maxSwim, int maxJump, int maxRun) {
        this.allName = allName;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    void action() {
        System.out.println(allName + ": " + " Плавание = " + maxSwim + " Прыжок = " + maxJump + " Бег = " + maxRun);
    }


}
