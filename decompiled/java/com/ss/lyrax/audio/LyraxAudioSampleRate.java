package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes36.dex */
public enum LyraxAudioSampleRate {
    AUDIO_SAMPLE_RATE_AUTO(-1),
    AUDIO_SAMPLE_RATE_8000(8000),
    AUDIO_SAMPLE_RATE_11025(11025),
    AUDIO_SAMPLE_RATE_16000(16000),
    AUDIO_SAMPLE_RATE_22050(22050),
    AUDIO_SAMPLE_RATE_32000(32000),
    AUDIO_SAMPLE_RATE_44100(44100),
    AUDIO_SAMPLE_RATE_48000(48000);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxAudioSampleRate$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxAudioSampleRate;

        static {
            int[] iArr = new int[LyraxAudioSampleRate.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxAudioSampleRate = iArr;
            try {
                iArr[LyraxAudioSampleRate.AUDIO_SAMPLE_RATE_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioSampleRate[LyraxAudioSampleRate.AUDIO_SAMPLE_RATE_8000.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioSampleRate[LyraxAudioSampleRate.AUDIO_SAMPLE_RATE_11025.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioSampleRate[LyraxAudioSampleRate.AUDIO_SAMPLE_RATE_16000.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioSampleRate[LyraxAudioSampleRate.AUDIO_SAMPLE_RATE_22050.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioSampleRate[LyraxAudioSampleRate.AUDIO_SAMPLE_RATE_32000.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioSampleRate[LyraxAudioSampleRate.AUDIO_SAMPLE_RATE_44100.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioSampleRate[LyraxAudioSampleRate.AUDIO_SAMPLE_RATE_48000.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxAudioSampleRate[ordinal()]) {
            case 2:
                return "AUDIO_SAMPLE_RATE_8000";
            case 3:
                return "AUDIO_SAMPLE_RATE_11025";
            case 4:
                return "AUDIO_SAMPLE_RATE_16000";
            case 5:
                return "AUDIO_SAMPLE_RATE_22050";
            case 6:
                return "AUDIO_SAMPLE_RATE_32000";
            case 7:
                return "AUDIO_SAMPLE_RATE_44100";
            case 8:
                return "AUDIO_SAMPLE_RATE_48000";
            default:
                return "AUDIO_SAMPLE_RATE_AUTO";
        }
    }

    public int value() {
        return this.value;
    }

    public static LyraxAudioSampleRate fromId(int i) {
        for (LyraxAudioSampleRate lyraxAudioSampleRate : values()) {
            if (lyraxAudioSampleRate.value() == i) {
                return lyraxAudioSampleRate;
            }
        }
        return AUDIO_SAMPLE_RATE_AUTO;
    }

    public static LyraxAudioSampleRate valueOf(String str) {
        return (LyraxAudioSampleRate) C08FF.LIZ(LyraxAudioSampleRate.class, str);
    }

    LyraxAudioSampleRate(int i) {
        this.value = i;
    }
}
