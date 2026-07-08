package com.mammon.audiosdk.enums;

import X.C08FF;

/* JADX INFO: loaded from: classes30.dex */
public enum SAMICoreVopState {
    Error(0),
    UNINITIALIZED(1),
    AGREEING(2),
    RECORDING(3),
    UPLOADING(4),
    BUILDING(5),
    COMPLETED(6);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static SAMICoreVopState valueOf(String str) {
        return (SAMICoreVopState) C08FF.LIZ(SAMICoreVopState.class, str);
    }

    SAMICoreVopState(int i) {
        this.value = i;
    }
}
