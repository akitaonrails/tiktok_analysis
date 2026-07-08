package com.ss.lyrax.video;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxVideoCodecMode {
    AUTO(0),
    HARDWARE(1),
    SOFTWARE(2);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.video.LyraxVideoCodecMode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$video$LyraxVideoCodecMode;

        static {
            int[] iArr = new int[LyraxVideoCodecMode.values().length];
            $SwitchMap$com$ss$lyrax$video$LyraxVideoCodecMode = iArr;
            try {
                iArr[LyraxVideoCodecMode.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoCodecMode[LyraxVideoCodecMode.HARDWARE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoCodecMode[LyraxVideoCodecMode.SOFTWARE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$video$LyraxVideoCodecMode[ordinal()];
        return i != 2 ? i != 3 ? "kAuto" : "kSoftware" : "kHardware";
    }

    public int value() {
        return this.value;
    }

    public static LyraxVideoCodecMode fromId(int i) {
        for (LyraxVideoCodecMode lyraxVideoCodecMode : values()) {
            if (lyraxVideoCodecMode.value() == i) {
                return lyraxVideoCodecMode;
            }
        }
        return AUTO;
    }

    public static LyraxVideoCodecMode valueOf(String str) {
        return (LyraxVideoCodecMode) C08FF.LIZ(LyraxVideoCodecMode.class, str);
    }

    LyraxVideoCodecMode(int i) {
        this.value = i;
    }
}
