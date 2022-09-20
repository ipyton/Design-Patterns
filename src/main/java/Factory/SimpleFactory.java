package Factory;

public class SimpleFactory {
    public Car createCar(){
        return new Car();
    }
    public Plane createPlane(){
        return new Plane();


    }
}
