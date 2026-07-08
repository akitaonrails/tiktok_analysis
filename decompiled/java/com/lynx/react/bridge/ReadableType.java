package com.lynx.react.bridge;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
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
    PiperData,
    LynxObject,
    ByteBuffer,
    TemplateData;

    public static ReadableType valueOf(String str) {
        return (ReadableType) C08FF.LIZ(ReadableType.class, str);
    }
}
