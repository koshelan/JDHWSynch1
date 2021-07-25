public class Car {

    final String vin;
    final String model;

    public Car(String vin, String model) {
        this.vin = vin;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{ " + model + " " + vin + " }";
    }
}
