package com.sdm;

import java.util.concurrent.atomic.AtomicLong;

class App {
    private final AtomicLong counter = new AtomicLong();

    long badlyNamedMethod() {
        return counter.incrementAndGet();
    }
}
