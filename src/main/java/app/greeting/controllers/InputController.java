package app.greeting.controllers;

import app.greeting.UserData;
import app.greeting.stages.InputStage;
import app.greeting.stages.OutputStage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.io.IOException;

public class InputController {
    @FXML
    private TextField tfName;
    @FXML
    private ColorPicker clrpicFavorite;
    @FXML
    private RadioButton rbtnDefault;


    private String userName = "Unknown";
    private Color userFavoriteColor = Color.BLACK;

    private void saveUserData() {
        if (tfName != null)
            userName = tfName.getText();
        if (clrpicFavorite != null)
            userFavoriteColor = clrpicFavorite.getValue();

        UserData userData = UserData.getInstance();
        userData.setName(userName);
        userData.setFavoriteColor(userFavoriteColor);
        userData.setDefaultStrategy(rbtnDefault.isSelected());
    }

    public void onClickEnter() throws IOException {
        saveUserData();


        InputStage.getInstance().close();

        OutputStage outputStage = OutputStage.getInstance();


        // Pass data directly using controller
        outputStage.setName(userName);
        outputStage.setFavoriteColor(userFavoriteColor);
        outputStage.setDefaultStrategy(rbtnDefault.isSelected());


        outputStage.show();

    }

}