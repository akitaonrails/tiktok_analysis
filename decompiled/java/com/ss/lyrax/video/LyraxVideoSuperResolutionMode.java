package com.ss.lyrax.video;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxVideoSuperResolutionMode {
    OFF(0),
    ON(1);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.video.LyraxVideoSuperResolutionMode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$video$LyraxVideoSuperResolutionMode;

        static {
            int[] iArr = new int[LyraxVideoSuperResolutionMode.values().length];
            $SwitchMap$com$ss$lyrax$video$LyraxVideoSuperResolutionMode = iArr;
            try {
                iArr[LyraxVideoSuperResolutionMode.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoSuperResolutionMode[LyraxVideoSuperResolutionMode.ON.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return AnonymousClass1.$SwitchMap$com$ss$lyrax$video$LyraxVideoSuperResolutionMode[ordinal()] != 2 ? "kOff" : "kOn";
    }

    public int value() {
        return this.value;
    }

    public static LyraxVideoSuperResolutionMode fromId(int i) {
        if (i != 0) {
            if (i != 1) {
                return OFF;
            }
            return ON;
        }
        return OFF;
    }

    public static LyraxVideoSuperResolutionMode valueOf(String str) {
        return (LyraxVideoSuperResolutionMode) C08FF.LIZ(LyraxVideoSuperResolutionMode.class, str);
    }

    LyraxVideoSuperResolutionMode(int i) {
        this.value = i;
    }
}
