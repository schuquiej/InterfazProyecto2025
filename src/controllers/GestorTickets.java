package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GestorTickets {


    public void crearTicket(ActionEvent event) throws IOException {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("/interfaz/CrearTicket.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 725, 669);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        Stage stageActual = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stageActual.close();



    }

    public void listadoTickets(ActionEvent event) throws IOException {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("/interfaz/ListadoTickets.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 725, 669);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        Stage stageActual = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stageActual.close();

    }
}
