
public class MainProgram {

    public static void main(String[] args) {
        // test your class here

                Money a = new Money(10, 0);
                Money b = new Money(3, 50);

                Money c = a.minus(b);

                System.out.println("a: " + a);
                System.out.println("b: " + b);
                System.out.println("c: " + c);

                Money d = new Money(5, 30);
                Money e = new Money(3, 50);
                Money f = d.minus(e);

                System.out.println("d: " + d);
                System.out.println("e: " + e);
                System.out.println("f: " + f);

                Money g = new Money(2, 0);
                Money h = new Money(5, 0);
                Money i = g.minus(h);

                System.out.println("g: " + g);
                System.out.println("h: " + h);
                System.out.println("i: " + i);
            }
        }


