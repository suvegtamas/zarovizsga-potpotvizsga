package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Tang extends Fish{

    public Tang(String name, int weight, String color) {
       super(name,weight,color);
       setMemoryConditionTrue();
    }

    @Override
    public String status() {
        return getName() + ", "  + "weight: " + getWeight() + ", color: " + getColor() + ", " + "short term memory loss: " + hasMemoryLoss();
    }

    @Override
    public void feed() {
       addWeight(1);
    }

}
