package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum DataMessageSourceType {
    DATA_MESSAGE_SOURCE_TYPE_DEFAULT(0),
    DATA_MESSAGE_SOURCE_TYPE_SYSTEM(1);

    public int value;

    public int value() {
        return this.value;
    }

    public static DataMessageSourceType fromId(int i) {
        for (DataMessageSourceType dataMessageSourceType : values()) {
            if (dataMessageSourceType.value() == i) {
                return dataMessageSourceType;
            }
        }
        return null;
    }

    public static DataMessageSourceType valueOf(String str) {
        return (DataMessageSourceType) C08FF.LIZ(DataMessageSourceType.class, str);
    }

    DataMessageSourceType(int i) {
        this.value = i;
    }
}
