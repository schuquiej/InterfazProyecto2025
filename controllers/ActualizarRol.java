package controllers;

import Conexiones.manageSql;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import widgets.alertas;

import java.util.List;
import java.util.Map;

public class ActualizarRol {


    private alertas objAlerta = new alertas();

    @FXML
    public TextField Nombre;
    @FXML
    public TextField Id;
    @FXML
    public TextField Descripcion;



    public void buscarRol(ActionEvent event) {


        manageSql sql = new manageSql();
        int idDepartamento = Integer.parseInt(Id.getText());

        String sqlQuery = "SELECT * FROM roles WHERE id = ?";
        List<Map<String, Object>> datos = sql.obtenerDatosGenericos(sqlQuery, idDepartamento);


        if (!datos.isEmpty()) {
            Map<String, Object> departamento = datos.get(0);  // Primer resultado
            Id.setText(String.valueOf(departamento.get("id")));
            Nombre.setText((String) departamento.get("nombre"));
            Descripcion.setText((String) departamento.get("descripcion"));
        } else {

            Id.setText("");
            Nombre.setText("");
            Descripcion.setText("");
            objAlerta.mostrarAlerta(Alert.AlertType.ERROR, "Rol no encontrado.", "Por favor validar los datos");

            // Opcional: mostrar alerta
        }


    }

    public void actualizarRol(ActionEvent event) {

        String descr = Descripcion.getText();

        int idDepartamento = Integer.parseInt(Id.getText()); // o de donde lo tomes

        manageSql insertar = new manageSql();
        String sql = "UPDATE roles SET descripcion = ? WHERE id = ?";
        boolean resultado = insertar.actualizarDatos(sql,
                descr,
                idDepartamento
        );

        if (resultado) {
            objAlerta.mostrarAlerta(Alert.AlertType.CONFIRMATION, "Exito!.", "Informacion actualizada con exito");

        } else {
            objAlerta.mostrarAlerta(Alert.AlertType.ERROR, "Error al actualizar el rol.", "Error");
        }

        System.out.println(resultado);

    }
}
