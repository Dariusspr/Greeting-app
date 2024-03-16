package app.greeting.controllers;

import app.greeting.UserData;
import app.greeting.greetings.Greeting;
import app.greeting.greetings.GreetingsCreator;
import app.greeting.greetings.TimeBasedGreetingStrategy;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.io.IOException;

public class OutputController {
    @FXML
    private Text txtGreeting;
    @FXML
    private Button btnClick;
    @FXML
    private void onClickClick() throws IOException {
        GreetingsCreator greetingsCreator = new GreetingsCreator();
        UserData userData = UserData.getInstance();

        if (!userData.isDefaultStrategy())
            greetingsCreator.setCurrentGreetingStrategy(new TimeBasedGreetingStrategy());

        Greeting  greeting = greetingsCreator.getUppercaseGreeting(userData.getName());
        txtGreeting.setText(greeting.greet());
        txtGreeting.setFill(userData.getFavoriteColor());
        btnClick.setVisible(false);
        txtGreeting.setVisible(true);

    }

}
