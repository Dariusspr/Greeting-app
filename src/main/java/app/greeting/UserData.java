package app.greeting;

import javafx.scene.paint.Color;

public class UserData {
    private static UserData userData;
    private String name;
    private Color favoriteColor;
    private boolean defaultStrategy;

    public boolean isDefaultStrategy() {
        return defaultStrategy;
    }

    public void setDefaultStrategy(boolean defaultStrategy) {
        this.defaultStrategy = defaultStrategy;
    }

    public static UserData getInstance() {
        if (userData == null) {
            userData = new UserData();
        }
        return userData;
    }

    public  void setName(String name) {
        this.name = name;
    }
    public  String getName() {
        return name;
    }

    public void setFavoriteColor(Color favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public Color getFavoriteColor() {
        return favoriteColor;
    }
}
