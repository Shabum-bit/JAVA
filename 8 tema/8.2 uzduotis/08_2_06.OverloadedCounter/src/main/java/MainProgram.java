public class MainProgram {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        System.out.println("Counter1 initial value: " + counter1.value());

        Counter counter2 = new Counter(10);
        System.out.println("Counter2 initial value: " + counter2.value());

        System.out.println("\nTesting basic operations:");
        counter1.increase();
        System.out.println("Counter1 after increase(): " + counter1.value());

        System.out.println("Counter2 after decrease():
        counter2.decrease(); " + counter2.value());

        System.out.println("\nTesting alternative methods:");
        counter1.increase(5);
        System.out.println("Counter1 after increase(5): " + counter1.value());

        counter2.decrease(3);
        System.out.println("Counter2 after decrease(3): " + counter2.value());

        System.out.println("\nTesting with negative parameters:");
        counter1.increase(-2);
        System.out.println("Counter1 after increase(-2): " + counter1.value());

        counter2.decrease(-4);
        System.out.println("Counter2 after decrease(-4): " + counter2.value());
    }
}



