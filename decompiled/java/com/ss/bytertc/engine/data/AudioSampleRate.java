package com.ss.bytertc.engine.data;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes36.dex */
public enum AudioSampleRate {
    AUDIO_SAMPLE_RATE_AUTO(-1),
    AUDIO_SAMPLE_RATE_8000(8000),
    AUDIO_SAMPLE_RATE_16000(16000),
    AUDIO_SAMPLE_RATE_32000(32000),
    AUDIO_SAMPLE_RATE_44100(44100),
    AUDIO_SAMPLE_RATE_48000(48000);

    public int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioSampleRate$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate;

        static {
            int[] iArr = new int[AudioSampleRate.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate = iArr;
            try {
                iArr[AudioSampleRate.AUDIO_SAMPLE_RATE_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate[AudioSampleRate.AUDIO_SAMPLE_RATE_8000.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate[AudioSampleRate.AUDIO_SAMPLE_RATE_16000.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate[AudioSampleRate.AUDIO_SAMPLE_RATE_32000.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate[AudioSampleRate.AUDIO_SAMPLE_RATE_44100.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate[AudioSampleRate.AUDIO_SAMPLE_RATE_48000.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate[ordinal()]) {
            case 1:
                return "kAudioSampleRateAuto";
            case 2:
                return "kAudioSampleRate8000";
            case 3:
                return "kAudioSampleRate16000";
            case 4:
                return "kAudioSampleRate32000";
            case 5:
                return "kAudioSampleRate44100";
            case 6:
                return "kAudioSampleRate48000";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }

    public static AudioSampleRate fromId(int i) {
        for (AudioSampleRate audioSampleRate : values()) {
            if (audioSampleRate.value() == i) {
                return audioSampleRate;
            }
        }
        return null;
    }

    public static AudioSampleRate valueOf(String str) {
        return (AudioSampleRate) C08FF.LIZ(AudioSampleRate.class, str);
    }

    AudioSampleRate(int i) {
        this.value = i;
    }
}
