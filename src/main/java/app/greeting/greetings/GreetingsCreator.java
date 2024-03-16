package app.greeting.greetings;

/**
 * Factory class creates greetings based on the current greeting strategy.
 */
public class GreetingsCreator {

    private GreetingStrategy currentGreetingStrategy = new DefaultGreetingStrategy();

    /**
     * Sets the current greeting strategy.
     * @param strategy the greeting strategy to set.
     */
    public void setCurrentGreetingStrategy(GreetingStrategy strategy) {
        this.currentGreetingStrategy = strategy;
    }

    /**
     * Gets a greeting based on the current strategy.
     * @param name the name of the person to greet.
     * @return a greeting.
     */
    public Greeting getGreeting(String name) {
        return currentGreetingStrategy.getGreeting(name);
    }

    /**
     * Gets an uppercase version of the greeting.
     * @param name the name of the person to greet.
     * @return an uppercase greeting.
     */
    public Greeting getUppercaseGreeting(String name) {
        return new UppercaseGreeting(getGreeting(name));
    }

}