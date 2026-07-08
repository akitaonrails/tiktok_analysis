package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum RecordingErrorCode {
    RECORDING_ERROR_CODE_OK(0),
    RECORDING_ERROR_CODE_NO_PERMISSION(-1),
    RECORDING_ERROR_CODE_NOT_SUPPORT(-2),
    RECORDING_ERROR_CODE_NO_OTHER(-3);

    public int value;

    public int value() {
        return this.value;
    }

    public static RecordingErrorCode fromId(int i) {
        for (RecordingErrorCode recordingErrorCode : values()) {
            if (recordingErrorCode.value() == i) {
                return recordingErrorCode;
            }
        }
        return RECORDING_ERROR_CODE_OK;
    }

    public static RecordingErrorCode valueOf(String str) {
        return (RecordingErrorCode) C08FF.LIZ(RecordingErrorCode.class, str);
    }

    RecordingErrorCode(int i) {
        this.value = i;
    }
}
