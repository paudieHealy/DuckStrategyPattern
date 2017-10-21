/**
 * Created by paudie on 21/10/2017.
 */
public abstract class Duck {

    FlyingBehaviour flyingBehaviour;
    QuackingBehaviour quackingBehaviour;

    public Duck(){

    }

    public abstract void display();

    public void flyAction() { flyingBehaviour.fly(); }

    public void quackAction() { quackingBehaviour.quack(); }

    public void swim() { System.out.println("All ducks float");}
}
