package machine;

import java.util.Scanner;

public class BuyAction extends CoffeeMachineAction {

    public BuyAction(CoffeeMachine machine) {
        super(machine);
    }

    @Override
    public void run(Scanner scan) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        var selection = scan.next();
        if(selection.equals("back")) {
            return;
        }
        int recipeNumber = Integer.parseInt(selection); // I'll miss you Int32.TryParse
        var recipe = getRecipe(recipeNumber);
        if(machine.canVend(recipe)) {
            machine.vend(recipe);
        }
    }

    private CoffeeRecipe getRecipe(int selection) {
        switch(selection) {
            case 1: return new EspressoRecipe();
            case 2: return new LatteRecipe();
            case 3: return new CappuccinoRecipe();
        }
        throw new IllegalArgumentException("Invalid selection.");
    }
}

