package prob2.ducks;

import prob2.CanotFly;
import prob2.MuteQuack;
import prob2.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyBehaviour(new CanotFly());
        setQuackBehaviour(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("Displaying");
    }
}
