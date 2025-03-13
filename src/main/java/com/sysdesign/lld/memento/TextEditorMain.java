package com.sysdesign.lld.memento;


/**
 * This is a demonstration of the Memento design pattern
 * */
public class TextEditorMain {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        CareTaker careTaker = new CareTaker();
        //write any text to the editor
        textEditor.write("This is a sample text editor");

        //save the state so that it can be preserved
        careTaker.saveState(textEditor);

        //write new text
        textEditor.write("The text editor can save and undo what's written");

        //saving new state
        careTaker.saveState(textEditor);

        //It will print the latest statement
        System.out.println(textEditor.getContent());

        //undo will undo the last written data
        careTaker.undo(textEditor);

        //It will print the first statement
        System.out.println(textEditor.getContent());
    }
}
