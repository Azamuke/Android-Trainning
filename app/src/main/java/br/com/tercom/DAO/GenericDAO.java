package br.com.tercom.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Update;

@Dao
public abstract interface GenericDAO <T>{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(T entity);

    @Update
    int update(T entity);

    @Delete
    int delete(T entity);
}
