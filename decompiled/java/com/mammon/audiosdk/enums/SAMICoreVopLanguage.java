package com.mammon.audiosdk.enums;

import X.C08FF;

/* JADX INFO: loaded from: classes19.dex */
public enum SAMICoreVopLanguage {
    JAPANESE(0),
    ENGLISH(1),
    CHINESE(2);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static SAMICoreVopLanguage valueOf(String str) {
        return (SAMICoreVopLanguage) C08FF.LIZ(SAMICoreVopLanguage.class, str);
    }

    SAMICoreVopLanguage(int i) {
        this.value = i;
    }
}
