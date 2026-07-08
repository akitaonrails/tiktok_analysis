package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes4.dex */
public enum RecordingFileType {
    AAC(0),
    MP4(1);

    public int value;

    public int value() {
        return this.value;
    }

    public static RecordingFileType fromId(int i) {
        for (RecordingFileType recordingFileType : values()) {
            if (recordingFileType.value() == i) {
                return recordingFileType;
            }
        }
        return AAC;
    }

    public static RecordingFileType valueOf(String str) {
        return (RecordingFileType) C08FF.LIZ(RecordingFileType.class, str);
    }

    RecordingFileType(int i) {
        this.value = i;
    }
}
