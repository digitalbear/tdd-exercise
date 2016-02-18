package com.digitalbear;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest {

    @Test
    public void shouldSayHelloToTheWorld() {

        Greeter greeter = new Greeter();

        String helloMsg = greeter.sayHello();

        assertEquals(helloMsg, "Hello World!");

    }

}
