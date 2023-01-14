package oop;

public class Test {
    public static void main(String[] args) {

        Square squareObj1 = new Square();
        squareObj1.setSide(6.5);
        double areaOfSquareObj = squareObj1.getArea();
        System.out.println(areaOfSquareObj);

        Shape circleObj = new Circle(12.4);
        double areaOfCircleObj = circleObj.getArea();
        System.out.println(areaOfCircleObj);

    }
}
