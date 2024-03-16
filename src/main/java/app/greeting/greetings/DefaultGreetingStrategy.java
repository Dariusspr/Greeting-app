package app.greeting.greetings;

/**
 * Default greeting strategy
 * */
public class DefaultGreetingStrategy implements GreetingStrategy{

    @Override
    public Greeting getGreeting(String name) {
        return new HelloGreeting(name);
    }
}
