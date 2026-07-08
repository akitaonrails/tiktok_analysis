package com.mammon.audiosdk.enums;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum SAMICoreVopRecordingType {
    PCM_S16(0),
    FILE(1),
    INTERNAL(2);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static SAMICoreVopRecordingType valueOf(String str) {
        return (SAMICoreVopRecordingType) C08FF.LIZ(SAMICoreVopRecordingType.class, str);
    }

    SAMICoreVopRecordingType(int i) {
        this.value = i;
    }
}
