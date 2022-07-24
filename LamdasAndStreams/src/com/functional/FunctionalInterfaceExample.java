package com.functional;

public class FunctionalInterfaceExample {

    public static void addStateChangeListener(StateChangeListener stateChangeListener, String oldState, String newState) {
        stateChangeListener.onStateChange(oldState, newState);
    }

    public static void main(String[] args) {
        String oldState = "old";
        String newState = "new";

        // Anonymous class implementation for java <= 7
        addStateChangeListener(new StateChangeListener() {
            @Override
            public void onStateChange(String oldState, String newState) {
                System.out.printf("Old way to change state. From: %s to: %s%n", oldState, newState);
            }
        }, oldState, newState);


        // Functional interface with lambda expression for java >= 8
        addStateChangeListener((oldS, newS) -> System.out.printf("New way to change state. From: %s to: %s%n", oldS, newS),
                oldState, newState);
        StateChangeListener.myMethod();
    }

}
