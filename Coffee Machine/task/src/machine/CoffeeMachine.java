package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int money;

    public CoffeeMachine(int water, int milk, int beans, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cups = cups;
        this.money = money;
    }

    public void printState() {
        System.out.format("The coffee machine has:%n");
        System.out.format("%d ml of water%n", water);
        System.out.format("%d ml of milk%n", milk);
        System.out.format("%d g of coffee beans%n", beans);
        System.out.format("%d disposable cups%n", cups);
        System.out.format("$%d of money%n", money);
    }

    public void processNextAction(Scanner scan) {
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        var action = scan.next();
        switch (action) {
            case "buy":
                new BuyAction(this).run(scan);
                break;
            case "fill":
                new FillAction(this).run(scan);
                break;
            case "take":
                new TakeAction(this).run(scan);
                break;
            case "exit":
                System.exit(0);
                break;
            case "remaining":
                new RemainingAction(this).run(scan);
                break;
        }
    }

    public void vend(CoffeeRecipe recipe) {
        System.out.println("I have enough resources, making you a coffee!");
        water -= recipe.getWater();
        milk -= recipe.getMilk();
        beans -= recipe.getBeans();
        cups -= recipe.getCups();
        money += recipe.getPrice();
    }

    public boolean canVend(CoffeeRecipe recipe) {
        if(water < recipe.getWater()) {
            System.out.println("Sorry, not enough water!");
            return false;
        }
        if(milk < recipe.getMilk()) {
            System.out.println("Sorry, not enough milk!");
            return false;
        }
        if(beans < recipe.getBeans()) {
            System.out.println("Sorry, not enough coffee beans!");
            return false;
        }
        if(cups < recipe.getCups()) {
            System.out.println("Sorry, not enough cups!");
            return false;
        }
        return true;
    }

    public void fill(int water, int milk, int beans, int cups) {
        this.water += water;
        this.milk += milk;
        this.beans += beans;
        this.cups += cups;
    }

    public int takeMoney() {
        int dispensed = this.money;
        this.money = 0;
        return dispensed;
    }

    public static void main(String[] args) {
        var c = new CoffeeMachine(400, 540, 120, 9, 550);
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        while(true) {
            c.processNextAction(scanner);
        }
    }
}
