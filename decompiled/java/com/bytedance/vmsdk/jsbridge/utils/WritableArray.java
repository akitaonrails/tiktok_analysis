package com.bytedance.vmsdk.jsbridge.utils;

/* JADX INFO: loaded from: classes35.dex */
public interface WritableArray extends ReadableArray {
    void pushArray(WritableArray writableArray);

    void pushBoolean(boolean z);

    void pushByteArray(byte[] bArr);

    void pushByteArrayAsString(byte[] bArr);

    void pushDouble(double d);

    void pushInt(int i);

    void pushLong(long j);

    void pushMap(WritableMap writableMap);

    void pushNull();

    void pushString(String str);

    void putNativeHostObject(NativeHostObject nativeHostObject);
}
