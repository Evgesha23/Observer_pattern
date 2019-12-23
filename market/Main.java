package market;

import market.client.*;
import market.market.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* РЫНОК ДРАГОЦЕННЫХ МЕТАЛЛОВ
        * наблюдатель - поведенческий паттерн, который
        * позволяет объектам оповещать другие объекты
        * об изменениях своего состояния.*/

        ConcrMarket market = new ConcrMarket();

        Scanner cin = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("Введите номер: ");
            System.out.println("1 - Person");
            System.out.println("2 - Firm");
            System.out.println("3 - Example");
            System.out.println("0 - Exit");

            int number = cin.nextInt();
            switch (number) {
                case 1:
                    System.out.print("Имя человека: ");
                    Person p1 = new Person(cin.next(), market);
                    market.market();
                    System.out.println("Хотите дальше получать уведомления о поступлениях?(1-Да, 2-Нет): ");
                    int yesNo = cin.nextInt();
                    if (yesNo == 1) System.out.println("OK");
                    else if(yesNo == 2) p1.Stop();
                    break;
                case 2:
                    System.out.print("Название фирмы: ");
                    Firm f1 = new Firm(cin.next(), market);
                    market.market();
                    System.out.println("Хотите дальше получать уведомления о поступлениях?(1-Да, 2-Нет): ");
                    int yesNo2 = cin.nextInt();
                    if (yesNo2 == 1) System.out.println("OK");
                    else if(yesNo2 == 2) f1.Stop();
                    break;
                case 3:
                    Person person = new Person("Иван", market);
                    Firm firm = new Firm("Apple", market);
                    market.market();
                    System.out.println(market);
                    person.Stop();
                    firm.Stop();
                    break;
                case 0:
                    flag = false;
                    break;
            }
        }
    }
}
