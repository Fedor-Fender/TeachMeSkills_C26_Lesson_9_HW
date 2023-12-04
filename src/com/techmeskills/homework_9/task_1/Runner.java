package com.techmeskills.homework_9.task_1;

public class Runner {
    public static void main(String[] args) {

        Figure[] figures = {new Circle("Circle", 9),
                new Triangle("Triangle", 3, 5, 9),
                new Circle("Circle1", 9),
                new Triangle("Triangle1", 5, 7, 15),
                new Rectangle("Rectangle",7,9)};

        double sumPerimeter = 0;
        for (Figure array : figures) {
            System.out.println("Name Figure:" + array.getNameFigure() + " Area: " + array.getArea() + " Perimeter:" + array.getPerimeterFigure());
            sumPerimeter += array.getPerimeterFigure();
        }
        System.out.println("Sum perimeters all figures: "+sumPerimeter);
    }
}
