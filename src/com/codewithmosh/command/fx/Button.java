package com.codewithmosh.command.fx;

public class Button {

    private String label;
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    /**
     * The code executed in click method depends upon how do we use this method in other classes,
     * thereby to decouple it, we use Command interface and call its execute method,
     * in order to delegate the responsibilities to the Concrete implementation of Command Interface
     * as click method could be used for various purposes - add, delete etc depending upon the use case.
     * Concrete implementation of Command Interface delegates the responsibilities to the appropriate receiver class.
     */
    public void click() {
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
