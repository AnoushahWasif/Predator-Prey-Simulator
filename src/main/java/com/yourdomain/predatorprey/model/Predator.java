package com.yourdomain.predatorprey.model;

public class Predator extends Animal {
    private double predationRate;

    public Predator(int population, double birthRate, double deathRate, double predationRate) {
        super(population, birthRate, deathRate);
        this.predationRate = predationRate;
    }

    @Override
    public void updatePopulation() {
        // Implement predator population update logic
    }

    public double getPredationRate() {
        return predationRate;
    }

    public void setPredationRate(double predationRate) {
        this.predationRate = predationRate;
    }
}
