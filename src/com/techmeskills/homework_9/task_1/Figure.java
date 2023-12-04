package com.techmeskills.homework_9.task_1;

/**
 * There is some abstract class has certain function to be sealed,so new classes hasn't opportunity without permission
 */
public sealed abstract class Figure permits Circle,Rectangle,Triangle {

    public abstract double getArea();

    public abstract String getNameFigure();

    public abstract double getPerimeterFigure();
}
