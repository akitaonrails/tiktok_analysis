package com.tencent.wcdb.database;

/* JADX INFO: loaded from: classes.dex */
public class DatabaseObjectNotClosedException extends RuntimeException {
    public DatabaseObjectNotClosedException() {
        super("Application did not close the cursor or database object that was opened here");
    }
}
