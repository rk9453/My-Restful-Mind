package com.example.myrestfulmind.tasks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0005\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\u0002\u0010\u000eJ\'\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0016\u0010\u0019\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u001a\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u001bJ\u0012\u0010\u001c\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u001e\u001a\u00020\rH\u0014R\u001f\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016\u00a8\u0006\u001f"}, d2 = {"Lcom/example/myrestfulmind/tasks/FetchTherapist;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "Lcom/example/myrestfulmind/database/Therapist;", "context", "Landroid/app/Activity;", "db", "Lcom/example/myrestfulmind/database/AppDataBaseTh;", "email", "", "password", "callback", "Lkotlin/Function1;", "", "(Landroid/app/Activity;Lcom/example/myrestfulmind/database/AppDataBaseTh;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "getContext", "()Landroid/app/Activity;", "getDb", "()Lcom/example/myrestfulmind/database/AppDataBaseTh;", "getEmail", "()Ljava/lang/String;", "getPassword", "doInBackground", "params", "", "([Ljava/lang/Void;)Lcom/example/myrestfulmind/database/Therapist;", "onPostExecute", "result", "onPreExecute", "app_debug"})
public final class FetchTherapist extends android.os.AsyncTask<java.lang.Void, java.lang.Void, com.example.myrestfulmind.database.Therapist> {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.myrestfulmind.database.AppDataBaseTh db = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String password = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.example.myrestfulmind.database.Therapist, kotlin.Unit> callback = null;
    
    public FetchTherapist(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.NotNull()
    com.example.myrestfulmind.database.AppDataBaseTh db, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.myrestfulmind.database.Therapist, kotlin.Unit> callback) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myrestfulmind.database.AppDataBaseTh getDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.example.myrestfulmind.database.Therapist, kotlin.Unit> getCallback() {
        return null;
    }
    
    @java.lang.Override()
    protected void onPreExecute() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected com.example.myrestfulmind.database.Therapist doInBackground(@org.jetbrains.annotations.NotNull()
    java.lang.Void... params) {
        return null;
    }
    
    @java.lang.Override()
    protected void onPostExecute(@org.jetbrains.annotations.Nullable()
    com.example.myrestfulmind.database.Therapist result) {
    }
}