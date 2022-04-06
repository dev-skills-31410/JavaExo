package org.humanBooster.model;

public class Wolf extends Animal{
    public Wolf(String name, int x, int y, int health, double resistance) {
        super(name, x, y, health, resistance);
    }

    public Wolf(String name, int x, int y, int maxHealth, int health, double resistance) {
        super(name, x, y, maxHealth, health, resistance);
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "health=" + health +
                ", resistance=" + resistance +
                '}';
    }
}
