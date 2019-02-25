package by.belstu.it.markovsky;

public class TextFunction {

    public String getValue() {
        printMessage("Message");

        for (int count = 0; count < 10; count++) {
            System.out.println("Counter "+count);
        }

        return "Hello from first project";
    }

    public void printMessage(String str) {
        System.out.println(str);
    }
}
