package polymorphism;

import polymorphism.basic.Circle;
import polymorphism.basic.Rectangle;
import polymorphism.basic.Shape;

public class Demo {
    public static void main(String[] args) {

        Shape shape;

        shape = new Circle(5.0);
        System.out.println(shape.area());
        System.out.println(shape.perimeter());

        shape = new Rectangle(15.0, 8);
        System.out.println(shape.area());
        System.out.println(shape.perimeter());


    }
}
