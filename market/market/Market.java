package market.market;

import market.client.Client;

public interface Market {
    void notifyClient();
    void removeClient(Client client);
    void addClient(Client client);
}
