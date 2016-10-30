package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoSQL {

    private static final String url = "jdbc:oracle:thin@localhost:1521:XE";
    private static final String usuario = "system";
    private static final String senha = "Gil@@3442";

    /**
     *
     * @return this method make a connection with OracleDB By EmbedDesign
     */
    public Connection conectar() throws Exception {

        Connection conn = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, usuario, senha);

        } catch (Exception ex) {

            ex.printStackTrace();
            throw new Exception("Erro ao conectar no BD.");

        }

        return conn;

    }

    public void desconectar(Connection conn) throws Exception {

        try {

            if (conn != null) {

                conn.close();

            }

        } catch (Exception ex) {

            ex.printStackTrace();
            throw new Exception("Não conseguiu fechar a conexão.");

        }

    }

}
