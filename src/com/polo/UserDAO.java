package com.polo;

import java.sql.SQLException;
import java.util.List;

public interface   UserDAO {
    void addUser(User user) throws SQLException;
//    void updateUser(User user) throws SQLException;
    void deleteUser(int id) throws SQLException;
//    void getUserId(String email) throws SQLException;
    List<User> getUsers();
    default User userById(int id) {
        return null;
    }
}

