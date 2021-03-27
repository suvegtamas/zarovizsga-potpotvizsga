package hu.nive.ujratervezes.zarovizsga.aquarium;

public abstract class Fish {

    private String name;
    private int weight;
    private String color;
    private boolean memoryLoss;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.memoryLoss = false;
    }

    public abstract String status();
    public abstract void feed();

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean hasMemoryLoss() {
        return memoryLoss;
    }
    public void addWeight(int weight) {
        this.weight+= weight;
    }
    public void setMemoryConditionTrue() {
        memoryLoss = true;
    }
}
