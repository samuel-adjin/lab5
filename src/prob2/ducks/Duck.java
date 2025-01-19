package prob2.ducks;

import prob2.FlyBehaviour;
import prob2.QuackBehaviour;

public abstract class Duck {

   public abstract void display();
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public void fly() {
        flyBehaviour.fly();
    }
    public void quack() {
        quackBehaviour.quack();
    }
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void swim() {
        System.out.println("Swimming");
    }



}
