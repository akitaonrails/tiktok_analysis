package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum RecordingType {
    RECORD_AUDIO_ONLY(0),
    RECORD_VIDEO_ONLY(1),
    RECORD_VIDEO_AND_AUDIO(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static RecordingType fromId(int i) {
        for (RecordingType recordingType : values()) {
            if (recordingType.value() == i) {
                return recordingType;
            }
        }
        return null;
    }

    public static RecordingType valueOf(String str) {
        return (RecordingType) C08FF.LIZ(RecordingType.class, str);
    }

    RecordingType(int i) {
        this.value = i;
    }
}
