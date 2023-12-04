package com.techmeskills.homework_9.task_1;

public final class Circle extends Figure {
    public String nameFigure;
    public int radius;

    public Circle(String nameFigure, int radius) {
        this.nameFigure = nameFigure;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        if (radius != 0 && radius > 0) {
            return Math.PI * (radius * radius);
        }
        return 0;
    }

    @Override
    public String getNameFigure() {
        if(nameFigure!=null)
            return nameFigure;
        return null;
    }

    @Override
    public double getPerimeterFigure() {
        if (radius != 0 && radius > 0) {
            return Math.PI * 2 * radius;
        }
        return 0;
    }
}
