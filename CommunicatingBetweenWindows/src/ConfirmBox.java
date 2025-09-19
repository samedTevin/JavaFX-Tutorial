import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class ConfirmBox {

    static boolean answer;


    public static boolean display(String title,String message){
        Stage window = new Stage();

        //Block events to other windows
        window.initModality(Modality.APPLICATION_MODAL);

        window.setTitle(title);
        window.setMinWidth(250);
        // Sets the minimum width of the window to 250 pixels
        // The user cannot resize the window smaller than 250 pixels



        Label label = new Label();
        label.setText(message);

        //Create two buttons
        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");

        yesButton.setOnAction(e -> {
            answer = true;
            window.close();
        });

        noButton.setOnAction(e -> {
            answer = false;
            window.close();
        });


        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,yesButton,noButton);
        layout.setAlignment(Pos.CENTER);
        // layout.setAlignment(Pos.CENTER);
        // Sets the position of all children inside the layout to the center


        // Display window and wait for it to be closed before returning
        Scene scene = new Scene (layout);
        window.setScene(scene);
        window.showAndWait();

        return answer;
    }


}