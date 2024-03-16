package app.greeting.greetings;

public class MorningGreeting extends Greeting {

    public MorningGreeting(String name) {
        this.name = name;
    }

    @Override
    public String greet() {
        return "Good morning, " + name + "!";
    }
 }
