import javafx.application.Application;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window; // Stage window; → create a reference for the window (Stage)
    Scene scene1,scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        window = stage; // Stage window; → create a reference for the window (Stage)
        // You can use 'stage' directly (no need for 'window = stage;')
        // Using 'window' is just a naming preference, both refer to the same Stage


        Label label1 = new Label("Welcome to First Scene");
        // Label label1 = new Label("Welcome to First Scene");
        // Label → a UI control that displays text (not clickable, just shows information)
        // "Welcome to First Scene" → the text that will appear on the label
        // label1 → reference to the Label object, so we can add it to a layout later

        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        //Layout-1
        // VBox layout = new VBox(spacing);
        // VBox → Vertical Box, places children in a vertical column (top to bottom)
        // spacing → the vertical space (in pixels) between each child node
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1,button1);
        scene1 = new Scene(layout1,200,200);

        //Button-2
        Button button2 = new Button("This scene sucks, go back to scene 1");
        button2.setOnAction(e -> window.setScene(scene1));

        //Layout-2
        // StackPane layout = new StackPane();
        // StackPane → places all children on top of each other (stacked like layers)
        // (no spacing parameter, because nodes overlap each other)
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2,600,300);

        window.setScene(scene1);
        window.setTitle("This title");
        window.show();

    }
}