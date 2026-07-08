package com.ss.lyrax.video;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxVideoEncoderPreference {
    DISABLED(0),
    MAINTAIN_FRAMERATE(1),
    MAINTAIN_QUALITY(2),
    BALANCE(3);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.video.LyraxVideoEncoderPreference$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$video$LyraxVideoEncoderPreference;

        static {
            int[] iArr = new int[LyraxVideoEncoderPreference.values().length];
            $SwitchMap$com$ss$lyrax$video$LyraxVideoEncoderPreference = iArr;
            try {
                iArr[LyraxVideoEncoderPreference.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoEncoderPreference[LyraxVideoEncoderPreference.MAINTAIN_FRAMERATE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoEncoderPreference[LyraxVideoEncoderPreference.MAINTAIN_QUALITY.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoEncoderPreference[LyraxVideoEncoderPreference.BALANCE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$video$LyraxVideoEncoderPreference[ordinal()];
        return i != 2 ? i != 3 ? i != 4 ? "kDisable" : "kBalance" : "kMaintainQuality" : "kMaintainFramerate";
    }

    public int value() {
        return this.value;
    }

    public static LyraxVideoEncoderPreference fromId(int i) {
        for (LyraxVideoEncoderPreference lyraxVideoEncoderPreference : values()) {
            if (lyraxVideoEncoderPreference.value() == i) {
                return lyraxVideoEncoderPreference;
            }
        }
        return DISABLED;
    }

    public static LyraxVideoEncoderPreference valueOf(String str) {
        return (LyraxVideoEncoderPreference) C08FF.LIZ(LyraxVideoEncoderPreference.class, str);
    }

    LyraxVideoEncoderPreference(int i) {
        this.value = i;
    }
}
