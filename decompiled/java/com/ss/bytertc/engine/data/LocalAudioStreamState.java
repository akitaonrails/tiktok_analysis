package com.ss.bytertc.engine.data;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes36.dex */
public enum LocalAudioStreamState {
    LOCAL_AUDIO_STREAM_STATE_STOPPED(0),
    LOCAL_AUDIO_STREAM_STATE_RECORDING(1),
    LOCAL_AUDIO_STREAM_STATE_ENCODING(2),
    LOCAL_AUDIO_STREAM_STATE_FAILED(3);

    public int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.LocalAudioStreamState$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamState;

        static {
            int[] iArr = new int[LocalAudioStreamState.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamState = iArr;
            try {
                iArr[LocalAudioStreamState.LOCAL_AUDIO_STREAM_STATE_STOPPED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamState[LocalAudioStreamState.LOCAL_AUDIO_STREAM_STATE_RECORDING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamState[LocalAudioStreamState.LOCAL_AUDIO_STREAM_STATE_ENCODING.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamState[LocalAudioStreamState.LOCAL_AUDIO_STREAM_STATE_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamState[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "kLocalAudioStreamStateFailed" : "kLocalAudioStreamStateEncoding" : "kLocalAudioStreamStateRecording" : "kLocalAudioStreamStateStopped";
    }

    public int value() {
        return this.value;
    }

    public static LocalAudioStreamState fromId(int i) {
        for (LocalAudioStreamState localAudioStreamState : values()) {
            if (localAudioStreamState.value() == i) {
                return localAudioStreamState;
            }
        }
        return null;
    }

    public static LocalAudioStreamState valueOf(String str) {
        return (LocalAudioStreamState) C08FF.LIZ(LocalAudioStreamState.class, str);
    }

    LocalAudioStreamState(int i) {
        this.value = i;
    }
}
