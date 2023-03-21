package machine;

public class Coffee {
    private int waterNeeded;
    private int beansNeeded;
    private int milkNeeded;
    private int cost;

    public Coffee(int input) {
        switch (input) {
            case 1:
                espresso();
                break;
            case 2:
                latte();
                break;
            case 3:
                cappuccino();
                break;
        }
    }

    public void espresso() {
        this.waterNeeded = 250;
        this.beansNeeded = 16;
        this.milkNeeded = 0;
        this.cost = 4;
    }

    public void latte() {
        this.waterNeeded = 350;
        this.beansNeeded = 20;
        this.milkNeeded = 75;
        this.cost = 7;
    }

    public void cappuccino() {
        this.waterNeeded = 200;
        this.beansNeeded = 12;
        this.milkNeeded = 100;
        this.cost = 6;
    }

    public int getWaterNeeded() {
        return waterNeeded;
    }

    public int getBeansNeeded() {
        return beansNeeded;
    }

    public int getMilkNeeded() {
        return milkNeeded;
    }

    public int getCost() {
        return this.cost;
    }
}
