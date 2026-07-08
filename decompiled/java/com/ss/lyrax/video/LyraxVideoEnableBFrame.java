package com.ss.lyrax.video;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxVideoEnableBFrame {
    AUTO(0),
    ENABLE(1),
    DISABLE(2);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.video.LyraxVideoEnableBFrame$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$video$LyraxVideoEnableBFrame;

        static {
            int[] iArr = new int[LyraxVideoEnableBFrame.values().length];
            $SwitchMap$com$ss$lyrax$video$LyraxVideoEnableBFrame = iArr;
            try {
                iArr[LyraxVideoEnableBFrame.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoEnableBFrame[LyraxVideoEnableBFrame.ENABLE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoEnableBFrame[LyraxVideoEnableBFrame.DISABLE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$video$LyraxVideoEnableBFrame[ordinal()];
        return i != 2 ? i != 3 ? "kAuto" : "kDisable" : "kEnable";
    }

    public int value() {
        return this.value;
    }

    public static LyraxVideoEnableBFrame fromId(int i) {
        for (LyraxVideoEnableBFrame lyraxVideoEnableBFrame : values()) {
            if (lyraxVideoEnableBFrame.value() == i) {
                return lyraxVideoEnableBFrame;
            }
        }
        return AUTO;
    }

    public static LyraxVideoEnableBFrame valueOf(String str) {
        return (LyraxVideoEnableBFrame) C08FF.LIZ(LyraxVideoEnableBFrame.class, str);
    }

    LyraxVideoEnableBFrame(int i) {
        this.value = i;
    }
}
