package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum LocalVideoStreamState {
    LOCAL_VIDEO_STREAM_STATE_STOPPED(0),
    LOCAL_VIDEO_STREAM_STATE_RECORDING(1),
    LOCAL_VIDEO_STREAM_STATE_ENCODING(2),
    LOCAL_VIDEO_STREAM_STATE_FAILED(3);

    public int value;

    public int value() {
        return this.value;
    }

    public static LocalVideoStreamState fromId(int i) {
        for (LocalVideoStreamState localVideoStreamState : values()) {
            if (localVideoStreamState.value() == i) {
                return localVideoStreamState;
            }
        }
        return null;
    }

    public static LocalVideoStreamState valueOf(String str) {
        return (LocalVideoStreamState) C08FF.LIZ(LocalVideoStreamState.class, str);
    }

    LocalVideoStreamState(int i) {
        this.value = i;
    }
}
