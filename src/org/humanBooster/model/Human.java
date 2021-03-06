package org.humanBooster.model;

import java.util.ArrayList;

public class Human extends Humanoid{
    public int mana;

    public Human(String name, int x, int y, int health, double resistance, ArrayList<Animal> animals, ArrayList<House> houses, int mana) {
        super(name, x, y, health, resistance, animals, houses);
        this.mana = mana;
    }

    public Human(String name, int x, int y, int maxHealth, int health, double resistance, ArrayList<Animal> animals, ArrayList<House> houses, int mana) {
        super(name, x, y, maxHealth, health, resistance, animals, houses);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Human{" +
                "mana=" + mana +
                '}';
    }
}
