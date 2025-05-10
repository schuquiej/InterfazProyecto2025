package Conexiones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class manageSql {

    public boolean insertarDatos(String query, Object... parametros) {
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            for (int i = 0; i < parametros.length; i++) {
                stmt.setObject(i + 1, parametros[i]); // Los índices en SQL comienzan desde 1
            }

            stmt.executeUpdate();
            System.out.println("Ticket guardado exitosamente.");
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    public List<Map<String, Object>> obtenerDatosGenericos(String query, Object... parametros) {
        List<Map<String, Object>> resultList = new ArrayList<>();

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            for (int i = 0; i < parametros.length; i++) {
                stmt.setObject(i + 1, parametros[i]);
            }

            try (ResultSet rs = stmt.executeQuery()) {
                var metaData = rs.getMetaData();
                int columnCount = metaData.getColumnCount();

                while (rs.next()) {
                    Map<String, Object> rowMap = new LinkedHashMap<>();

                    for (int i = 1; i <= columnCount; i++) {
                        String columnName = metaData.getColumnName(i);
                        Object columnValue = rs.getObject(i);
                        rowMap.put(columnName, columnValue);
                    }

                    resultList.add(rowMap);

                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultList;
    }


}
