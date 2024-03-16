package app.greeting.greetings;

public class EveningGreeting extends  Greeting{
    public EveningGreeting(String name) {
        this.name = name;
    }

    @Override
    public String greet() {
        return "Good evening, " + name + "!";
    }
}
