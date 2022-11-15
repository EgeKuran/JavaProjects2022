package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static Scanner scan;
    public static boolean flag;
    public static String action;
    public static void main(String[] args) {

//        Coffee cf = new Coffee();
//
//        System.out.println("Coffee is ready!");
//        System.out.println("Write how many cups of coffee you will need: ");
        scan = new Scanner(System.in);
        int cups = 9;
        int water = 400;
        int milk = 540 ;
        int beans = 120;
        int money = 550;

//        try {
//            System.out.println("Write how many ml of water the coffee machine has:");
//            water = scan.nextInt();
//            System.out.println("Write how many ml of milk the coffee machine has:");
//            milk = scan.nextInt();
//            System.out.println("Write how many grams of coffee beans the coffee machine has:");
//            beans = scan.nextInt();
//            System.out.println("Write how many cups of coffee you will need:");
//            cups = scan.nextInt();
//        } catch (Exception e) {
//            System.out.println("Please input a valid number");
//            scan.next();
//        }
//        System.out.printf("For %d cups of coffee you will need: \n" +
//                "%d ml of water\n" +
//                "%d ml of milk\n" +
//                "%d g of coffee beans",cups,cups*water,cups*milk,cups*beans);
//        Coffee coffeeMaker = new Coffee(water,milk,beans,cups);
//        coffeeMaker.makeCoffee();
        Coffee coffeeMaker = new Coffee(water,milk,beans,cups,money);
        action = "";
        coffeeMaker.start(coffeeMaker);

    }
    public static class Coffee
    {
        private int machineWater;
        private int machineMilk;
        private int machineBeans;
        private int cups;
        private int money;


        public Coffee() {
            System.out.println("Starting to make a coffee");
//            this.makeCoffee();
        }
        public Coffee(int water, int milk, int beans, int cups) {
            this.machineWater = water;
            this.machineMilk = milk;
            this.machineBeans = beans;
            this.cups = cups;
            flag = false;
//            System.out.println("Starting to make a coffee");

        }

        public Coffee(int water, int milk, int beans, int cups, int money) {
            this.machineWater = water;
            this.machineMilk = milk;
            this.machineBeans = beans;
            this.cups = cups;
            this.money = money;
        }

        private void makeCoffee() {
            int waterNeed = 200;
            int milkNeed = 50;
            int beansNeed = 15;

            int minTemp = Math.min(machineWater/waterNeed,machineMilk/milkNeed);
            int min = Math.min(minTemp,machineBeans/beansNeed);

            if(min>cups){
                System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)",min-cups);
            }
            else if(min==cups){
                System.out.println("Yes, I can make that amount of coffee");
            }
            else{
                System.out.printf("No, I can make only %d cup(s) of coffee",min);
            }
        }

//        private void makeCoffee() {
//            this.grind();
//            this.boil();
//            this.mix();
//            this.pour();
//            this.milk();
//        }

        public void grind() {
            System.out.println("Grinding coffee beans");
        }

        public void boil() {
            System.out.println("Boiling water");
        }

        public void mix() {
            System.out.println("Mixing boiled water with crushed coffee beans");
        }

        public void pour() {
            System.out.println("Pouring coffee into the cup");
        }

        public void milk() {
            System.out.println("Pouring some milk into the cup");
        }

        @Override
        public String toString() {

            String coffeeState = "The coffee machine has:\n" +
                    machineWater + " ml of water\n" +
                    machineMilk + " ml of milk\n" +
                    machineBeans + " g of coffee beans\n" +
                    cups + " disposable cups\n" +
                    "$" + money + " of money";
            return coffeeState;
        }

        public void buy() {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
            String type = "";
            try {
                type = scan.next();
                if(!type.equals("1") && !type.equals("2") && !type.equals("3") && !type.equals("back")){
                    throw new Exception();

                }
            } catch (Exception e) {
                System.out.println("Please enter  a valid input");
            }
            switch (type){
                case "1" :
                    if(this.machineWater < 250){
                        System.out.println("Sorry, not enough water!");}
                    else {
                        if(this.machineBeans < 16) {
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                        else
                        {
                            if(this.cups< 1)
                            {
                                System.out.println("Sorry, not enough cups!");
                            }
                            else
                            {
                                this.machineWater -= 250;
                                this.machineBeans -= 16;
                                this.money += 4;
                                this.cups -= 1;
                                System.out.println("I have enough resources, making you a coffee!");
                            }
                        }
                    }

                    break;
                case "2" :

                    if(this.machineWater < 350){
                        System.out.println("Sorry, not enough water!");}
                    else {
                        if(this.machineMilk < 75) {
                            System.out.println("Sorry, not enough milk!");
                        }
                        else
                        {
                            if(this.machineBeans < 16)
                            {
                                System.out.println("Sorry, not enough coffee beans!");
                            }
                            else
                            {
                                if(this.cups< 1)
                                {
                                    System.out.println("Sorry, not enough cups!");
                                }
                                else {
                                    this.machineWater -= 350;
                                    this.machineMilk -= 75;
                                    this.machineBeans -= 20;
                                    this.money += 7;
                                    this.cups -= 1;
                                    System.out.println("I have enough resources, making you a coffee!");
                                }
                            }
                        }
                    }

                    break;
                case "3" :

                    if(this.machineWater < 200){
                        System.out.println("Sorry, not enough water!");}
                    else {
                        if(this.machineMilk < 100) {
                            System.out.println("Sorry, not enough milk!");
                        }
                        else
                        {
                            if(this.machineBeans < 12)
                            {
                                System.out.println("Sorry, not enough coffee beans!");
                            }
                            else
                            {
                                if(this.cups< 1)
                                {
                                    System.out.println("Sorry, not enough cups!");
                                }
                                else {
                                    this.machineWater -= 200;
                                    this.machineMilk -= 100;
                                    this.machineBeans -= 12;
                                    this.money += 6;
                                    this.cups -= 1;
                                    System.out.println("I have enough resources, making you a coffee!");
                                }
                            }
                        }
                    }

                    break;
                case "back" :
                    this.start(this);

            }
        }

        public void fill() {
            System.out.println("Write how many ml of water you want to add: ");
            try {
                this.machineWater += scan.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter  a valid input");
                scan.next();
            }
            System.out.println("Write how many ml of milk you want to add: ");
            try {
                this.machineMilk += scan.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter  a valid input");
                scan.next();
            }
            System.out.println("Write how many grams of coffee beans you want to add: ");
            try {
                this.machineBeans += scan.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter  a valid input");
                scan.next();
            }
            System.out.println("Write how many disposable cups you want to add: ");
            try {
                this.cups += scan.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter  a valid input");
                scan.next();
            }
        }

        public void take() {
            System.out.println("I gave you $" + this.money);
            this.money = 0;
        }

        public void start(Coffee coffeeMaker) {

            while (!action.equals("exit")) {
                System.out.println("Write action (buy, fill, take, remaining, exit): ");

                    action = scan.next();
                    if(!action.equals("buy") && !action.equals("fill") && !action.equals("take")&& !action.equals("remaining")&& !action.equals("exit")){
                        System.out.println("Please enter a valid input");
                        continue;
                    }



                switch (action){
                    case "buy":
                        coffeeMaker.buy();
                        break;
                    case "fill":
                        coffeeMaker.fill();
                        break;
                    case "take":
                        coffeeMaker.take();
                        break;
                    case "remaining":
                        System.out.println(coffeeMaker);
                        break;
                    case "exit":
                        break;
                }


            }

        }
    }
}
