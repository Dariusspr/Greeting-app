package app.greeting;

import app.greeting.stages.InputStage;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        InputStage.getInstance().show();
    }

    public static void main(String[] args) {
        launch();
    }
}