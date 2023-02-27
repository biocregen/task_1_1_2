package jm.task.core.jdbc;

import com.mysql.cj.jdbc.ConnectionImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        UserServiceImpl service = new UserServiceImpl();
        service.createUsersTable();
        service.saveUser("Ivan", "Ivanov", (byte) 32);
        service.saveUser("Nikita", "Zakurdaev", (byte) 24);
        service.saveUser("Vladimir", "Kuznetcov", (byte) 41);
        service.saveUser("Eldar", "Pravdin", (byte) 18);
        service.getAllUsers();
        service.cleanUsersTable();
        service.dropUsersTable();
    }
}