package com.montywu.room.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.montywu.room.dao.UserDao;
import com.montywu.room.model.UserModel;

/**
 * @author monty mwu@szrlzz.com
 * @date 2018/6/13  上午9:33
 * 作用: TODO
 */
@Database(entities = {UserModel.class}, version = 1)
public abstract class MyDateBase extends RoomDatabase {
    abstract UserDao userDao();

    
}
