import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane root = FXMLLoader.load(getClass().getResource("/interfaz/login.fxml"));

       Scene scene = new Scene(root, 725, 669);

        primaryStage.setTitle("Proyecto Final Progra 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void handleBoton1(javafx.event.ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/interfaz/menuPrincipal.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 725, 669);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        Stage stageActual = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stageActual.close();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
