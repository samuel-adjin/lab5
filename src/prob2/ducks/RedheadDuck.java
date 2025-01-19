package prob2.ducks;

import prob2.CanotFly;
import prob2.FlyWithWings;
import prob2.MuteQuack;
import prob2.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Displaying");
    }
}
