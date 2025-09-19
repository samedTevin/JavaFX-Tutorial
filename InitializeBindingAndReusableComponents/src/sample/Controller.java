package sample;


import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    // initializer is for whenever you want to run code right after your view load(fxml)
    // Example: loading user data from database, loading save files etc.
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Loading user data...");
    }
}
