package controllers;

import Conexiones.manageSql;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.List;
import java.util.Map;

public class ListadoDepartamentos {

    @FXML
    private TableView<ObservableList<String>> tablaDepartamentos;

    @FXML
    public void initialize() {
        llenarTablaDepartamentos();
    }

    private void llenarTablaDepartamentos() {
        manageSql sql = new manageSql();

        List<Map<String, Object>> datos = sql.obtenerDatosGenericos(
                "SELECT id, nombre, descripcion, created FROM departamentos"
        );

        if (datos.isEmpty()) return;

        tablaDepartamentos.getColumns().clear();
        Map<String, Object> primeraFila = datos.get(0);
        for (int i = 0; i < primeraFila.size(); i++) {
            final int columnaIndex = i;
            String nombreColumna = (String) primeraFila.keySet().toArray()[i];

            TableColumn<ObservableList<String>, String> columna = new TableColumn<>(nombreColumna);
            columna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().get(columnaIndex)));
            tablaDepartamentos.getColumns().add(columna);
        }

        ObservableList<ObservableList<String>> tableData = FXCollections.observableArrayList();

        for (Map<String, Object> row : datos) {
            ObservableList<String> fila = FXCollections.observableArrayList();
            for (Object valor : row.values()) {
                fila.add(valor != null ? valor.toString() : "");
            }
            tableData.add(fila);
        }

        tablaDepartamentos.setItems(tableData);
    }

}
