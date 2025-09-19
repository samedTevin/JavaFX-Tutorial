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

        // GridPane is like a "grid table" (like squared notebook paper).
        // Each cell can hold UI elements (buttons, labels, text fields).
        //
        // setPadding(new Insets(10,10,10,10)) -> adds 10px empty space
        // Insets → Represents the padding (inner margin) of a container.
        // new Insets(top, right, bottom, left)
        // Defines how much empty space to leave inside from the top, right, bottom, and left sides.
        // around the whole grid (like moving a table slightly away from the wall).
        //
        // setVgap(8) -> adds 8px vertical space between rows
        // (like leaving space between stacked books on a shelf).
        //
        // setHgap(10) -> adds 10px horizontal space between columns
        // (like leaving space between your notebook and pencil case on a desk).

        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);



        // Set the layout constraints for the 'nameInput' node in a GridPane.
        // Here, '1' specifies the column index (second column, since indexing starts at 0),
        // and '0' specifies the row index (first row).
        // Note: This method only sets the position within the GridPane; it does NOT add the node to the GridPane itself.
        //    grid.getChildren().add(nameInput);
        // This ensures that all nodes in the GridPane are properly aligned according to their row and column indices.
        Label nameLabel = new Label("Name:");
        GridPane.setConstraints(nameLabel,0,0);

        // Name input
        TextField nameInput = new TextField("Samed"); // TextField is a single-line input field for user text entry


        GridPane.setConstraints(nameInput,1,0);

        //Password label
        Label passLabel = new Label("Password:");
        GridPane.setConstraints(passLabel,0,1);

        //Password input
        TextField passInput = new TextField();
        passInput.setPromptText("password");// Show this text inside the box when empty, disappears when user types
        // TextField("text") constructor sets initial text (visible and editable)
        // setText(...) changes the actual text (also visible and editable)
        // setPromptText(...) shows a gray placeholder that disappears when typing
        GridPane.setConstraints(passInput,1,1);

        // Button for login
        Button loginButton = new Button("Login");
        GridPane.setConstraints(loginButton,1,2);

        grid.getChildren().addAll(nameLabel,nameInput,passLabel,passInput,loginButton);

        Scene scene = new Scene(grid,300,250);

        window.setScene(scene);

        window.show();





    }
}