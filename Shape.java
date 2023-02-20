package JavaProject2;

public interface Shape {
    //Task 1
    void calculateArea();
    void calculatePerimeter();
    final double PI=3.14;
}
    class Circle implements Shape {
    int radius;
    Circle(int radius){
        this.radius=radius;
    }
    @Override
        public void calculatePerimeter(){
        radius=4;
        System.out.println(2*PI*radius);
    }
    @Override
        public void calculateArea(){
        radius=4;
        System.out.println(PI*radius);
    }
    }
    class Square implements Shape{
    int side;
    Square(int side){
        this.side=side;
    }
    @Override
        public void calculateArea(){
        System.out.println(side*side);
    }
    @Override
        public void calculatePerimeter(){
        System.out.println(4*side);
    }
    }

