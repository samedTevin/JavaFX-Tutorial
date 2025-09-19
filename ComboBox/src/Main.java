import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;
    ComboBox<String> comboBox;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        window = stage;
        window.setTitle("ComboBox Demo");
        button = new Button("Submit");

        comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Good Will Hunting", "St. Vincent", "Black hat");
        
        comboBox.setPromptText("What is your favorite movie ?");

        comboBox.setEditable(true);

        button.setOnAction(e  -> printMovies());
        comboBox.setOnAction(e  -> System.out.println("User selected: " + comboBox.getValue()));



        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(comboBox,button);

        scene = new Scene(layout,300, 250);
        window.setScene(scene);
        window.show();
    }

    //Print out a movie
    private void printMovies() {
        System.out.println(comboBox.getValue());
    }
}