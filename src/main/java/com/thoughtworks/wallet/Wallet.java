package com.thoughtworks.wallet;


public class Wallet extends Exception{

    private Rupee balance;

    public Wallet() throws Exception
    {
        this.balance = new Rupee(0);
    }

    public void put(Rupee rupeeValue) throws Exception{
        Rupee rupee = new Rupee(0);

        balance=balance.add(rupeeValue);

    }

    public Rupee balance(){
        return this.balance;
    }
}