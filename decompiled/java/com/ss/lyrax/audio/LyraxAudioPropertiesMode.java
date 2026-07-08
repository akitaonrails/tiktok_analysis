package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxAudioPropertiesMode {
    MICROPHONE(0),
    AUDIO_MIXING(1);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxAudioPropertiesMode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxAudioPropertiesMode;

        static {
            int[] iArr = new int[LyraxAudioPropertiesMode.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxAudioPropertiesMode = iArr;
            try {
                iArr[LyraxAudioPropertiesMode.MICROPHONE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioPropertiesMode[LyraxAudioPropertiesMode.AUDIO_MIXING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxAudioPropertiesMode[ordinal()];
        return (i == 1 || i != 2) ? "MICROPHONE" : "AUDIO_MIXING";
    }

    public int value() {
        return this.value;
    }

    public static LyraxAudioPropertiesMode fromId(int i) {
        for (LyraxAudioPropertiesMode lyraxAudioPropertiesMode : values()) {
            if (lyraxAudioPropertiesMode.value() == i) {
                return lyraxAudioPropertiesMode;
            }
        }
        return MICROPHONE;
    }

    public static LyraxAudioPropertiesMode valueOf(String str) {
        return (LyraxAudioPropertiesMode) C08FF.LIZ(LyraxAudioPropertiesMode.class, str);
    }

    LyraxAudioPropertiesMode(int i) {
        this.value = i;
    }
}
