package com.sysdesign.lld.memento;

import java.util.Stack;

/**
 * The purpose of this class is to have a property that
 * acts as a state manager for the text editor. It has a data structure
 * that has mementos or 'states' which may be used to retrieve previous or save
 * new states
 * */
public class CareTaker {

    private final Stack<Memento> states = new Stack<Memento>();

    public CareTaker(){
        super();
    }

    public void saveState(TextEditor editor){
        states.push(editor.save());
    }

    public void undo(TextEditor editor){
        if(!states.isEmpty()){
            states.pop();
            editor.restore(states.peek());
        }
    }


}
