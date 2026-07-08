package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum RecordingState {
    RECORDING_STATE_ERROE(0),
    RECORDING_STATE_PROCESSING(1),
    RECORDING_STATE_SUCCESS(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static RecordingState fromId(int i) {
        for (RecordingState recordingState : values()) {
            if (recordingState.value() == i) {
                return recordingState;
            }
        }
        return RECORDING_STATE_ERROE;
    }

    public static RecordingState valueOf(String str) {
        return (RecordingState) C08FF.LIZ(RecordingState.class, str);
    }

    RecordingState(int i) {
        this.value = i;
    }
}
