package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxAudioMixingType {
    PLAYOUT(0),
    PUBLISH(1),
    PLAYOUT_AND_PUBLISH(2);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxAudioMixingType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxAudioMixingType;

        static {
            int[] iArr = new int[LyraxAudioMixingType.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxAudioMixingType = iArr;
            try {
                iArr[LyraxAudioMixingType.PLAYOUT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioMixingType[LyraxAudioMixingType.PUBLISH.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioMixingType[LyraxAudioMixingType.PLAYOUT_AND_PUBLISH.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxAudioMixingType[ordinal()];
        return i != 1 ? i != 2 ? i == 3 ? "PLAYOUT_AND_PUBLISH" : "PLAYOUT" : "PUBLISH" : "PLAYOUT";
    }

    public int value() {
        return this.value;
    }

    public static LyraxAudioMixingType fromId(int i) {
        for (LyraxAudioMixingType lyraxAudioMixingType : values()) {
            if (lyraxAudioMixingType.value() == i) {
                return lyraxAudioMixingType;
            }
        }
        return PLAYOUT;
    }

    public static LyraxAudioMixingType valueOf(String str) {
        return (LyraxAudioMixingType) C08FF.LIZ(LyraxAudioMixingType.class, str);
    }

    LyraxAudioMixingType(int i) {
        this.value = i;
    }
}
