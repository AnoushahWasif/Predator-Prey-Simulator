package com.yourdomain.predatorprey.model;

public class Prey extends Animal {
    public Prey(int population, double birthRate, double deathRate) {
        super(population, birthRate, deathRate);
    }

    @Override
    public void updatePopulation() {
        // Implement prey population update logic
    }
}
