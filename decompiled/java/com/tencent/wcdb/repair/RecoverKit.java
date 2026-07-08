package com.tencent.wcdb.repair;

/* JADX INFO: loaded from: classes4.dex */
public class RecoverKit {
    public static native void nativeCancel(long j);

    public static native int nativeFailureCount(long j);

    public static native void nativeFinish(long j);

    public static native long nativeInit(String str, byte[] bArr);

    public static native String nativeLastError(long j);

    public static native int nativeRun(long j, long j2, boolean z);

    public static native int nativeSuccessCount(long j);

    public final void finalize() throws Throwable {
        super.finalize();
    }
}
