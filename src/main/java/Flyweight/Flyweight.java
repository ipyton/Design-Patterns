package Flyweight;

import Factory.Car;
import Factory.Plane;

public class Flyweight {
}
class ProtectedTest extends Car {
    //我想仅仅让我的子类和同一个包下的（无论是在同一个包还是不同的包）使用我的某些属性。这时候public的范围太大了，因为public属性还会被别的方法调用，private
    // 又太小因为别的包内的子类使用不了我的方法，默认仅仅是在包内可以使用
    public void my(){
        Plane p = new Plane();
        p.move();
        Car c = new Car();
        super.move();



    }
    private void privateTest(){



    }
}
class N extends ProtectedTest{
    void m(){

    }
}
