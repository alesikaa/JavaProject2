package JavaProject2;

public class Car {
    //Task 3

    double carPrice;
    String color;

     Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

     double calculateSalePrice() {
        return carPrice;
    }
}
    class Sedan extends Car {
        int length;
        public Sedan(int length, String color, double carPrice) {
            super( carPrice,color);
            this.length = length;
        }
        @Override

         double calculateSalePrice() {
        if (length>20){
            return carPrice*0.95;
        }else {
           return carPrice*0.9;
        }

        }
    }
        class Truck extends Car {
            double weight;

            public Truck(double weight, String color, double carPrice) {
                super( carPrice, color);
                this.weight = weight;
            }
            @Override

            double calculateSalePrice() {
                if (weight > 2000) {
                return carPrice * 0.9;
                } else {
                    return carPrice * 0.8;
                }

            }
        }


