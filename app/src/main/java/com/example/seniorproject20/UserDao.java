package com.example.seniorproject20;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface UserDao {
    @Query("SELECT * FROM user")
    List<User> getAll();

    @Query("SELECT * FROM user WHERE id LIKE :id LIMIT 1")
    User findById(int id);

    @Insert
    void insertAll(User... users);

    @Delete
    void delete(User user);
}



