package com.voxelutils.database;

import com.voxelutils.messages.Error;
import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDatabase {
    String host, port, database, username, password;
    Connection connection;

    @Getter
    Statement statement;

    public MySQLDatabase(String host, String port, String database,
                         String username, String password) throws Error {
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
            throw new Error(e.getMessage());
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
}
