package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MachineFunctions machine = new MachineFunctions();

        boolean finished = false;
        while (true) {
            System.out.println("Write action (buy, fill, take):");
            String textInput = scanner.next();

            switch (textInput) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    String input = scanner.next();
                    int coffeeSelection = 0;
                    if (input.equalsIgnoreCase("back")) {
                        break;
                    }

                    if (input.equalsIgnoreCase("1")) {
                        coffeeSelection = 1;
                    } else if (input.equalsIgnoreCase("2")) {
                        coffeeSelection = 2;
                    } else if (input.equalsIgnoreCase("3")) {
                        coffeeSelection = 3;
                    }
                    machine.buyCoffee(coffeeSelection);
                    System.out.println("I have enough resources, making you a coffee!");
                    break;

                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    int water = scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    int milk = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    int beans = scanner.nextInt();
                    System.out.println("Write how many disposable cups you want to add:");
                    int cups = scanner.nextInt();
                    machine.fillIngredients(beans, water, milk, cups);
                    break;

                case "take":
                    machine.takeMoney();
                    break;

                case "remaining":
                    print(machine.getWater(), machine.getMilk(), machine.getCoffeeBeans(), machine.getCups(), machine.getMoney());
                    break;
                case "exit":
                    finished = true;
                    break;
                default:
                    System.out.println("Invalid input");
            }

            if (finished) {
                break;
            }
        }
    }

    public static void print(int water, int milk, int beans, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water\n", water);
        System.out.printf("%d ml of milk\n", milk);
        System.out.printf("%d g of coffee beans\n", beans);
        System.out.printf("%d disposable cups\n", cups);
        System.out.printf("$%d of money \n", money);
        System.out.println();
    }


}


