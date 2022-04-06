package org.humanBooster.model;

public class Tree extends Being{
    public Tree(String name, int x, int y, int health, double resistance) {
        super(name, x, y, health, resistance);
    }

    public Tree(String name, int x, int y, int maxHealth, int health, double resistance) {
        super(name, x, y, maxHealth, health, resistance);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "health=" + health +
                ", resistance=" + resistance +
                '}';
    }
}
