package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum RemoteVideoStateChangeReason {
    REMOTE_VIDEO_STATE_CHANGE_REASON_INTERNAL(0),
    REMOTE_VIDEO_STATE_CHANGE_REASON_NETWORK_CONGESTION(1),
    REMOTE_VIDEO_STATE_CHANGE_REASON_NETWORK_RECOVERY(2),
    REMOTE_VIDEO_STATE_CHANGE_REASON_LOCAL_MUTED(3),
    REMOTE_VIDEO_STATE_CHANGE_REASON_LOCAL_UNMUTED(4),
    REMOTE_VIDEO_STATE_CHANGE_REASON_REMOTE_MUTED(5),
    REMOTE_VIDEO_STATE_CHANGE_REASON_REMOTE_UNMUTED(6),
    REMOTE_VIDEO_STATE_CHANGE_REASON_REMOTE_OFFLINE(7);

    public int value;

    public int value() {
        return this.value;
    }

    public static RemoteVideoStateChangeReason fromId(int i) {
        for (RemoteVideoStateChangeReason remoteVideoStateChangeReason : values()) {
            if (remoteVideoStateChangeReason.value() == i) {
                return remoteVideoStateChangeReason;
            }
        }
        return null;
    }

    public static RemoteVideoStateChangeReason valueOf(String str) {
        return (RemoteVideoStateChangeReason) C08FF.LIZ(RemoteVideoStateChangeReason.class, str);
    }

    RemoteVideoStateChangeReason(int i) {
        this.value = i;
    }
}
