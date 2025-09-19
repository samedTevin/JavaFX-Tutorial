import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args)  {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        window = stage;
        window.setTitle("Samed's Meat Sub");

        //Check Box
        CheckBox box1 = new CheckBox("Beef"); // Checkbox option labeled "Beef"
        CheckBox box2 = new CheckBox("Tuna"); // Checkbox option labeled "Tuna"

        // Makes the checkbox 'box2' checked by default
        box2.setSelected(true);

        //Button
        button = new Button("Order now!");
        button.setOnAction(e -> handleOptions(box1, box2));

        //Layout
        VBox layout = new VBox();
        layout.setPadding(new Insets(20,20,20,20));
        // Set padding for the layout: top, right, bottom, left (all 20 pixels)
        // This adds space between the layout edges and its child components

        layout.getChildren().addAll(box1, box2, button);

        scene = new Scene(layout,300,250);

        window.setScene(scene);
        window.show();

    }

    //Handle checkbox options
    public void handleOptions(CheckBox box1, CheckBox box2) {
        String message = "User orders:\n";

        // Check if the checkbox 'box1' is selected
        if (box1.isSelected()) {
            message += "Beef\n";
        }

        // Check if the checkbox 'box2' is selected
        if (box2.isSelected()) {
            message += "Tuna\n";
        }

        System.out.println(message);
    }
}