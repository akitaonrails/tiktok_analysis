package com.ss.bytertc.engine.data;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes36.dex */
public enum RemoteAudioState {
    REMOTE_AUDIO_STATE_STOPPED(0),
    REMOTE_AUDIO_STATE_STARTING(1),
    REMOTE_AUDIO_STATE_DECODING(2),
    REMOTE_AUDIO_STATE_FROZEN(3),
    REMOTE_AUDIO_STATE_FAILED(4);

    public int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.RemoteAudioState$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState;

        static {
            int[] iArr = new int[RemoteAudioState.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState = iArr;
            try {
                iArr[RemoteAudioState.REMOTE_AUDIO_STATE_STOPPED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState[RemoteAudioState.REMOTE_AUDIO_STATE_STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState[RemoteAudioState.REMOTE_AUDIO_STATE_DECODING.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState[RemoteAudioState.REMOTE_AUDIO_STATE_FROZEN.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState[RemoteAudioState.REMOTE_AUDIO_STATE_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "kRemoteAudioStateFailed" : "kRemoteAudioStateFrozen" : "kRemoteAudioStateDecoding" : "kRemoteAudioStateStarting" : "kRemoteAudioStateStopped";
    }

    public int value() {
        return this.value;
    }

    public static RemoteAudioState fromId(int i) {
        for (RemoteAudioState remoteAudioState : values()) {
            if (remoteAudioState.value() == i) {
                return remoteAudioState;
            }
        }
        return null;
    }

    public static RemoteAudioState valueOf(String str) {
        return (RemoteAudioState) C08FF.LIZ(RemoteAudioState.class, str);
    }

    RemoteAudioState(int i) {
        this.value = i;
    }
}
