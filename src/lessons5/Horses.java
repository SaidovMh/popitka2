package lessons6;

public class Horses extends Animal {

    public Horses(String allName, int maxSwim, int maxJump, int maxRun) {
        super(allName, maxSwim, maxJump, maxRun);
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
