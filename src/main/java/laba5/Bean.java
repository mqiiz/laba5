package laba5;

import laba5.interfaces.ByeInterface;
import laba5.interfaces.HelloInterface;

public class Bean {

    @AutoInjectable
    private HelloInterface helloInterface;

    @AutoInjectable
    private ByeInterface byeInterface;

    public void test() {
        helloInterface.printHello();
        byeInterface.printGoodBye();
    }

}