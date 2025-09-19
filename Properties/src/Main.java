import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("Properties");

        Person samed = new Person();

        samed.firstNameProperty().addListener((v, oldValue, newValue) -> {
            System.out.println("Name changed to " + newValue);
            System.out.println("firstNameProperty(): " + samed.firstNameProperty());
            System.out.println("getFirstName(): " + samed.getFirstName());
        });

        button = new Button("Submit");
        button.setOnAction(event -> {samed.setFirstName("Micheal");});


        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();


    }
}