package market.client;

import market.market.Market;
import market.market.MyInfo;

public class Person implements Client {

    private String name;
    Market market;

    public Person(String name, Market market) {
        this.name = name;
        this.market = market;
        market.addClient(this);
    }
    @Override
    public void update(Object ob) {
        MyInfo myInfo = (MyInfo)ob;

        if (myInfo.getCostForOne() == 50)
            System.out.println(this.getName() + " покупает товар");
        else System.out.println(this.getName() + " просмотрел");
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
