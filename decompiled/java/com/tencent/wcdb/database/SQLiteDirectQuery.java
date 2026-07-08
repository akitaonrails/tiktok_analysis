package com.tencent.wcdb.database;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes15.dex */
public class SQLiteDirectQuery extends h {
    public static native byte[] nativeGetBlob(long j, int i);

    public static native double nativeGetDouble(long j, int i);

    public static native long nativeGetLong(long j, int i);

    public static native String nativeGetString(long j, int i);

    public static native int nativeGetType(long j, int i);

    public static native int nativeStep(long j, int i);

    @Override // com.tencent.wcdb.database.h, com.tencent.wcdb.database.a
    public final void LIZIZ() {
        synchronized (this) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        super.LIZIZ();
    }
}
