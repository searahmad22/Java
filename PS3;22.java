
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.text.Font;


public class PS_3_22_22 extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("ShadowText");
        VBox box = new VBox();
        box.setStyle(
            "-fx-background-color: darkred;" +
            "-fx-spacing: 35; " +
            "-fx-padding: 35,35,35,35; " +
            "-fx-alignment: center");
        Text text = new Text("JavaFX");

        text.setFont(Font.font("serif", FontWeight.BOLD, 60));
        text.setStyle("-fx-effect: dropshadow(gaussian,grey,5.0,0,3.0,3.0);" +
            "-fx-fill: white");
        box.getChildren().add(text);

        Scene scene = new Scene(box, 500, 500);
        stage.setScene(scene);

        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
