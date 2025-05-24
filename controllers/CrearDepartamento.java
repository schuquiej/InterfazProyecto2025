package controllers;

import Conexiones.manageSql;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class CrearDepartamento {


    public TextField Id;
    @FXML
    private TextField nombre;

    @FXML
    private TextField descripcion;




    public void guardarDepartamento(ActionEvent event) {



            String Nombre = nombre.getText();
            String Descripcion = descripcion.getText();

            manageSql insertar = new manageSql();

            String sql = "INSERT INTO departamentos (nombre, descripcion) VALUES (?, ?)";
            System.out.println(sql);
            boolean resultado = insertar.insertarDatos(sql,
                    Nombre,
                    Descripcion
            );


            System.out.println(resultado);



    }
}
