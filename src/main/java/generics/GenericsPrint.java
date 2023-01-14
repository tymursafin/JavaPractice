package generics;

public class GenericsPrint<T> {
    T thingToPrint;

    public GenericsPrint(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }

    public static void main(String[] args) {
        GenericsPrint<Integer> printInteger = new GenericsPrint<>(23);
        printInteger.print();

        GenericsPrint<Double> printDouble = new GenericsPrint<>(25.26);
        printDouble.print();

        GenericsPrint<String> printString = new GenericsPrint<>("Cucumber");
        printString.print();

    }
}
