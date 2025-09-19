import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

    Stage window;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        window = stage;
        window.setTitle("This title");

        //HBox ( Don't use HBox for top menu : This is an example)

        HBox topMenu = new HBox();

        Button buttonA = new Button("File");
        Button buttonB = new Button("Edit");
        Button buttonC = new Button("View");

        topMenu.getChildren().addAll(buttonA,buttonB,buttonC);

        //VBox

         VBox leftMenu = new VBox();

         Button buttonD = new Button("Search");
         Button buttonE = new Button("Code");
         Button buttonF = new Button("Save");

         leftMenu.getChildren().addAll(buttonD,buttonE,buttonF);

        // BorderPane is a layout that divides the window into 5 regions: top, bottom, left, right, center
        BorderPane borderPane = new BorderPane();

        // setTop(...) places a node in the top region of the BorderPane (e.g., a menu or header)
        // setLeft(...) places a node in the left region of the BorderPane (e.g., a sidebar or navigation)
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        // Other regions you can use: setBottom, setRight, setCenter


        Scene scene = new Scene(borderPane,300,250);
        window.setScene(scene);
        window.show();
    }
}