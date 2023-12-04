package com.techmeskills.homework_9.task_1;

public final class Rectangle extends Figure {
    String nameFigure;
    int sideA;
    int sideB;

    public Rectangle(String nameFigure, int sideA, int sideB) {
        this.nameFigure = nameFigure;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        if (sideA != 0 && sideB != 0) {
            return sideA * sideB;
        }
        return 0;
    }

    @Override
    public String getNameFigure() {
        if (nameFigure!=null) {
            return nameFigure;
        }
        return null;
    }

    @Override
    public double getPerimeterFigure() {
        if (sideA != 0 && sideB != 0) {
            return 2*(sideA * sideB);
        }
        return 0;
    }
}
