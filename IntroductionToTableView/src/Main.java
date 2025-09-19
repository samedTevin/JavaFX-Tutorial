import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("IntroTableView");

        VBox vBox = new VBox();
        vBox.getChildren().addAll();

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();

    }
}