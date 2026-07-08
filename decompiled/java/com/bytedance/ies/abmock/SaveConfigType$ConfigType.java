package com.bytedance.ies.abmock;

import X.C08FF;

/* JADX INFO: loaded from: classes5.dex */
public enum SaveConfigType$ConfigType {
    BOOLEAN,
    INT,
    LONG,
    DOUBLE,
    FLOAT,
    STRING,
    STRING_ARRAY,
    OBJECT;

    public static SaveConfigType$ConfigType valueOf(String str) {
        return (SaveConfigType$ConfigType) C08FF.LIZ(SaveConfigType$ConfigType.class, str);
    }
}
