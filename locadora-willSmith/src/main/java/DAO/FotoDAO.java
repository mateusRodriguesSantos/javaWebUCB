package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Bean.FotoBean;
import Bean.ImovelBean;

/**
 * CRUD of EnderecoBean
 *
 * @author Mateus Rodrigues
 * @version 1.0
 * @since 2020-10-13
 */
public class FotoDAO {
       /*
     * Atributtes of AnuncianteBean: private int idAnunciante; private String nome;
     * private int telefone; private String email; private int senha;
     */

    // Insert Anunciante
    /**
     * This method registry an anunciante in data base
     * 
     * @param newAnunciante this first paramenter for insert anunciante in data base
     * @return boolean that indicates status of the operation - true or false
     * @throws SQLException
     */
    public boolean insertAnunciante(FotoBean newFoto,int idImovel) throws SQLException {
        boolean result = false;
        // Create connection
        Connect con = new Connect();
        java.sql.Connection session = con.getConexaoMySQL();

        // SQL
        String sql = "INSERT INTO Foto (path,imovel) VALUES (?, ?)";
        PreparedStatement statement = session.prepareStatement(sql);

        // Insert attributes
        statement.setString(1, newFoto.getPath());
        statement.setString(2,""+idImovel);

        // Execute SQL
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new user was inserted successfully!"+rowsInserted);
            result = true;
        }

        con.FecharConexao();
        return result;
    }

    // Read Fot
    /**
     * This method read an foto in data base
     * 
     * @return An Foto object
     * @throws SQLException
     */
    public FotoBean readFoto(int idFoto) throws SQLException {
        FotoBean foto = null;
        // Create connection
        Connect con = new Connect();
        java.sql.Connection session = con.getConexaoMySQL();

        String sql = "SELECT * FROM Foto WHERE idFoto = ?";

        PreparedStatement statement = session.prepareStatement(sql);
        ResultSet result = statement.executeQuery();

        // Insert attributes
        statement.setString(1,""+idFoto);

   

        while (result.next()) {
            ImovelDAO imovel = new ImovelDAO();
            ImovelBean i = imovel.readImovel(Integer.parseInt(result.getString(3)));
            foto = new FotoBean(result.getInt(1), i, result.getString(2));
        }

        con.FecharConexao();

        return foto;
    }

    // Update Anunciante
    /**
     * This method update an anunciante in data base
     * 
     * @param idFoto  this first paramenter for update foto in data base
     * @param newFoto this second paramenter for update foto in data
     * @return boolean that indicates status of the operation - true or false
     * @throws SQLException
     */
    public boolean updateAnunciante(int idFoto, FotoBean newFoto) throws SQLException {
        boolean result = false;
        // Create connection
        Connect con = new Connect();
        java.sql.Connection session = con.getConexaoMySQL();

        String sql = "UPDATE Foto SET path=? WHERE idFoto=?";

        PreparedStatement statement = session.prepareStatement(sql);
        statement.setString(1, newFoto.getPath());
        statement.setString(2,""+idFoto);

        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("An existing foto was updated successfully!");
            result = true;
        }
        con.FecharConexao();
        return result;
    }

    // Drop Foto
    /**
     * This method drop an foto in data base
     * 
     * @return boolean that indicates status of the operation - true or false 
     * @throws SQLException
     */
    public boolean dropFoto(int idFoto) throws SQLException {
        boolean result = false;
        // Create connection
        Connect con = new Connect();
        java.sql.Connection session = con.getConexaoMySQL();

        String sql = "DELETE FROM Foto WHERE idFoto=?";

        PreparedStatement statement = session.prepareStatement(sql);
        statement.setString(1,""+idFoto);

        int rowsDeleted = statement.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("A user was deleted successfully!");
            result = true;
        }

        con.FecharConexao();

        return result;
    }

}
