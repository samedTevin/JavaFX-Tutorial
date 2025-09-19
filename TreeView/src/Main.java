import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    TreeView<String> tree;

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("TreeView");

        TreeItem<String> root, martin, emma;

        //Root
        root = new TreeItem<>();
        root.setExpanded(true);

        //Martin
        martin = makeBranch("Martin", root);
        makeBranch("Youtube", martin);
        makeBranch("Instagram", martin);
        makeBranch("Twitter", martin);

        //Emma
        emma = makeBranch("Emma", root);
        makeBranch("Glitter", emma);
        makeBranch("Makeup", emma);

        //Create tree
        tree = new TreeView<>(root);
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
            if (newValue != null) {
                System.out.println(newValue.getValue());
            }
        });



        //Layout
        StackPane layout = new StackPane();
        layout.getChildren().add(tree);
        Scene scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }

    //Create Branches
    public TreeItem<String> makeBranch(String title, TreeItem<String> parent){
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }
}