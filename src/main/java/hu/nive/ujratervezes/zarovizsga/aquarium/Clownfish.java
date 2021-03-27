package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Clownfish extends Fish{


    public Clownfish(String name, int weight, String color) {
       super(name,weight,color);
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
