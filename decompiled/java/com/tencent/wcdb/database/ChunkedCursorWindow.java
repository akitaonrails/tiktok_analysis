package com.tencent.wcdb.database;

/* JADX INFO: loaded from: classes15.dex */
public class ChunkedCursorWindow extends a {
    public static native void nativeClear(long j);

    public static native long nativeCreate(int i);

    public static native void nativeDispose(long j);

    public static native void nativeEndRow(long j, long j2);

    public static native byte[] nativeGetBlob(long j, int i);

    public static native double nativeGetDouble(long j, int i);

    public static native long nativeGetLong(long j, int i);

    public static native int nativeGetNumChunks(long j);

    public static native long nativeGetRow(long j, int i);

    public static native String nativeGetString(long j, int i);

    public static native int nativeGetType(long j, int i);

    public static native long nativeRemoveChunk(long j, int i);

    public static native boolean nativeSetNumColumns(long j, int i);

    @Override // com.tencent.wcdb.database.a
    public final void LIZIZ() {
    }

    public final void finalize() throws Throwable {
        super.finalize();
    }
}
