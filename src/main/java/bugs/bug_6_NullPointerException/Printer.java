package bugs.bug_6_NullPointerException;

import java.util.Scanner;

public class Printer {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        Scanner scan = new Scanner(System.in);
        setName("Vasya");
        printString(name);
    }

    private void printString(String s) {
        System.out.println(s + " (" + s.length() + ")");
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }

}