public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;

        if (newCents >= 100) {
            newEuros++;
            newCents -= 100;
        }

        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
        }
        return false;
    }

    public Money minus(Money decreaser) {
        if (this.euros - decreaser.euros < 0) {
            return new Money(0, 0);
        }
        else if (this.euros - decreaser.euros == 0) {
            if (this.cents - decreaser.cents < 0) {
                return new Money(0, 0);
            }
            return new Money(0, this.cents - decreaser.cents);
        }

        if (this.cents - decreaser.cents < 0) {
            int newEuros = this.euros - decreaser.euros - 1;
            int newCents = this.cents + 100 - decreaser.cents;
            return new Money(newEuros, newCents);
        }
        else {
            return new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
        }
    }
}