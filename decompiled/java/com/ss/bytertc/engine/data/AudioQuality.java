package com.ss.bytertc.engine.data;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes36.dex */
public enum AudioQuality {
    AUDIO_QUALITY_LOW(0),
    AUDIO_QUALITY_MEDIUM(1),
    AUDIO_QUALITY_HIGH(2),
    AUDIO_QUALITY_ULTRA_HIGH(3);

    public int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioQuality$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioQuality;

        static {
            int[] iArr = new int[AudioQuality.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioQuality = iArr;
            try {
                iArr[AudioQuality.AUDIO_QUALITY_LOW.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioQuality[AudioQuality.AUDIO_QUALITY_MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioQuality[AudioQuality.AUDIO_QUALITY_HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioQuality[AudioQuality.AUDIO_QUALITY_ULTRA_HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioQuality[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "kAudioQualityUltraHigh" : "kAudioQualityHigh" : "kAudioQualityMedium" : "kAudioQualityLow";
    }

    public int value() {
        return this.value;
    }

    public static AudioQuality fromId(int i) {
        for (AudioQuality audioQuality : values()) {
            if (audioQuality.value() == i) {
                return audioQuality;
            }
        }
        return null;
    }

    public static AudioQuality valueOf(String str) {
        return (AudioQuality) C08FF.LIZ(AudioQuality.class, str);
    }

    AudioQuality(int i) {
        this.value = i;
    }
}
