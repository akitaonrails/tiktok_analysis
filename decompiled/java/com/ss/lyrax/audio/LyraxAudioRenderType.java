package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxAudioRenderType {
    EXTERNAL(0),
    INTERNAL(1);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxAudioRenderType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxAudioRenderType;

        static {
            int[] iArr = new int[LyraxAudioRenderType.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxAudioRenderType = iArr;
            try {
                iArr[LyraxAudioRenderType.EXTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioRenderType[LyraxAudioRenderType.INTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxAudioRenderType[ordinal()] != 1 ? "INTERNAL" : "EXTERNAL";
    }

    public int value() {
        return this.value;
    }

    public static LyraxAudioRenderType fromId(int i) {
        for (LyraxAudioRenderType lyraxAudioRenderType : values()) {
            if (lyraxAudioRenderType.value() == i) {
                return lyraxAudioRenderType;
            }
        }
        return INTERNAL;
    }

    public static LyraxAudioRenderType valueOf(String str) {
        return (LyraxAudioRenderType) C08FF.LIZ(LyraxAudioRenderType.class, str);
    }

    LyraxAudioRenderType(int i) {
        this.value = i;
    }
}
