package machine;

import java.util.Scanner;

public class TakeAction extends CoffeeMachineAction {
    public TakeAction(CoffeeMachine coffeeMachine) {
        super(coffeeMachine);
    }

    @Override
    public void run(Scanner scan) {
        int money = machine.takeMoney();
        System.out.format("I gave you $%d%n", money);
    }
}
