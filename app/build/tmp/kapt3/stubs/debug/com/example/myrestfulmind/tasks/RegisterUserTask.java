package com.example.myrestfulmind.tasks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\'\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0012\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0013J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0017\u001a\u00020\u0015H\u0014R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lcom/example/myrestfulmind/tasks/RegisterUserTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "context", "Landroid/app/Activity;", "db", "Lcom/example/myrestfulmind/database/AppDataBase;", "user", "Lcom/example/myrestfulmind/database/User;", "(Landroid/app/Activity;Lcom/example/myrestfulmind/database/AppDataBase;Lcom/example/myrestfulmind/database/User;)V", "getContext", "()Landroid/app/Activity;", "getDb", "()Lcom/example/myrestfulmind/database/AppDataBase;", "getUser", "()Lcom/example/myrestfulmind/database/User;", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/lang/Void;", "onPostExecute", "", "result", "onPreExecute", "app_debug"})
public final class RegisterUserTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.myrestfulmind.database.AppDataBase db = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.myrestfulmind.database.User user = null;
    
    public RegisterUserTask(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.NotNull()
    com.example.myrestfulmind.database.AppDataBase db, @org.jetbrains.annotations.NotNull()
    com.example.myrestfulmind.database.User user) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myrestfulmind.database.AppDataBase getDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myrestfulmind.database.User getUser() {
        return null;
    }
    
    @java.lang.Override()
    protected void onPreExecute() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Void doInBackground(@org.jetbrains.annotations.NotNull()
    java.lang.Void... params) {
        return null;
    }
    
    @java.lang.Override()
    protected void onPostExecute(@org.jetbrains.annotations.Nullable()
    java.lang.Void result) {
    }
}