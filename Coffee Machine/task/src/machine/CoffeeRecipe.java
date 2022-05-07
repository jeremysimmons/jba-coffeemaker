package machine;

public abstract class CoffeeRecipe  {
    private final int cups = 1;
    private final int water;
    private final int milk;
    private final int beans;
    private final int price;

    protected CoffeeRecipe(int water, int milk, int beans, int price) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.price = price;
    }

    public int getCups() {
        return cups;
    }
    public int getWater() {
        return water;
    }
    public int getMilk() {
        return milk;
    }
    public int getBeans() {
        return beans;
    }
    public int getPrice() {
        return price;
    }
}

