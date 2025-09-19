
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {
    // inheritance : Using Application stuffs
    // implements : There are lots of types of EventHandler : Touch, Click , Mouse but for now we will use button
    // implements EventHandler<ActionEvent>: this class knows what to do when the button is clicked
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
        button.setOnAction(this);
        // this: refers to this class itself, acting as the event handler


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

    @Override
    public void handle(ActionEvent actionEvent) {
        // Whenever user clicks the button, this function will work
        // handle(...): code here runs when the button is pressed
        if(actionEvent.getSource() == button){ // getSource(): tells which UI element triggered the event
            System.out.println("You clicked me!");
        }
        //if(actionEvent.getSource() == button2) {
        // System.out.println("You clicked 2nd button.");
        // } and so on...
    }
}
