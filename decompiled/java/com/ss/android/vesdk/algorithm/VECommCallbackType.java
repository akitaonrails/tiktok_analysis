package com.ss.android.vesdk.algorithm;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum VECommCallbackType {
    CALLBACK_TYPE_NONE,
    CALLBACK_TYPE_PROGRESS,
    CALLBACK_TYPE_ERROR,
    CALLBACK_TYPE_RESULT_PER_FRAME,
    CALLBACK_TYPE_RESULT_LAST,
    CALLBACK_TYPE_FINISH,
    CALLBACK_TYPE_RETRY_SW_COMPILE;

    public static VECommCallbackType valueOf(String str) {
        return (VECommCallbackType) C08FF.LIZ(VECommCallbackType.class, str);
    }
}
