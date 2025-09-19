import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class AlertBox {



public static void display(String title,String message){
    Stage window = new Stage();

    window.initModality(Modality.APPLICATION_MODAL);

    window.setTitle(title);
    window.setMinWidth(250);

    Label label = new Label();
    label.setText(message);

    Button closeButton = new Button("Close the window");
    closeButton.setOnAction(e -> window.close());

    VBox layout = new VBox(10);
    layout.getChildren().addAll(label,closeButton);
    layout.setAlignment(Pos.CENTER);

    Scene scene = new Scene (layout);
    window.setScene(scene);
    // Opens the window and blocks the execution of the next code line
    // The program "waits" until the user closes this window
    // Useful for dialogs (e.g., confirmation, input) where you need the user's response
    // Difference:
    //   show()        → opens window, program continues immediately
    //   showAndWait() → opens window, program pauses until window is closed
    window.showAndWait();
}


}
