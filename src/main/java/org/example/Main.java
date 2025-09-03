package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String key = "y";
        while (!key.equalsIgnoreCase("n")) {
            int p = Integer.parseInt(System.console().readLine("Practise: "));
            //only 1 practise so far
            int t = Integer.parseInt(System.console().readLine("Task: "));
            Practise1.task(t);

            key = System.console().readLine("%nContinue? y/n ");
        }
    }
}