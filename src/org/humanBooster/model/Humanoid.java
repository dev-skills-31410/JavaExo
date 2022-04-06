package org.humanBooster.model;

import java.util.ArrayList;

public abstract class Humanoid extends Being {
    public ArrayList<Animal> animals = new ArrayList<>();
    public ArrayList<House> houses = new ArrayList<>();

    public Humanoid(String name, int x, int y, int health, double resistance, ArrayList<Animal> animals, ArrayList<House> houses) {
        super(name, x, y, health, resistance);
        this.animals = animals;
        this.houses = houses;
    }

    public Humanoid(String name, int x, int y, int maxHealth, int health, double resistance, ArrayList<Animal> animals, ArrayList<House> houses) {
        super(name, x, y, maxHealth, health, resistance);
        this.animals = animals;
        this.houses = houses;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public ArrayList<House> getHouses() {
        return houses;
    }

    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }

    @Override
    public String toString() {
        return "Humanoid{" +
                "animals=" + animals +
                '}';
    }
}
