import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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
        window.setTitle("This window");

        TextField nameInput = new TextField();

        Button button = new Button("Click me!");
        button.setOnAction(e -> verify(nameInput,nameInput.getText()));
        // setText() -> sets/changes the text displayed in the TextField
        // getText() -> retrieves/reads the text currently in the TextField
        
        VBox layout = new VBox();
        layout.setPadding(new Insets(10,10,10,10));
        layout.getChildren().addAll(nameInput,button);

        Scene scene = new Scene(layout,300,250);

        window.setScene(scene);
        window.show();




    }

    // Method to check if the TextField contains a valid number
    public static boolean verify(TextField nameInput, String message) {
        try{
            // Try to parse the text as an integer
            int age = Integer.parseInt(nameInput.getText());
            System.out.println("Your age is: " + age);
            return true;
        }
        catch(NumberFormatException e){
            // If parsing fails, show an error message
            System.out.println("Error: " + message + " is not a number");
            return false;
        }
    }
}