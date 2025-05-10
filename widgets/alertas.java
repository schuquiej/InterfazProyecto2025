package widgets;

import javafx.scene.control.Alert;

public class alertas {


    public void mostrarAlerta(Alert.AlertType alertType, String titulo,String mensaje) {

        Alert alerta = new Alert(alertType);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();


    }


}
