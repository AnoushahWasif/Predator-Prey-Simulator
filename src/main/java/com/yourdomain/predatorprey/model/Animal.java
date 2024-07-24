package com.yourdomain.predatorprey.model;

public abstract class Animal {
    protected int population;
    protected double birthRate;
    protected double deathRate;

    public Animal(int population, double birthRate, double deathRate) {
        this.population = population;
        this.birthRate = birthRate;
        this.deathRate = deathRate;
    }

    public abstract void updatePopulation();
    
    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
