package com.codewithmosh.singleton;

public class SingletonDemo {

    public void execute() {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "Mosh");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("name"));
    }
}
