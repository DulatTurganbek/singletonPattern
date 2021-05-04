package com.company;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.write("IS-1808K");
        singleton.write("2018");
        singleton.read();

        singleton.write("text");
        singleton.read();
    }
}