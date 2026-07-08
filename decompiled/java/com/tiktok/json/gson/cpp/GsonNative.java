package com.tiktok.json.gson.cpp;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class GsonNative {
    public static native long create(boolean z, int i);

    public static native ByteBuffer readBuffer(long j);

    public static native char[] readCharArray(long j);

    public static native String readString(long j);

    public static native void release(long j);

    public static native void writeCharArray(long j, char[] cArr, int i, int i2);

    public static native void writeInt(long j, int i);

    public static native void writeString(long j, String str, int i, int i2);
}
