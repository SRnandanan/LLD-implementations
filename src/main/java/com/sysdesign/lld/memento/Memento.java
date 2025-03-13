package com.sysdesign.lld.memento;

/**
 * Memento represents a state of the originator (the text editor in our case)
 * and the only purpose of it is to capture the state. It may not be modified
 * */
public class Memento {

    private final String content;

    public Memento(String content){
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}
