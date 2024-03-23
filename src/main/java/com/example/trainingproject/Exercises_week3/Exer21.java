package com.example.trainingproject.Exercises_week3;

interface Shape {
    double getArea();
    double getPerimeter();
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class Triangle implements Shape {
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        // Heron's formula
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}

 class Main {
    public static void main(String[] args) {
        System.out.println(new Circle(5).getArea() + " ~ " + new Circle(5).getPerimeter());
        System.out.println(new Rectangle(3, 4).getArea() + " ~ " + new Rectangle(3, 4).getPerimeter());
        System.out.println(new Triangle(3, 4, 5).getArea() + " ~ " + new Triangle(3, 4, 5).getPerimeter());
    }
}