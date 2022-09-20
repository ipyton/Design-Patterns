package Factory;

import java.io.Serializable;

public class Car implements Movable{
    protected void move(){

    }
    private void DIDI(){

    }
    void DEFAULT(){

    }
}

class ECar extends Car implements Serializable {
    void m(){
        super.move();
        super.DEFAULT();
        Car c = new Car();
        c.DEFAULT();
        c.move();
    }

}