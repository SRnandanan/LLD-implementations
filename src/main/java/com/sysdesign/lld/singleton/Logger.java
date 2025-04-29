package com.sysdesign.lld.singleton;

class Logger {

    private static Logger instance;

    private Logger() {
        System.out.println("Logger is being initialized");
    }

    public static Logger getInstance() {
        if(instance==null)
            instance = new Logger();
        return instance;
    }

    public static void log(String text) {
        System.out.println("LOG: "+text);
    }
}
