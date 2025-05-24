package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuDepartamentos {


    public void crearDepartamento(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/interfaz/CrearDepartamento.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 725, 669);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        Stage stageActual = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stageActual.close();
    }

    public void listaDepartamentos(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/interfaz/ListadoDepartamentos.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 725, 669);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        Stage stageActual = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stageActual.close();


    }

    public void ActualizacionDepartamento(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/interfaz/ActualizacionDepartamento.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 725, 669);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        Stage stageActual = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();



    }
}
