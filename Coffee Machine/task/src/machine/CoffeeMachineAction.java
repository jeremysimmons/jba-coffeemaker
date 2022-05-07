package machine;

import java.util.Scanner;

public abstract class CoffeeMachineAction {
    protected CoffeeMachine machine;

    public CoffeeMachineAction(CoffeeMachine machine) {
        this.machine = machine;
    }

    public abstract void run(Scanner scan);
}
