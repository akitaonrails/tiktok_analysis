package com.ss.lyrax.video;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxVideoEncoderMode {
    SINGLE(0),
    SIMULCAST(1);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.video.LyraxVideoEncoderMode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$video$LyraxVideoEncoderMode;

        static {
            int[] iArr = new int[LyraxVideoEncoderMode.values().length];
            $SwitchMap$com$ss$lyrax$video$LyraxVideoEncoderMode = iArr;
            try {
                iArr[LyraxVideoEncoderMode.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoEncoderMode[LyraxVideoEncoderMode.SIMULCAST.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return AnonymousClass1.$SwitchMap$com$ss$lyrax$video$LyraxVideoEncoderMode[ordinal()] != 1 ? "kSimulcast" : "kSingle";
    }

    public int value() {
        return this.value;
    }

    public static LyraxVideoEncoderMode fromId(int i) {
        for (LyraxVideoEncoderMode lyraxVideoEncoderMode : values()) {
            if (lyraxVideoEncoderMode.value() == i) {
                return lyraxVideoEncoderMode;
            }
        }
        return SINGLE;
    }

    public static LyraxVideoEncoderMode valueOf(String str) {
        return (LyraxVideoEncoderMode) C08FF.LIZ(LyraxVideoEncoderMode.class, str);
    }

    LyraxVideoEncoderMode(int i) {
        this.value = i;
    }
}
