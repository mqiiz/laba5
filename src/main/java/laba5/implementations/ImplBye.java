package laba5.implementations;

import laba5.interfaces.ByeInterface;

public class ImplBye implements ByeInterface {

    @Override
    public void printGoodBye() {
        System.out.println("Bye my friend");
    }

}