package com.tencent.wcdb.database;

/* JADX INFO: loaded from: classes15.dex */
public class SQLiteCipherSpec {
    public String cipher;
    public boolean hmacEnabled;
    public int kdfIteration;
    public int pageSize;

    public SQLiteCipherSpec() {
        this.hmacEnabled = true;
        this.pageSize = SQLiteGlobal.LIZ;
    }

    public SQLiteCipherSpec(SQLiteCipherSpec sQLiteCipherSpec) {
        this.hmacEnabled = true;
        this.pageSize = SQLiteGlobal.LIZ;
        this.cipher = sQLiteCipherSpec.cipher;
        this.kdfIteration = sQLiteCipherSpec.kdfIteration;
        this.hmacEnabled = sQLiteCipherSpec.hmacEnabled;
        this.pageSize = sQLiteCipherSpec.pageSize;
    }
}
