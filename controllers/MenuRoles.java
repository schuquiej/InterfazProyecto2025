package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuRoles {
    public void ActualizacionRoles(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/interfaz/ActualizarRol.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 725, 669);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        Stage stageActual = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();


    }

    public void ListaRoles(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/interfaz/ListaRoles.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 725, 669);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        Stage stageActual = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();


    }
}
