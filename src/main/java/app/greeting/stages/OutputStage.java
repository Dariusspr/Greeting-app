package app.greeting.stages;

import app.greeting.controllers.OutputController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;


/**
 * Represents the stage where the greeting message is displayed.
 */
public class OutputStage extends Stage {
    private static OutputStage outputStage;
    private String userName;
    private Color userFavoriteColor;
    private boolean defaultStrategy;

    public boolean isDefaultStrategy() {
        return defaultStrategy;
    }

    public void setDefaultStrategy(boolean defaultStrategy) {
        this.defaultStrategy = defaultStrategy;
    }

    private OutputStage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/app/greeting/Output-view.fxml"));
        Parent root = fxmlLoader.load();
        OutputController controller = fxmlLoader.getController();
        Scene scene = new Scene(root);
        this.setResizable(false);
        this.setTitle("Output window");
        this.setScene(scene);
    }

    public static OutputStage getInstance() throws IOException {
        if (outputStage == null) {
            outputStage = new OutputStage();
        }
        return outputStage;
    }

    public void setName(String userName) {
        this.userName = userName;
    }

    public void setFavoriteColor(Color userFavoriteColor) {
        this.userFavoriteColor = userFavoriteColor;
    }

    public String getUserName() {
        return userName;
    }

    public Color getUserFavoriteColor() {
        return userFavoriteColor;
    }
}
