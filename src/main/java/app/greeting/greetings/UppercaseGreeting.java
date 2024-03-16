package app.greeting.greetings;

/**
 * Represents a decorator that converts the greeting message to uppercase.
 */
public class UppercaseGreeting extends Greeting{
    private final Greeting greeting;
    public UppercaseGreeting(Greeting greeting) {
        this.greeting = greeting;
    }

    @Override
    public String greet() {
        return  greeting.greet().toUpperCase();
    }
}
