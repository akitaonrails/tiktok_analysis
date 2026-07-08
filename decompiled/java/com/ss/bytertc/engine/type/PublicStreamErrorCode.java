package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum PublicStreamErrorCode {
    ERROR_CODE_SUCCESS(0),
    ERROR_CODE_PUSH_PARAM_ERROR(1191),
    ERROR_CODE_PUSH_STATE_ERROR(1192),
    ERROR_CODE_PUSH_INTERNAL_ERROR(1193),
    ERROR_CODE_PUSH_ERROR(1195),
    ERROR_CODE_PUSH_TIMEOUT(1196),
    ERROR_CODE_PULL_NO_PUSH_STREAM(1300);

    public final int value;

    public int value() {
        return this.value;
    }

    public static PublicStreamErrorCode fromId(int i) {
        for (PublicStreamErrorCode publicStreamErrorCode : values()) {
            if (publicStreamErrorCode.value() == i) {
                return publicStreamErrorCode;
            }
        }
        return ERROR_CODE_SUCCESS;
    }

    public static PublicStreamErrorCode valueOf(String str) {
        return (PublicStreamErrorCode) C08FF.LIZ(PublicStreamErrorCode.class, str);
    }

    PublicStreamErrorCode(int i) {
        this.value = i;
    }
}
