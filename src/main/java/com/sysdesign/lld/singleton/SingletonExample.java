package com.sysdesign.lld.singleton;

public class SingletonExample {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("This is an example of Singleton pattern");
        logger.log("Logging is a real world use-case");
    }
}
