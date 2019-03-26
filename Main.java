package com.company;

public class Main {

    public static void main(String[] args) {

        userGreetings();

        Human man = new Human(2000);
        Factory factory = new Factory();

        Days day = new Days();

        TV tv = factory.createTv();
        Controller controller = new Controller(1, 2, 3);

        man.getBudget(tv.cost);

        Provider provider = new Provider();


        System.out.println("Day - " + day.Day);
        System.out.println("Mental balance: " + man.mentalBalance + "%");
        System.out.println("He`s went to the factory and buy a new TV with this options: " + tv.size + " inches, " +
                tv.Color + " color" + " and a creators are " + tv.mark + ".");
        System.out.println("He`s spend " + tv.cost + "$.");
        System.out.println("And his budget change to " + man.budget + "$");
        System.out.println("He`s come home and unpacked TV. " + "But he had a one problem, he hasn`t channels on his TV to watch.");
        System.out.println("And he should to buy a channel package in provider. He called to provider and made a order: first channel package.");
        System.out.println("This package has 3 channels: 1-st, 2-nd and 3-rd. And he spend " + provider.package1Cost + "$" + " and he budget was: " + provider.givePackage1(man.budget, provider.package1Cost) + "$");
        man.budget = provider.givePackage1(man.budget, provider.package1Cost);
        System.out.println("He comes home, goes to the living room, take a controller and put on button: ");

        controller.turnOn();

        System.out.println("He was very glad, because he had some channels to watch.");
        System.out.println("A man start watching... He put on a button in controller and see: ");
        controller.turnUpChannels(controller.button2);
        System.out.println("And he put again on the button: ");
        controller.turnUpChannels(controller.button3);
        System.out.println("And again: ");
        controller.turnUpChannels(controller.button4);
        System.out.println("He want to choose a second channel and put on button and see: ");
        controller.turnDownChannels(controller.button3);
        System.out.println("After he turn off the TV.");
        controller.turnOff();
        System.out.println("Suddenly he has a angry about this TV and want to change him to the other one.");

        System.out.println(" ");

        System.out.println("Day - " + day.newDay(day.Day));
        System.out.println("Mental balance: " + man.changeMentalBalance(man.mentalBalance) + "%"); man.mentalBalance = man.changeMentalBalance(man.mentalBalance);
        System.out.println("A man come to the factory and says that he want to change his TV, which he bought in ths factory, to the new one");
        System.out.println("But he hasn`t a reason cause  to change a TV and he must to pay a half of the TV cost.");

        TV tv1 = factory.changeTv(tv);

        System.out.println("He change to the same TV.");
        System.out.println("A man comes home and think about new channel package.");
        System.out.println("He call to provider, and tell that he need a new channel package, and provider say him that a new one will be cost twice as much.");
        System.out.println("He buy this package, and his budget was: " + provider.givePackage2(man.budget, provider.package2Cost) + "$");
        man.budget = provider.givePackage2(man.budget, provider.package2Cost);
        System.out.println("Also he have a new controller.");

        Controller controller1 = new Controller(7, 8, 9, 10);
        controller1.turnOn();

        System.out.println("He want to watch all channels, which has his new package.");
        controller.turnUpChannels(controller.button5);
        System.out.println("Next: ");
        controller.turnUpChannels(controller.button6);
        System.out.println("He start district about this package... But go to next channel: ");
        controller.turnUpChannels(controller.button7);
        System.out.println("He don`t see sth that intresting for him and all hope on a last channel");
        controller.turnUpChannels(controller.button8);
        System.out.println("He was angry, he spend all his money and don`t get a good TV with a good channels.");
        System.out.println("He was so angry, that throw away of window a new TV.");
        System.out.println("On his unlucky, he throw TV right on a car of his neighbor, who just parked.");
        System.out.println("Neighbor see that this man throw TV in his car, and goes to man`s flat to get money to fix a car, and took away all his money..."); man.budget = man.budget-man.budget;

        System.out.println(" ");

        System.out.println("Day - " + day.newDay(day.Day));
        System.out.println("His budget: " + man.budget+"$");
        System.out.println("His mental balance: " +  man.changeMentalBalance(man.mentalBalance) + "%");
        System.out.println("A man killed himself, because he hasn`t money and he was inadequate.");
    }

    public static void userGreetings() {
        System.out.println("One upon a time, a young man have a bored with his old TV, and he decided to buy a new one.");
        System.out.println("And this programme about this story...");
    }
    public static void conclusion(){
        System.out.println("So, this story tell us about man, who want to have a good time, buy a new TV and have a happy life, but kill himself.");
        System.out.println("Don`t buy a new TV!!!");
    }
}