package com.yourdomain.predatorprey.model;

import java.util.ArrayList;
import java.util.List;

public class Ecosystem {
    private List<Animal> animals;

    public Ecosystem() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void simulate() {
        for (Animal animal : animals) {
            animal.updatePopulation();
        }
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
