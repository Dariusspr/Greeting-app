package app.greeting.stages;

import app.greeting.controllers.InputController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Represents the stage where users can enter their information.
 */
public class InputStage extends Stage {

    private static InputStage inputStage;

    private InputStage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/app/greeting/Input-view.fxml"));
        Parent root = fxmlLoader.load();
        InputController controller = fxmlLoader.getController();
        Scene scene = new Scene(root);
        this.setResizable(false);
        this.setTitle("Input window");
        this.setScene(scene);
    }

    public static InputStage getInstance() throws IOException {
        if (inputStage == null) {
            inputStage = new InputStage();
        }
        return inputStage;
    }

}
