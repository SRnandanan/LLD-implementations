package com.sysdesign.lld.memento;

/**
 * This class represents the originator or the TextEditor in our case
 * the simple editor only consists of plain text which can be updated or reverted.
 */
public class TextEditor {

    private String content;

    public TextEditor() {
        this.content = "";
    }
    public Memento save() {
        return new Memento(this.content);
    }

    //Restores memory back into the content
    public void restore(Memento data) {
        this.content = data.getContent();
    }

    //write function appends the string
    public void write(String s) {
        this.content += s + "\n";
    }

    public String getContent() {
        return this.content;
    }
}
