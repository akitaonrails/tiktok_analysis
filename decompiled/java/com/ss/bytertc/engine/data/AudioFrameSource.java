package com.ss.bytertc.engine.data;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes36.dex */
public enum AudioFrameSource {
    AUDIO_FRAME_SOURCE_MIC(0),
    AUDIO_FRAME_SOURCE_PLAYBACK(1),
    AUDIO_FRAME_SOURCE_MIXED(2);

    public int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioFrameSource$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioFrameSource;

        static {
            int[] iArr = new int[AudioFrameSource.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioFrameSource = iArr;
            try {
                iArr[AudioFrameSource.AUDIO_FRAME_SOURCE_MIC.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioFrameSource[AudioFrameSource.AUDIO_FRAME_SOURCE_PLAYBACK.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioFrameSource[AudioFrameSource.AUDIO_FRAME_SOURCE_MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioFrameSource[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "" : "kAudioFrameSourceMixed" : "kAudioFrameSourcePlayback" : "kAudioFrameSourceMic";
    }

    public int value() {
        return this.value;
    }

    public static AudioFrameSource fromId(int i) {
        for (AudioFrameSource audioFrameSource : values()) {
            if (audioFrameSource.value() == i) {
                return audioFrameSource;
            }
        }
        return null;
    }

    public static AudioFrameSource valueOf(String str) {
        return (AudioFrameSource) C08FF.LIZ(AudioFrameSource.class, str);
    }

    AudioFrameSource(int i) {
        this.value = i;
    }
}
