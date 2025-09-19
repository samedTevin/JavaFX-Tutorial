import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    BorderPane layout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("Making Menus");

        //File Menu
        Menu fileMenu = new Menu("File");

        //Menu Items
        MenuItem newFile = new MenuItem("New...");
        newFile.setOnAction(event -> System.out.println("Create a new file..."));
        fileMenu.getItems().add(newFile);


        fileMenu.getItems().add(new MenuItem("Open..."));
        fileMenu.getItems().add(new MenuItem("Save..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Settings..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Exit..."));


        //Edit menu
        Menu editMenu = new Menu("_Edit");
        editMenu.getItems().add(new MenuItem("Cut"));
        editMenu.getItems().add(new MenuItem("Copy"));

        MenuItem paste = new MenuItem("Paste");
        paste.setOnAction(event -> System.out.println("Pasting something"));
        paste.setDisable(true);
        editMenu.getItems().add(paste);


        //Help menu
        Menu helpMenu = new Menu("Help");

        CheckMenuItem showLines = new CheckMenuItem("Show line numbers");
        showLines.setOnAction(event -> {
            if(showLines.isSelected())
                System.out.println("Showing line numbers");
            else
                System.out.println("No showing line numbers");
        });

        CheckMenuItem autoSave = new CheckMenuItem("Enable Auto saving");
        autoSave.setSelected(true); // by default, it was unchecked. Now we are setting it's checked.

        helpMenu.getItems().addAll(showLines, autoSave);


        //Main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu,editMenu,helpMenu);

        layout = new BorderPane();
        layout.setTop(menuBar);

        Scene scene = new Scene(layout,400,300);
        window.setScene(scene);
        window.show();

    }
}