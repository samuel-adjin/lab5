package prob2.ducks;

import prob2.CanotFly;
import prob2.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehaviour(new CanotFly());
        setQuackBehaviour(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("Displaying");
    }
}
