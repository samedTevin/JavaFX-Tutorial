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


        // Triggered when the window is requested to close (e.g., clicking the X button)
        // e.consume() stops the default close behavior
        // closeProgram() runs custom code before actually closing the window
        window.setOnCloseRequest(e -> {
            // e.consume() stops the default close action
            // Without it, the window would close automatically
            // With consume(), you can run your own code (like closeProgram()) before closing
            // It lets you intercept the user's close request and handle it manually
            e.consume();
            closeProgram();
        });

        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        button = new Button("Close program");
        button.setOnAction(e -> closeProgram());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout,300,200);
        window.setScene(scene);
        window.show();

    }

    private void closeProgram() {

        boolean answer = ConfirmBox.display("This title","Are you sure you want to close this program?");

        if(answer){
            window.close();
        }

    }
}