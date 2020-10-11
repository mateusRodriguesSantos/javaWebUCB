import static org.junit.Assert.assertEquals;

import org.junit.Test;

import DAO.Connect;
import Enums.ConnectionEnums;

public class Tests {
    
    @Test
    public void statusConnectionTest(){
        //Data
        Connect con = new Connect();
        //When
        con.getConexaoMySQL();
        //Then
        assertEquals("status ShouldBe 'connected'", ConnectionEnums.Conectado,con.status);
    }
}
