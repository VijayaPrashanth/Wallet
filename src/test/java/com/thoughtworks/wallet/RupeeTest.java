package com.thoughtworks.wallet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;



public class RupeeTest {

    @Test
    void shouldNotBeAbleToAddAmountWhenAmountIsNegative() throws Exception{

        assertThrows(Exception.class,()->new Rupee(-20));
    } 

    @Test
    void shouldAbleToAddTwoRupees() throws Exception {
        Rupee tenRupee = new Rupee(10);
        Rupee anotherTenRupee = new Rupee(10);
        Rupee twentyRupee = tenRupee.add(anotherTenRupee);
        Rupee expectedBalance = new Rupee(20);

        assertThat(true,is(equalTo(twentyRupee.equals(expectedBalance))));


    }
    
}

