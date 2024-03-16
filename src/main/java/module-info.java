module app.greeting {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.greeting to javafx.fxml;
    opens app.greeting.controllers to javafx.fxml;

    exports app.greeting;
    opens app.greeting.greetings to javafx.fxml;
}