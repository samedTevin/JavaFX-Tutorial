import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.w3c.dom.Text;

public class Main extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("Window");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label nameLabel = new Label("Name:");
        nameLabel.setId("bold-label");
        GridPane.setConstraints(nameLabel,0,0);

        // Name input
        TextField nameInput = new TextField("Samed"); // TextField is a single-line input field for user text entry


        GridPane.setConstraints(nameInput,1,0);

        //Password label
        Label passLabel = new Label("Password:");
        GridPane.setConstraints(passLabel,0,1);

        //Password input
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput,1,1);

        //Button for login
        Button loginButton = new Button("Login");
        GridPane.setConstraints(loginButton,1,2);

        /*

        Login Buton style: A style from JavaFX

         loginButton.setOnAction(e -> {
            setUserAgentStylesheet(STYLESHEET_CASPIAN);
        });

        But it still looks awful. So we can create our own styles.

         */

        //Button for sign up
        Button signUpButton = new Button("Sign Up");
        signUpButton.getStyleClass().add("button-blue");
        GridPane.setConstraints(signUpButton,1,3);



        grid.getChildren().addAll(nameLabel,nameInput,passLabel,passInput,loginButton,signUpButton);

        Scene scene = new Scene(grid,300,250);

        scene.getStylesheets().add("viper.css");

        window.setScene(scene);

        window.show();





    }
}