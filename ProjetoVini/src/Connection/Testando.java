package Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 * *
 * @author vinicius
 */
public class Testando {

    public static void main(String[] args) throws SQLException {
        Produto p = new Produto();
        ProdutoDAO dao = new ProdutoDAO();
       // p.setDescricao("Maionese");
        //p.setQtd(7);
        //p.setPreco(2.35);
        //dao.create(p);

        for (Produto a : dao.read()) {
            System.out.println(a.getId() + " " + a.getDescricao() + " " + a.getQtd() + " " + a.getPreco()+ " " +a.getUnidadeV());

        }

    }
}
