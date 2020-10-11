package DAO;

//Ident: SHIFT + OPTION + F
//Classes necessárias para uso de Banco de dados //

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import Enums.ConnectionEnums;

public class Connect {

    public ConnectionEnums status;
    
    // Método de Conexão//

    public java.sql.Connection getConexaoMySQL() {

        Connection connection = null;          //atributo do tipo Connection

        try {

            // Carregando o JDBC Driver padrão

            String driverName = "com.mysql.cj.jdbc.Driver";

            Class.forName(driverName);


            // Configurando a nossa conexão com um banco de dados//

                String serverName = "localhost";    //caminho do servidor do BD

                String mydatabase ="willSmithDatabase";        //nome do seu banco de dados

                String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

                String username = "root";        //nome de um usuário de seu BD

                String password = "12345678";      //sua senha de acesso

                connection = DriverManager.getConnection(url, username, password);

                //Testa sua conexão//

                if (connection != null) {

                    status = ConnectionEnums.Conectado;

                } else {

                    status = ConnectionEnums.ERRO;

                }
                return connection;

            } catch (ClassNotFoundException e) {  //Driver não encontrado



                System.out.println("O driver expecificado nao foi encontrado.");

                return null;

            } catch (SQLException e) {

                //Não conseguindo se conectar ao banco

                System.out.println("Nao foi possivel conectar ao Banco de Dados.");

                return null;

        }

    }

    //Método que retorna o status da sua conexão//

    public ConnectionEnums statusConection() {
        return status;
    }

    //Método que fecha sua conexão//

    public boolean FecharConexao() {

        try {

            this.getConexaoMySQL().close();

            this.status = ConnectionEnums.Desconectado;
            return true;

        } catch (SQLException e) {

            this.status = ConnectionEnums.ERRO;
            return false;

        }
    }

    //Método que reinicia sua conexão//

    public java.sql.Connection ReiniciarConexao() {

        FecharConexao();

        return this.getConexaoMySQL();

    }

    //Método Construtor da Classe//

    public Connect() {

    }

}
