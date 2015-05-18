package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Drag Resize Demo");
        Pane root = new Pane();

        Rectangle rectangle = new Rectangle(50, 50);
        rectangle.setFill(Color.BLACK);
        DragResizeMod.makeResizable(rectangle, null);

        Rectangle rectangle2 = new Rectangle(50, 50);
        rectangle.setFill(Color.RED);
        DragResizeMod.makeResizable(rectangle2);

        root.getChildren().addAll(rectangle, rectangle2);
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
