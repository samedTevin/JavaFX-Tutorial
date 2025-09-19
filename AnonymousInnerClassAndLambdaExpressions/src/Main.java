
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    // inheritance : Using Application stuffs
    Button button;

    public static void main(String[] args) {
        launch(args); // Sets up our program as a Javafx application

    }

    @Override
    public void start(Stage stage) throws Exception { // Inherited from Application class : Main JavaFX code
        // JavaFX calls window as Stage
        // JavaFX calls content/view as Scene : contents of the window
        // This method represents main stage(window) : Look for parameters ---> Stage stage

        stage.setTitle("The title of the window");

        button = new Button();
        button.setText("Click me"); // There is other way : You could write button = new Button("Click me"); ---> No difference

        /*

        // this class will handle the button events
        button.setOnAction(new EventHandler<ActionEvent>() {
            // In this way we don't need if conditions for which button is it ?
            // Functionality is tied with object
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("I am an anonymous inner class");
            }
        });

        But for every button we must type this code again and again...

        Oracle solved this problem with JAVA 8 : Lambda Expressions

        */

        // Lambda expression:
        // This class will handle the button events
        button.setOnAction(e -> System.out.println("Hello Im here"));
        // e = ActionEvent (the event object), contains info about the click
        // -> means "when button is clicked, run this code"



        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        // StackPane: puts everything on top of each other, so buttons, text, etc. can overlap
        // Layout = like a box that arranges everything inside the Scene, decides where things go
        // getChildren(): gets the list of items inside the layout so you can add or remove nodes


        Scene scene = new Scene(layout,300,250);
        // Scene(layout, 300, 250): layout to display, width = 300px, height = 250px
        stage.setScene(scene);

        stage.show();

    }


}
