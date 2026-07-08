package com.bytedance.sdui.render.bridge;

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
    ByteArray;

    public static ReadableType valueOf(String str) {
        return (ReadableType) C08FF.LIZ(ReadableType.class, str);
    }
}
