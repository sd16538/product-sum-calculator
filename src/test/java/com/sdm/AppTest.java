package com.sdm;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AppTest {

    @Test
    public void greetingCounterShouldReturn1OnFirstCall() throws Exception {
        assertThat(new App().badlyNamedMethod(), is(1L));
    }
}
