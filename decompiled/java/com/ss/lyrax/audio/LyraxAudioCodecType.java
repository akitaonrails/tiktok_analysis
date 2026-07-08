package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxAudioCodecType {
    PCM(0),
    OPUS(1),
    AAC(2);

    public final int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxAudioCodecType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxAudioCodecType;

        static {
            int[] iArr = new int[LyraxAudioCodecType.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxAudioCodecType = iArr;
            try {
                iArr[LyraxAudioCodecType.PCM.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioCodecType[LyraxAudioCodecType.OPUS.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioCodecType[LyraxAudioCodecType.AAC.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxAudioCodecType[ordinal()];
        return i != 2 ? i != 3 ? "PCM" : "AAC" : "OPUS";
    }

    public int value() {
        return this.value;
    }

    public static LyraxAudioCodecType fromId(int i) {
        for (LyraxAudioCodecType lyraxAudioCodecType : values()) {
            if (lyraxAudioCodecType.value() == i) {
                return lyraxAudioCodecType;
            }
        }
        return PCM;
    }

    public static LyraxAudioCodecType valueOf(String str) {
        return (LyraxAudioCodecType) C08FF.LIZ(LyraxAudioCodecType.class, str);
    }

    LyraxAudioCodecType(int i) {
        this.value = i;
    }
}
