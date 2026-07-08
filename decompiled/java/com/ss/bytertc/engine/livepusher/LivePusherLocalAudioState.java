package com.ss.bytertc.engine.livepusher;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LivePusherLocalAudioState {
    LIVE_PUSHER_LOCAL_AUDIO_STATE_BEGIN_ENCODE(0),
    LIVE_PUSHER_LOCAL_AUDIO_STATE_FIRST_FRAME_ENCODED(1),
    LIVE_PUSHER_LOCAL_AUDIO_STATE_BEGIN_SEND(2),
    LIVE_PUSHER_LOCAL_AUDIO_STATE_FIRST_FRAME_SENT(3);

    public final int value;

    public int value() {
        return this.value;
    }

    public static LivePusherLocalAudioState fromId(int i) {
        for (LivePusherLocalAudioState livePusherLocalAudioState : values()) {
            if (livePusherLocalAudioState.value() == i) {
                return livePusherLocalAudioState;
            }
        }
        return null;
    }

    public static LivePusherLocalAudioState valueOf(String str) {
        return (LivePusherLocalAudioState) C08FF.LIZ(LivePusherLocalAudioState.class, str);
    }

    LivePusherLocalAudioState(int i) {
        this.value = i;
    }
}
