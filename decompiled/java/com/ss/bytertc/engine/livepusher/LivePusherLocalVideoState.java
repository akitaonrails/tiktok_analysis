package com.ss.bytertc.engine.livepusher;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LivePusherLocalVideoState {
    LIVE_PUSHER_LOCAL_VIDEO_STATE_BEGIN_ENCODE(0),
    LIVE_PUSHER_LOCAL_VIDEO_STATE_FIRST_FRAME_ENCODED(1),
    LIVE_PUSHER_LOCAL_VIDEO_STATE_BEGIN_SEND(2),
    LIVE_PUSHER_LOCAL_VIDEO_STATE_FIRST_FRAME_SENT(3);

    public final int value;

    public int value() {
        return this.value;
    }

    public static LivePusherLocalVideoState fromId(int i) {
        for (LivePusherLocalVideoState livePusherLocalVideoState : values()) {
            if (livePusherLocalVideoState.value() == i) {
                return livePusherLocalVideoState;
            }
        }
        return null;
    }

    public static LivePusherLocalVideoState valueOf(String str) {
        return (LivePusherLocalVideoState) C08FF.LIZ(LivePusherLocalVideoState.class, str);
    }

    LivePusherLocalVideoState(int i) {
        this.value = i;
    }
}
