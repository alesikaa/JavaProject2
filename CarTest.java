package JavaProject2;

public class CarTest {
    public static void main(String[] args) {
        Sedan sedan=new Sedan(15, "White", 50000);
        System.out.println(sedan.calculateSalePrice());

        Truck truck=new Truck(2500,"Black",75000);
        System.out.println(truck.calculateSalePrice());
    }
}
