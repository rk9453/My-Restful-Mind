package com.example.myrestfulmind.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\'J!\u0010\n\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000b\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/example/myrestfulmind/database/TherapistDAO;", "", "delete", "", "user", "Lcom/example/myrestfulmind/database/Therapist;", "findByMail", "mail", "", "pwd", "insert", "", "([Lcom/example/myrestfulmind/database/Therapist;)V", "app_debug"})
public abstract interface TherapistDAO {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.myrestfulmind.database.Therapist... user);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from Therapist where email = :mail and password = :pwd")
    public abstract com.example.myrestfulmind.database.Therapist findByMail(@org.jetbrains.annotations.NotNull()
    java.lang.String mail, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.example.myrestfulmind.database.Therapist user);
}