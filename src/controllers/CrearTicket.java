package controllers;

import Conexiones.manageSql;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CrearTicket {


    @FXML
    private ComboBox<String> miComboBox;

    @FXML
    private ComboBox<String> miComboBox1;

    @FXML
    private ComboBox<String> miComboBox2;

    @FXML
    private TextField textFieldTitulo;

    @FXML
    private TextField textFieldMensaje;







    public void guardarTicket() {
        String departamento = miComboBox.getValue();
        String area = miComboBox1.getValue();
        String tecnico = miComboBox2.getValue();
        String titulo = textFieldTitulo.getText();
        String mensaje = textFieldMensaje.getText();

        manageSql insertar = new manageSql();

        String sql = "INSERT INTO tickets (departamento, area, tecnico, titulo, detalle) VALUES (?, ?, ?, ?, ?)";
        boolean resultado = insertar.insertarDatos(sql,
                departamento,
                area,
                tecnico,
                titulo,
                mensaje
        );


      System.out.println(resultado);

        // Aquí puedes insertar esos datos en la base o usarlos como necesites
    }
}
