package com.ss.bytertc.engine.livepusher;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LivePusherStatus {
    LIVE_PUSH_STATUS_UNKONW(0),
    LIVE_PUSH_STATUS_CONNECTING(1),
    LIVE_PUSH_STATUS_SUCCESS(2),
    LIVE_PUSH_STATUS_RECONNECTING(3),
    LIVE_PUSH_STATUS_STOP(4),
    LIVE_PUSH_STATUS_ERROR(5),
    LIVE_PUSH_STATUS_DISCONNECTED(6);

    public final int value;

    public int value() {
        return this.value;
    }

    public static LivePusherStatus fromId(int i) {
        for (LivePusherStatus livePusherStatus : values()) {
            if (livePusherStatus.value() == i) {
                return livePusherStatus;
            }
        }
        return null;
    }

    public static LivePusherStatus valueOf(String str) {
        return (LivePusherStatus) C08FF.LIZ(LivePusherStatus.class, str);
    }

    LivePusherStatus(int i) {
        this.value = i;
    }
}
