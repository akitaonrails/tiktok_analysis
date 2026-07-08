package com.ss.lyrax.video;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxVideoPerformanceAlarmMode {
    NORMAL(0),
    SIMULCAST(1);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.video.LyraxVideoPerformanceAlarmMode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$video$LyraxVideoPerformanceAlarmMode;

        static {
            int[] iArr = new int[LyraxVideoPerformanceAlarmMode.values().length];
            $SwitchMap$com$ss$lyrax$video$LyraxVideoPerformanceAlarmMode = iArr;
            try {
                iArr[LyraxVideoPerformanceAlarmMode.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoPerformanceAlarmMode[LyraxVideoPerformanceAlarmMode.SIMULCAST.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return AnonymousClass1.$SwitchMap$com$ss$lyrax$video$LyraxVideoPerformanceAlarmMode[ordinal()] != 2 ? "kNormal" : "kSimulcast";
    }

    public int value() {
        return this.value;
    }

    public static LyraxVideoPerformanceAlarmMode fromId(int i) {
        for (LyraxVideoPerformanceAlarmMode lyraxVideoPerformanceAlarmMode : values()) {
            if (lyraxVideoPerformanceAlarmMode.value() == i) {
                return lyraxVideoPerformanceAlarmMode;
            }
        }
        return NORMAL;
    }

    public static LyraxVideoPerformanceAlarmMode valueOf(String str) {
        return (LyraxVideoPerformanceAlarmMode) C08FF.LIZ(LyraxVideoPerformanceAlarmMode.class, str);
    }

    LyraxVideoPerformanceAlarmMode(int i) {
        this.value = i;
    }
}
