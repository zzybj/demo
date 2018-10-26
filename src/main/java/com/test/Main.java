package com.test;

import java.util.logging.Logger;

public class Main {

    public static Logger log = Logger.getLogger("log");

    public static void main(String[] args) {
        log.info(MyEnum.BLACK.toString());
    }

}
