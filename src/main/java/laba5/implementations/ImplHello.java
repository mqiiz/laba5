package laba5.implementations;

import laba5.interfaces.HelloInterface;

public class ImplHello implements HelloInterface {

    @Override
    public void printHello() {
        System.out.println("Hi my friend");
    }

}