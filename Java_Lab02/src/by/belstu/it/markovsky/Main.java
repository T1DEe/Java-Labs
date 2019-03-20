package by.belstu.it.markovsky;

import by.belstu.it.markovsky.TextFunction;
import by.belstu.it.markovsky.basejava.JavaTest;
import by.belstu.it.markovsky.basejava.WrapperString;

public class Main {

    public static void main(String[] args) {
        // TODO Add a new method
        System.out.println("Hello World!");

        TextFunction obj = new TextFunction();
        obj.getValue();

        WrapperString wrapperString = new WrapperString("string");

        wrapperString.replace('s', 'r');
        System.out.println(wrapperString.getStr());

        wrapperString.delete('t');
        System.out.println(wrapperString.getStr());

    }
}
