package org.humanBooster.model;

public class Rock extends SpacialElement{
    public Rock(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public String toString() {
        return "Rock{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
