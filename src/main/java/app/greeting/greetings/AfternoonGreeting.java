package app.greeting.greetings;

public class AfternoonGreeting extends Greeting{
    public AfternoonGreeting(String name) {
        this.name = name;
    }

    @Override
    public String greet() {
        return "Good afternoon, " + name + "!";
    }
}
