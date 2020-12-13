package com.voxelutils.database;

import java.sql.*;

public class MySQLDatabase {
    String host, port, database, username, password;
    Connection connection;
    Statement statement;

    public MySQLDatabase(String host, String port, String database,
                         String username, String password) {
        this.host = host;
        this.port = port;
        this.database = database;
        this.username = username;
        this.password = password;

        connection = null;

        try {
            openConnection();
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void openConnection() throws SQLException, ClassNotFoundException {
        if (connection != null && !connection.isClosed()) {
            return;
        }

        Class.forName("com.mysql.jdbc.Driver");

        connection = DriverManager.getConnection("jdbc:mysql://"
                + this.host + ":" + this.port + "/"
                + this.database, this.username, this.password);
    }

    public Statement getStatement() {
        return this.statement;
    }
}
