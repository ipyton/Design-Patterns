package Factory;

public class CarFactory {
    public Movable create(){
        return new Car();
    }
}
