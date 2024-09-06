package jm.task.core.jdbc;


import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Иэн", "Кёртис", (byte) 23);
        userService.saveUser("Алексей", "Перминов", (byte) 24);
        userService.saveUser("Густав", "Ар", (byte) 21);
        userService.saveUser("Джеймс", "МакКормик", (byte) 20);
        List<User> list = userService.getAllUsers();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
        userService.removeUserById(1);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}