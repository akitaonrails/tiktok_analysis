package com.ss.android.ttve.nativePort;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum TEAudioStreamVCStatus {
    TEAudioStreamVC_onStart(0),
    TEAudioStreamVC_onProcessing(1),
    TEAudioStreamVC_onFinished(2),
    TEAudioStreamVC_onFailed(3),
    TEAudioStreamVC_onConnectClosed(4),
    TEAudioStreamVC_onConnectFailed(5);

    public final int value;

    public int getValue() {
        return this.value;
    }

    public static TEAudioStreamVCStatus valueOf(String str) {
        return (TEAudioStreamVCStatus) C08FF.LIZ(TEAudioStreamVCStatus.class, str);
    }

    TEAudioStreamVCStatus(int i) {
        this.value = i;
    }
}
