package com.mammon.audiosdk.enums;

import X.C08FF;

/* JADX INFO: loaded from: classes28.dex */
public enum SAMICoreVopAudioCheckerResult {
    INTERNAL_ERROR(0),
    NETWORK_ERROR(1),
    PASSED(2),
    SNR_FAILED(3),
    WER_FAILED(4);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static SAMICoreVopAudioCheckerResult valueOf(String str) {
        return (SAMICoreVopAudioCheckerResult) C08FF.LIZ(SAMICoreVopAudioCheckerResult.class, str);
    }

    SAMICoreVopAudioCheckerResult(int i) {
        this.value = i;
    }
}
