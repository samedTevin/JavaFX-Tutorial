import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        window = stage;
        window.setTitle("ChoiceBox Demo");
        button = new Button("Click me!");

        ChoiceBox<String> choiceBox = new ChoiceBox<>(); // Drop down menu

        //getItems returns the ObservableList object when you can add items to
        choiceBox.getItems().add("Apples");
        choiceBox.getItems().add("Bananas");
        choiceBox.getItems().addAll("Meat","Tuna","Chicken");
        // Adds items to the ChoiceBox.
        // 'add' adds one item at a time, 'addAll' adds multiple items at once.

        //Set a default value
        choiceBox.setValue("Apples");


        //Listen for selection changes
        choiceBox.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> System.out.println(newValue));



        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(choiceBox,button);

        scene = new Scene(layout,300,250);

        window.setScene(scene);

        window.show();

    }


}