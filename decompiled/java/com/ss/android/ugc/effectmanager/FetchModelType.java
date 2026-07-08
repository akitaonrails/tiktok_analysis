package com.ss.android.ugc.effectmanager;

import X.C08FF;

/* JADX INFO: loaded from: classes31.dex */
public enum FetchModelType {
    ORIGIN(0),
    ZIP(1);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static FetchModelType fromValue(int i) {
        for (FetchModelType fetchModelType : values()) {
            if (fetchModelType.value == i) {
                return fetchModelType;
            }
        }
        return ORIGIN;
    }

    public static FetchModelType valueOf(String str) {
        return (FetchModelType) C08FF.LIZ(FetchModelType.class, str);
    }

    FetchModelType(int i) {
        this.value = i;
    }
}
