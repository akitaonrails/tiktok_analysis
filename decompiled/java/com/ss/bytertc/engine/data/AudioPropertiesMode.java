package com.ss.bytertc.engine.data;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum AudioPropertiesMode {
    AUDIO_PROPERTIES_MODE_MICROPHONE(0),
    AUDIO_PROPERTIES_MODE_AUDIOMIXING(1);

    public int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioPropertiesMode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioPropertiesMode;

        static {
            int[] iArr = new int[AudioPropertiesMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioPropertiesMode = iArr;
            try {
                iArr[AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioPropertiesMode[AudioPropertiesMode.AUDIO_PROPERTIES_MODE_AUDIOMIXING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioPropertiesMode[ordinal()];
        return (i == 1 || i != 2) ? "AUDIO_PROPERTIES_MODE_MICROPHONE" : "AUDIO_PROPERTIES_MODE_AUDIOMIXING";
    }

    public int value() {
        return this.value;
    }

    public static AudioPropertiesMode fromId(int i) {
        for (AudioPropertiesMode audioPropertiesMode : values()) {
            if (audioPropertiesMode.value() == i) {
                return audioPropertiesMode;
            }
        }
        return null;
    }

    public static AudioPropertiesMode valueOf(String str) {
        return (AudioPropertiesMode) C08FF.LIZ(AudioPropertiesMode.class, str);
    }

    AudioPropertiesMode(int i) {
        this.value = i;
    }
}
