package machine;

import java.util.Scanner;

public class RemainingAction extends CoffeeMachineAction{
    public RemainingAction(CoffeeMachine coffeeMachine) {
        super(coffeeMachine);
    }

    @Override
    public void run(Scanner scan) {
        machine.printState();
    }
}
