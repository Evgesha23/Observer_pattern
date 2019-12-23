package market.market;

import market.client.Client;
import java.util.*;

public class ConcrMarket implements Market {
    MyInfo myInfo; //Информация о рынке
    List<Client> list;

    public ConcrMarket() {
        list = new ArrayList<Client>();
        myInfo = new MyInfo();
    }

    @Override
    public void notifyClient(){
        for (Client c: list) {
            c.update(myInfo);
        }
    }
    @Override
    public void removeClient(Client client){ list.remove(client);}
    @Override
    public void addClient(Client client){ list.add(client);}

    public void market() { //какая продукция поступила
        Scanner cin = new Scanner(System.in);
        System.out.print("Вид металла: ");
        myInfo.setTypeOfMetal(cin.next());
        System.out.print("Количество: ");
        myInfo.setAmountOfMetal(cin.nextInt());
        System.out.print("Цена за одну штуку: ");
        myInfo.setCostForOne(cin.nextDouble());
        System.out.println(myInfo);
        notifyClient();
    }

    @Override
    public String toString() {
        return myInfo + "";
    }
}
