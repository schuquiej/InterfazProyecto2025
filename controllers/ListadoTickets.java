package controllers;

import Conexiones.manageSql;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.beans.property.SimpleStringProperty;

import java.util.List;
import java.util.Map;

public class ListadoTickets {

    @FXML
    private TableView<ObservableList<String>> tablaTickets;

    @FXML
    public void initialize() {
        llenarTablaTickets();
    }

    private void llenarTablaTickets() {
        manageSql sql = new manageSql();

        List<Map<String, Object>> datos = sql.obtenerDatosGenericos(
                "SELECT id, titulo, departamento, tecnico, detalle, estado,  created FROM tickets"
        );

        if (datos.isEmpty()) return;

        tablaTickets.getColumns().clear();
        Map<String, Object> primeraFila = datos.get(0);
        for (int i = 0; i < primeraFila.size(); i++) {
            final int columnaIndex = i;
            String nombreColumna = (String) primeraFila.keySet().toArray()[i];

            TableColumn<ObservableList<String>, String> columna = new TableColumn<>(nombreColumna);
            columna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().get(columnaIndex)));
            tablaTickets.getColumns().add(columna);
        }

        ObservableList<ObservableList<String>> tableData = FXCollections.observableArrayList();

        for (Map<String, Object> row : datos) {
            ObservableList<String> fila = FXCollections.observableArrayList();
            for (Object valor : row.values()) {
                fila.add(valor != null ? valor.toString() : "");
            }
            tableData.add(fila);
        }

        tablaTickets.setItems(tableData);
    }
}
