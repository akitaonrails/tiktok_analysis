package com.tencent.wcdb.database;

import com.tencent.wcdb.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes15.dex */
public final class SQLiteCustomFunction {
    public final SQLiteDatabase.CustomFunction callback;
    public final String name;
    public final int numArgs;

    private void dispatchCallback(String[] strArr) {
        this.callback.LIZ();
    }

    public SQLiteCustomFunction(String str, int i, SQLiteDatabase.CustomFunction customFunction) {
        if (str != null) {
            this.name = str;
            this.numArgs = i;
            this.callback = customFunction;
            return;
        }
        throw new IllegalArgumentException("name must not be null.");
    }
}
