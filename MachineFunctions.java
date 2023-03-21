package machine;

public class MachineFunctions {
    private int coffeeBeans = 120;
    private int water = 400;
    private int milk = 540;
    private int cups = 9;
    private int money = 550;

    public void buyCoffee(int input) {
        Coffee coffee = new Coffee(input);
        boolean hasEnoughIngredients = hasEnoughIngredients(coffee);
        if (hasEnoughIngredients) {
            coffeeBeans -= coffee.getBeansNeeded();
            water -= coffee.getWaterNeeded();
            milk -= coffee.getMilkNeeded();
            money += coffee.getCost();
            cups --;
        }
    }

    public void fillIngredients(int beans, int water, int milk, int cups) {
        this.coffeeBeans += beans;
        this.water += water;
        this.milk += milk;
        this.cups += cups;
    }

    public boolean hasEnoughIngredients(Coffee coffee) {
        boolean hasEnough = false;

        boolean enoughWater = this.water >= coffee.getWaterNeeded();
        boolean enoughMilk = this.milk >= coffee.getMilkNeeded();
        boolean enoughBeans = this.coffeeBeans >= coffee.getBeansNeeded();
        boolean enoughCups = this.cups > 0;

        if (enoughWater && enoughMilk && enoughBeans && enoughCups) {
            hasEnough = true;
        } else {
            if (!enoughWater) {
                System.out.println("Sorry, not enough water!");
            }
            if (!enoughMilk) {
                System.out.println("Sorry, not enough milk!");
            }
            if (!enoughBeans) {
                System.out.println("Sorry, not enough coffee beans!");
            }
            if (!enoughCups) {
                System.out.println("Sorry, not enough cups!");
            }
        }

        return hasEnough;
    }

    public void takeMoney() {
        System.out.println("I gave you $" + this.money);
        this.money = 0;
    }



// =========================================================================
//           **** GETTERS AND SETTERS ****

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return this.money;
    }
}

