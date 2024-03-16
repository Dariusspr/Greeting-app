package app.greeting.greetings;

/**
 * Defines a strategy for generating greetings.
 */
public interface GreetingStrategy {
    /**
     * Retrieves a greeting object based on the provided name.
     * @param name the name of the person to greet.
     * @return greeting object
     */
    Greeting getGreeting(String name);
}
