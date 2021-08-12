package com.polo;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void getName() {
        User u = new User(100,"John", "there@there.com", 45, "user", 0, false);
        assertEquals("John", u.getName());
    }

    @Test
    public void getEmail() {
        User u = new User(100,"John", "there@there.com", 45, "user", 0, false);
        assertEquals("there@there.com", u.getEmail());
    }

    @Test
    public void getRole() {
        User u = new User(100,"John", "there@there.com", 45, "user", 0, false);
        assertEquals("user", u.getRole());
    }

    @Test
    public void getAge() {
        User u = new User(100,"John", "there@there.com", 45, "user", 0, false);
        assertEquals(45, u.getAge());
    }
}