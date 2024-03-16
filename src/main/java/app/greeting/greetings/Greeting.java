package app.greeting.greetings;

/**
 * This class is extended by concrete greeting classes such as
 * HelloGreeting, MorningGreeting, AfternoonGreeting, and EveningGreeting.
 */
public abstract class Greeting {
    protected String name;

    /**
     * @return greeting message
     */
    public String greet() {return "";}

}
