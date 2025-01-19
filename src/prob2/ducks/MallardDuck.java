package prob2.ducks;

import prob2.FlyBehaviour;
import prob2.FlyWithWings;
import prob2.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Displaying");
    }
}
