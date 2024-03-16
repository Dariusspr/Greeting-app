package app.greeting.greetings;

public class HelloGreeting extends Greeting {
    public HelloGreeting(String name) {
        this.name = name;
    }

    @Override
    public String greet() {
        return "Hello, " + name + "!";
    }
}
