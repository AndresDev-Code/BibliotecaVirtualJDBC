package com.bibliotecavirtual.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class DatabaseConnection {

        private static final String URL =
                "jdbc:postgresql://localhost:5432/biblioteca_virtual";

        private static final String USER = "postgres";

        public static Connection getConnection() throws SQLException {

            String password = System.getenv("DB_PASSWORD");

            if (password == null || password.isBlank()) {
                throw new SQLException(
                        "La variable DB_PASSWORD no está configurada."
                );
            }

            return DriverManager.getConnection(URL, USER, password);
        }
    }

