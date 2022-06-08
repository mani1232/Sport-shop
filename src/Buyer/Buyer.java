package Buyer;

import Records.Product;

import java.util.List;

public class Buyer {
    float wallet;
    List<Product> history;

    public Buyer(float wallet, List<Product> history) {
        this.wallet = wallet;
        this.history = history;
    }

    public float getWallet() {
        return wallet;
    }

    public List<Product> getHistory() {
        return history;
    }

    public void setWallet(float wallet) {
        this.wallet = wallet;
    }

    public void setHistory(List<Product> history) {
        this.history = history;
    }
}
