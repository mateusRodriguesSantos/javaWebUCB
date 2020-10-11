import DAO.Connect;

class testConnect{
    public static void main(String[] args) {
        Connect con = new Connect();

        java.sql.Connection result = con.getConexaoMySQL();

        System.out.print(result);

        System.out.print(con.status);

        con.FecharConexao();

        System.out.print(con.status);
    }
}