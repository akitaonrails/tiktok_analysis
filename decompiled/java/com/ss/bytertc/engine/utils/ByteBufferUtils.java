package com.ss.bytertc.engine.utils;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class ByteBufferUtils {
    public static native ByteBuffer nativeAllocateBuffer(int i);

    public static native int nativeRGBAToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6);

    public static native void nativeReleaseBuffer(ByteBuffer byteBuffer);
}
