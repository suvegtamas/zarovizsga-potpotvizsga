package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aquarium {
    List<Fish> fishList = new ArrayList<>();

    public void addFish(Fish fish) {
        fishList.add(fish);
    }

    public void feed() {
        fishList.forEach(Fish::feed);
    }

    public void removeFish() {
        List<Fish> toRemove = new ArrayList<>();
        for(Fish f : fishList) {
            if(f.getWeight() >= 11) {
                toRemove.add(f);
            }
        }
        fishList.removeAll(toRemove);
    }
    public List<String> getStatus() {
        return fishList.stream().map(Fish::status).collect(Collectors.toList());
    }
}
