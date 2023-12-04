package com.techmeskills.homework_9.task_1;

public final class Triangle extends Figure {
    public String nameFigure;
    public int sideA;
    public int sideB;
    public int sideC;

    public Triangle(String nameFigure, int sideA, int sideB, int sideC) {
        this.nameFigure = nameFigure;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        if (sideA <= 0 && sideB <= 0 && sideC <= 0) {
            System.out.println("It's wrong date");
        } else if (sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA) {
            System.out.println("It's wrong side of triangle");
        }
        return Math.sqrt(getPerimeterFigure() * (getPerimeterFigure() - sideA) * (getPerimeterFigure() - sideB) * (getPerimeterFigure() - sideC));
    }

    @Override
    public String getNameFigure() {
        return nameFigure;
    }

    @Override
    public double getPerimeterFigure() {
        return sideA + sideB + sideC;
    }
}
