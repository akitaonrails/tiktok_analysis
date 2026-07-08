package com.ss.lyrax.video;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxVideoPerformanceAlarmReason {
    BANDWIDTH_FALLBACKED(0),
    BANDWIDTH_RESUMED(1),
    PERFORMANCE_FALLBACKED(2),
    PERFORMANCE_RESUMED(3);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.video.LyraxVideoPerformanceAlarmReason$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$video$LyraxVideoPerformanceAlarmReason;

        static {
            int[] iArr = new int[LyraxVideoPerformanceAlarmReason.values().length];
            $SwitchMap$com$ss$lyrax$video$LyraxVideoPerformanceAlarmReason = iArr;
            try {
                iArr[LyraxVideoPerformanceAlarmReason.BANDWIDTH_FALLBACKED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoPerformanceAlarmReason[LyraxVideoPerformanceAlarmReason.BANDWIDTH_RESUMED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoPerformanceAlarmReason[LyraxVideoPerformanceAlarmReason.PERFORMANCE_FALLBACKED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoPerformanceAlarmReason[LyraxVideoPerformanceAlarmReason.PERFORMANCE_RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$video$LyraxVideoPerformanceAlarmReason[ordinal()];
        return i != 2 ? i != 3 ? i != 4 ? "kBandwidthFallbacked" : "kPerformanceResumed" : "kPerformanceFallbacked" : "kBandwidthResumed";
    }

    public int value() {
        return this.value;
    }

    public static LyraxVideoPerformanceAlarmReason fromId(int i) {
        for (LyraxVideoPerformanceAlarmReason lyraxVideoPerformanceAlarmReason : values()) {
            if (lyraxVideoPerformanceAlarmReason.value() == i) {
                return lyraxVideoPerformanceAlarmReason;
            }
        }
        return BANDWIDTH_FALLBACKED;
    }

    public static LyraxVideoPerformanceAlarmReason valueOf(String str) {
        return (LyraxVideoPerformanceAlarmReason) C08FF.LIZ(LyraxVideoPerformanceAlarmReason.class, str);
    }

    LyraxVideoPerformanceAlarmReason(int i) {
        this.value = i;
    }
}
