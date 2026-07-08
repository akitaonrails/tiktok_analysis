package com.mammon.audiosdk.enums;

import X.C08FF;

/* JADX INFO: loaded from: classes17.dex */
public enum SAMICoreVopTextType {
    PRIMARY(50),
    STANDARD(80);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static SAMICoreVopTextType valueOf(String str) {
        return (SAMICoreVopTextType) C08FF.LIZ(SAMICoreVopTextType.class, str);
    }

    SAMICoreVopTextType(int i) {
        this.value = i;
    }
}
