package com.bytedance.vmsdk.jsbridge.utils;

import X.C830490Whz;
import X.InterfaceC2204631BQf;
import java.util.HashMap;

/* JADX INFO: loaded from: classes35.dex */
public interface ReadableMap {
    ReadableArray getArray(String str);

    ReadableArray getArray(String str, ReadableArray readableArray);

    boolean getBoolean(String str);

    boolean getBoolean(String str, boolean z);

    byte[] getByteArray(String str);

    byte[] getByteArray(String str, byte[] bArr);

    double getDouble(String str);

    double getDouble(String str, double d);

    InterfaceC2204631BQf getDynamic(String str);

    int getInt(String str);

    int getInt(String str, int i);

    long getLong(String str);

    long getLong(String str, long j);

    ReadableMap getMap(String str);

    ReadableMap getMap(String str, ReadableMap readableMap);

    NativeHostObject getNativeHostObject(String str);

    String getString(String str);

    String getString(String str, String str2);

    ReadableType getType(String str);

    boolean hasKey(String str);

    boolean isNull(String str);

    ReadableMapKeySetIterator keySetIterator();

    int size();

    C830490Whz<String, Object> toArrayMap();

    HashMap<String, Object> toHashMap();
}
