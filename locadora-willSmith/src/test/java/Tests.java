import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

import Bean.AnuncianteBean;
import DAO.AnuncianteDAO;
import DAO.Connect;
import Enums.ConnectionEnums;

public class Tests {

    @Test
    public void statusConnectionTest() {
        // Data
        Connect con = new Connect();
        // When
        con.getConexaoMySQL();
        // Then
        assertEquals("status ShouldBe 'connected'", ConnectionEnums.Conectado, con.status);
    }

    // Anunciante class tests

    @Test
    public void insertAnuncianteTest() {
        try {
        // Data
        boolean result = false;
        AnuncianteDAO anunciante = new AnuncianteDAO();
        AnuncianteBean a = new AnuncianteBean();
        a.setNome("Angelo");
        a.setTelefone("61988992893");
        a.setEmail("angel.@gmail.com");
        a.setSenha("Abacate2");
        // When
        
            result = anunciante.insertAnunciante(a); 
            System.out.println(""+result);
           
        // Then

            assertEquals("Sucesso na operação", result, true);
        } catch (Exception e) {
            fail("Error on insertAnunciante method execution");
        }
        
      
    }

    @Test
    public void readAnuncianteTest() {
        try {
        // Data
            AnuncianteDAO anunciante = new AnuncianteDAO();
        // When
           ArrayList<AnuncianteBean> lista = anunciante.readAnunciante();
        // Then
            assertNotNull("Leitura bem sucedida", lista);
        } catch (Exception e) {
            fail("Error on insertAnunciante method execution");
        }
        
      
    }
}
