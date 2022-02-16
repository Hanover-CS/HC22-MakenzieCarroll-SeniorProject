//package com.example.seniorproject20.db;
//
//import androidx.room.Dao;
//import androidx.room.Delete;
//import androidx.room.Insert;
//import androidx.room.Query;
//
//import java.util.List;
//
//@Dao
//public interface UserDao {
//
//    @Query("SELECT * FROM user")
//    List<User> getAll();
//
//    @Query("SELECT * FROM user WHERE id IN (:userIds)")
//    List<User> loadAllByIds(int[] userIds);
//
//    @Query("SELECT * FROM user WHERE shoe_name LIKE :shoe LIMIT 1")
//    User findByShoe(String shoe);
//
//    @Insert
//    void insertUser(User... users);
//
//    @Delete
//    void delete(User user);
//
////    UserDao userDao = shoes_database.userDao();
////    List<User> users = userDao.getAll();
//}
//
//
