package market.client;

import market.market.*;

import java.util.Scanner;

public class Firm implements Client {
    private String name;
    Market market;

    public Firm(String name, Market market) {
        this.name = name;
        this.market = market;
        market.addClient(this);
    }
    @Override
    public void update(Object ob) {
        MyInfo myInfo = (MyInfo)ob;

        Scanner cin = new Scanner(System.in);
        System.out.print("Желаемый вид металла: ");
        String metal = cin.next();

        if ((myInfo.getAmountOfMetal() > 5) && (myInfo.getTypeOfMetal().compareTo(metal) == 0))
            System.out.println(this.getName() + " покупает товар");
        else System.out.println(this.getName() + " делает предварительный заказ");
    }
    public void Stop() {
        market.removeClient(this);
        market = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "\n";
    }
}
