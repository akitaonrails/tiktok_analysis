package com.bytedance.vmsdk.jsbridge.utils;

import X.C08FF;

/* JADX INFO: loaded from: classes35.dex */
public enum ReadableType {
    Null,
    Boolean,
    Int,
    Number,
    String,
    Map,
    Array,
    Long,
    ByteArray,
    NativeHostObject;

    public static ReadableType valueOf(String str) {
        return (ReadableType) C08FF.LIZ(ReadableType.class, str);
    }
}
