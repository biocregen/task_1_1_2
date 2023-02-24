package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserDaoJDBCImpl user = new UserDaoJDBCImpl();
        user.createUsersTable();
        user.saveUser("Ivan", "Ivanov", (byte) 32);
        user.saveUser("Nikita", "Zakurdaev", (byte) 24);
        user.saveUser("Vladimir", "Kuznetcov", (byte) 41);
        user.saveUser("Eldar", "Pravdin", (byte) 18);
        user.getAllUsers();
        user.cleanUsersTable();
        user.dropUsersTable();

    }
}