package padoka.src.View.Model;
import java.sql.*;

import padoka.src.View.Controller.*;

public class PingPongModel {
    public static void qtdFarinha() {
        int qtdFarinha = 0;
        try {
            Connection conn = PingPongConnector.conectar();
            String strSqlSelectProdutos = "select * from `db_ping_pong`.`tbl_produtos` where `id` = 1;";
            Statement stmSqlProdutos = conn.createStatement();
            ResultSet rsSqlProdutos = stmSqlProdutos.executeQuery(strSqlSelectProdutos);
            while (rsSqlProdutos.next()) {
                qtdFarinha = Integer.valueOf(rsSqlProdutos.getString("qtd"));
            }
            stmSqlProdutos.close();
            rsSqlProdutos.close();
        } catch (Exception e) {
            System.err.println("Ops! Ocorreu o erro: " + e);
        }
        InterfacePadoka.qtdFarinha = qtdFarinha;
    }
}
