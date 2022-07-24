package com.functional;

@FunctionalInterface
public interface StateChangeListener {
    void onStateChange(String oldState, String newState);

    static void myMethod() {
        System.out.println("printam");
    }
}
