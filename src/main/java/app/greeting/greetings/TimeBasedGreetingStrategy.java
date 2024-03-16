package app.greeting.greetings;

import java.time.LocalTime;

enum GreetingTime {
    MORNING, AFTERNOON, EVENING;


    static GreetingTime getGreetingTime() {
        LocalTime currentTime = LocalTime.now();
        int currentHour = currentTime.getHour();
        if (currentHour >= 5 && currentHour < 12) {
            return MORNING;
        } else if (currentHour >= 12 && currentHour < 18) {
            return AFTERNOON;
        } else {
            return EVENING;
        }
    }
};
/**
 * Generates greetings based on the time of day.
 */
public class TimeBasedGreetingStrategy implements GreetingStrategy{
    /**
     * Retrieves a greeting object based on the time of day and the provided name.
     * @param name the name of the person to greet.
     * @return greeting object
     */
    public Greeting getGreeting(String name) {
        GreetingTime greetingTime = GreetingTime.getGreetingTime();

        switch (greetingTime) {
            case MORNING -> {
                return new MorningGreeting(name);
            }
            case AFTERNOON -> {
                return new AfternoonGreeting(name);
            }
            case EVENING -> {
                return new EveningGreeting(name);
            }
        }
        return null;
    }
}
