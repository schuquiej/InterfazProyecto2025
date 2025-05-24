package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuPrincipal {


    public void gestTikets(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/interfaz/gestorTickets.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 725, 669);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        Stage stageActual = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();



    }

    public void menuDepartamentos(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/interfaz/menuDepartamentos.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 725, 669);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        Stage stageActual = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

    }

    public void menuRoles(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/interfaz/menuRoles.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 725, 669);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        Stage stageActual = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();



    }
}
