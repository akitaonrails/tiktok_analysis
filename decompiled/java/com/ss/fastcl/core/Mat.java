package com.ss.fastcl.core;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class Mat {
    public static native int nativeCols(long j);

    public static native long nativeNewMat(int i, int i2, int i3, ByteBuffer byteBuffer);

    public static native void nativeRelease(long j);

    public static native int nativeRows(long j);

    public static native long nativeTotals(long j);
}
