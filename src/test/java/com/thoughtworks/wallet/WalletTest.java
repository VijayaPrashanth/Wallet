package com.thoughtworks.wallet;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public class WalletTest {

    @Test
    void shouldHaveInitialBalanceZeroWhenWalletIsCreated() throws Exception {
        Wallet wallet = new Wallet();
        Rupee expectedBalance = new Rupee(0);
    

        Rupee actualBalance = wallet.balance();

        assertThat(true,is(equalTo(actualBalance.equals(expectedBalance))));
    }

   @Test
    void shouldIncreaseBalanceWhenAmountIsAddedToWallet() throws Exception{
        Wallet wallet = new Wallet();
        Rupee expectedBalance = new Rupee(20);
        
        wallet.put(expectedBalance);
        Rupee actualBalance = wallet.balance();

        assertThat(true,is(equalTo(actualBalance.equals(expectedBalance))));
    }

    @Test
    void shouldIncreaseBalanceWhenSomeAdditionalAmountAddedToWallet() throws Exception{
        Wallet wallet = new Wallet();
        Rupee rupee = new Rupee(20);

        wallet.put(rupee);
        wallet.put(rupee);
        Rupee expectedBalance = new Rupee(40);
        Rupee actualBalance = wallet.balance();


        assertThat(true,is(equalTo(actualBalance.equals(expectedBalance))));

    }



}