package JavaProject2;

public class ShapeTester {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Square(4)};
        for (Shape s:shapes){
            s.calculateArea();
            s.calculatePerimeter();
        }
        }
    }
