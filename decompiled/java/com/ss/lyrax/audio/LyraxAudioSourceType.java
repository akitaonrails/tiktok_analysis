package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxAudioSourceType {
    EXTERNAL(0),
    INTERNAL(1);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxAudioSourceType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxAudioSourceType;

        static {
            int[] iArr = new int[LyraxAudioSourceType.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxAudioSourceType = iArr;
            try {
                iArr[LyraxAudioSourceType.EXTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioSourceType[LyraxAudioSourceType.INTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxAudioSourceType[ordinal()] != 1 ? "INTERNAL" : "EXTERNAL";
    }

    public int value() {
        return this.value;
    }

    public static LyraxAudioSourceType fromId(int i) {
        for (LyraxAudioSourceType lyraxAudioSourceType : values()) {
            if (lyraxAudioSourceType.value() == i) {
                return lyraxAudioSourceType;
            }
        }
        return INTERNAL;
    }

    public static LyraxAudioSourceType valueOf(String str) {
        return (LyraxAudioSourceType) C08FF.LIZ(LyraxAudioSourceType.class, str);
    }

    LyraxAudioSourceType(int i) {
        this.value = i;
    }
}
