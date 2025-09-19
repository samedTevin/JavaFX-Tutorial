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
        window.setTitle("JavaFX");

        window.setOnCloseRequest(e -> closeProgram());

        button = new Button("Close program");
        button.setOnAction(e -> closeProgram());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout,300,200);
        window.setScene(scene);
        window.show();

    }

    private void closeProgram() {
        System.out.println("File saved!");
        window.close();
    }
}