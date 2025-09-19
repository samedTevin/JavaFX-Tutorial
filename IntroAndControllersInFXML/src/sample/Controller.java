package sample;

import javafx.scene.control.Button;

public class Controller {

    public Button button;

    public void handleButtonClick(){
        System.out.println("Run some code the user doesn't see");
        button.setText("Stop clicking me!");
    }
}
