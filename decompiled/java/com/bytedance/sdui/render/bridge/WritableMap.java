package com.bytedance.sdui.render.bridge;

/* JADX INFO: loaded from: classes21.dex */
public interface WritableMap extends ReadableMap {
    void merge(ReadableMap readableMap);

    void putArray(String str, WritableArray writableArray);

    void putBoolean(String str, boolean z);

    void putByteArray(String str, byte[] bArr);

    void putByteArrayAsString(byte[] bArr, byte[] bArr2);

    void putDouble(String str, double d);

    void putInt(String str, int i);

    void putLong(String str, long j);

    void putMap(String str, WritableMap writableMap);

    void putNull(String str);

    void putString(String str, String str2);
}
