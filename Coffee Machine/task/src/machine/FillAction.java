package machine;

import java.util.Scanner;

public class FillAction extends CoffeeMachineAction {

    public FillAction(CoffeeMachine machine) {
        super(machine);
    }

    public void run(Scanner scan) {
        System.out.println("Write how many ml of water you want to add:");
        int water = scan.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        int milk = scan.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int beans = scan.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int cups = scan.nextInt();
        machine.fill(water, milk, beans, cups);
        /*
> 2000
Write how many ml of milk you want to add:
> 500
Write how many grams of coffee beans you want to add:
> 100
Write how many disposable cups of coffee you want to add:
> 10
         */
    }
}
