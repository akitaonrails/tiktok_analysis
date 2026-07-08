package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum LocalVideoStreamError {
    LOCAL_VIDEO_STREAM_ERROR_OK(0),
    LOCAL_VIDEO_STREAM_ERROR_FAILURE(1),
    LOCAL_VIDEO_STREAM_ERROR_DEVICE_NO_PERMISSION(2),
    LOCAL_VIDEO_STREAM_ERROR_DEVICE_BUSY(3),
    LOCAL_VIDEO_STREAM_ERROR_DEVICE_NOT_FOUND(4),
    LOCAL_VIDEO_STREAM_ERROR_CAPTURE_FAILURE(5),
    LOCAL_VIDEO_STREAM_ERROR_ENCODE_FAILURE(6),
    LOCAL_VIDEO_STREAM_ERROR_DEVICE_DISCONNECTED(7);

    public int value;

    public int value() {
        return this.value;
    }

    public static LocalVideoStreamError fromId(int i) {
        for (LocalVideoStreamError localVideoStreamError : values()) {
            if (localVideoStreamError.value() == i) {
                return localVideoStreamError;
            }
        }
        return null;
    }

    public static LocalVideoStreamError valueOf(String str) {
        return (LocalVideoStreamError) C08FF.LIZ(LocalVideoStreamError.class, str);
    }

    LocalVideoStreamError(int i) {
        this.value = i;
    }
}
