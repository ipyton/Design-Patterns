package Factory;

//对于产品类的扩展
public abstract class AbstractFactory {
    abstract Food createFood();
    abstract Weapon createWeapon();
    abstract Vehicle createVehicle();

    public static void main(String[] args) {

    }
}

class Motorbike extends Vehicle{

}

class Broom extends Vehicle {

}

class Bread extends Food{


}

class Mushroom extends Food{

}

class AK47 extends Weapon{

}

abstract class Food{

}

abstract class Weapon{

}

abstract class Vehicle{

}


//实现自己的工厂
class AbstractFactoryImpl extends AbstractFactory{
    @Override
    Food createFood(){
        return new Bread();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }

    @Override
    Vehicle createVehicle() {
        return new Motorbike();
    }

}