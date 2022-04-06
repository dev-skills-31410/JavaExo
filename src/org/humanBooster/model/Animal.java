package org.humanBooster.model;

public abstract class Animal extends Being{
    public Animal(String name, int x, int y, int health, double resistance) {
        super(name, x, y, health, resistance);
    }

    public Animal(String name, int x, int y, int maxHealth, int health, double resistance) {
        super(name, x, y, maxHealth, health, resistance);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "health=" + health +
                ", resistance=" + resistance +
                '}';
    }
}
