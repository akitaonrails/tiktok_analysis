package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes4.dex */
public enum RemoteVideoState {
    REMOTE_VIDEO_STATE_STOPPED(0),
    REMOTE_VIDEO_STATE_STARTING(1),
    REMOTE_VIDEO_STATE_DECODING(2),
    REMOTE_VIDEO_STATE_FROZEN(3),
    REMOTE_VIDEO_STATE_FAILED(4);

    public int value;

    public int value() {
        return this.value;
    }

    public static RemoteVideoState fromId(int i) {
        for (RemoteVideoState remoteVideoState : values()) {
            if (remoteVideoState.value() == i) {
                return remoteVideoState;
            }
        }
        return null;
    }

    public static RemoteVideoState valueOf(String str) {
        return (RemoteVideoState) C08FF.LIZ(RemoteVideoState.class, str);
    }

    RemoteVideoState(int i) {
        this.value = i;
    }
}
