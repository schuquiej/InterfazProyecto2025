package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {

    private static final String URL = "jdbc:postgresql://ep-frosty-poetry-a42v0cxc-pooler.us-east-1.aws.neon.tech/neon_progra";
    private static final String USUARIO = "neon_progra_owner";
    private static final String CONTRASEÑA = "npg_Gorvwm7gO4ty";

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL + "?user=" + USUARIO + "&password=" + CONTRASEÑA + "&sslmode=require");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
