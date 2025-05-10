import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import widgets.alertas;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main extends Application {


    private alertas objAlerta = new alertas();
    private boolean estado = false;

    @FXML
    private TextField usuarioField;

    @FXML
    private TextField contraseñaField;

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane root = FXMLLoader.load(getClass().getResource("/interfaz/login.fxml"));

        Scene scene = new Scene(root, 725, 669);
        primaryStage.setTitle("Proyecto Final Progra 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    public void handleBoton1(javafx.event.ActionEvent event) throws IOException {
        String usuario = usuarioField.getText();
        String contraseña = contraseñaField.getText();

        System.out.println("Usuario: " + usuario);
        System.out.println("Contraseña: " + contraseña);

        if (usuario.isEmpty() || contraseña.isEmpty()) {

            objAlerta.mostrarAlerta(Alert.AlertType.ERROR, "Error al iniciar", "Por favor ingresar los datos");

        } else {


            System.out.println("hola");
            String url = "jdbc:postgresql://ep-frosty-poetry-a42v0cxc-pooler.us-east-1.aws.neon.tech/neon_progra?user=neon_progra_owner&password=npg_Gorvwm7gO4ty&sslmode=require";
            String user = "neon_progra_owner";
            String password = "npg_Gorvwm7gO4ty";

            try (Connection conn = DriverManager.getConnection(url, user, password)) {

                String sql = "select * from public.login where username = '" + usuario + "' and password = '" + contraseña + "'";

                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    estado = true;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }


        if (estado) {


            FXMLLoader loader = new FXMLLoader(getClass().getResource("/interfaz/menuPrincipal.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root, 725, 669);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

            Stage stageActual = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stageActual.close();


        } else {
            objAlerta.mostrarAlerta(Alert.AlertType.ERROR, "Error al iniciar", "VALIDAR DATOS");
        }


    }

    public static void main(String[] args) {
        launch(args);
    }
}
