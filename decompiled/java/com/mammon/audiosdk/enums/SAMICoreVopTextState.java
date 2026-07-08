package com.mammon.audiosdk.enums;

import X.C08FF;

/* JADX INFO: loaded from: classes28.dex */
public enum SAMICoreVopTextState {
    AVAILABLE(0),
    SUCCESS_END(1),
    FAILED_END(2);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static SAMICoreVopTextState valueOf(String str) {
        return (SAMICoreVopTextState) C08FF.LIZ(SAMICoreVopTextState.class, str);
    }

    SAMICoreVopTextState(int i) {
        this.value = i;
    }
}
