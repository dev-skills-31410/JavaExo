package org.humanBooster.model;

import java.util.ArrayList;

public class Orc extends Humanoid{
    public int rage;

    public Orc(String name, int x, int y, int health, double resistance, ArrayList<Animal> animals, ArrayList<House> houses, int rage) {
        super(name, x, y, health, resistance, animals, houses);
        this.rage = rage;
    }

    public Orc(String name, int x, int y, int maxHealth, int health, double resistance, ArrayList<Animal> animals, ArrayList<House> houses, int rage) {
        super(name, x, y, maxHealth, health, resistance, animals, houses);
        this.rage = rage;
    }

    public int getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
    }

    @Override
    public String toString() {
        return "Orc{" +
                "rage=" + rage +
                '}';
    }
}
