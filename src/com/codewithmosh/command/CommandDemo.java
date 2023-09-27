package com.codewithmosh.command;

import com.codewithmosh.command.fx.Button;

/**
 * Command Interface is used to decouple the invoker/sender class and receiver class
 */
public class CommandDemo {

    public void execute() {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();
    }
}
