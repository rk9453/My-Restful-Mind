package com.example.myrestfulmind.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\'J!\u0010\n\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000b\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/example/myrestfulmind/database/UserDAO;", "", "deleteUser", "", "user", "Lcom/example/myrestfulmind/database/User;", "findByEmail", "mail", "", "pwd", "insert", "", "([Lcom/example/myrestfulmind/database/User;)V", "app_debug"})
public abstract interface UserDAO {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.myrestfulmind.database.User... user);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from User where email = :mail and password = :pwd")
    public abstract com.example.myrestfulmind.database.User findByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String mail, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd);
    
    @androidx.room.Delete()
    public abstract void deleteUser(@org.jetbrains.annotations.NotNull()
    com.example.myrestfulmind.database.User user);
}