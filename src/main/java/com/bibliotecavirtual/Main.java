
package com.bibliotecavirtual;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        LibroDAO dao = new LibroDAO();

        try {
            System.out.println("=== BIBLIOTECA VIRTUAL ===");
            System.out.println("Listado de libros registrados:\n");

            dao.listar();

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
