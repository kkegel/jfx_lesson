package src;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static Scene scene;
    public static Stage primary_stage;
    public static GridPane root_layout;

    public static Controller controller;

    @Override
    public void start(Stage primary_stage) throws Exception{

        this.primary_stage = primary_stage;
        this.primary_stage.setTitle("primary_stage");

        init_root_layout();
    }

    public void init_root_layout() {

        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("main.fxml"));

            root_layout = (GridPane) loader.load();
            root_layout.setPrefSize(512,256);

            scene = new Scene(root_layout);
            primary_stage.setScene(scene);
            primary_stage.show();

            //controller = new Controller(root_layout, primary_stage);

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
