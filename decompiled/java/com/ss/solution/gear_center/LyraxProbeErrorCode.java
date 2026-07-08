package com.ss.solution.gear_center;

import X.C08FF;

/* JADX INFO: loaded from: classes36.dex */
public enum LyraxProbeErrorCode {
    Default(-1),
    StartSuccess(0),
    ProbeDisabled(100),
    InitFailed(101),
    StartOptionInvalid(102),
    ProbeUrlEmpty(103),
    ProbeParamInvalid(104),
    NetworkNotReachable(105),
    ProbeRunning(106),
    MemoryCacheValid(107),
    HasAcquiredFinalResult(108);

    public static final Companion Companion = new Object() { // from class: com.ss.solution.gear_center.LyraxProbeErrorCode.Companion
        public final LyraxProbeErrorCode fromValue(int i) {
            for (LyraxProbeErrorCode lyraxProbeErrorCode : LyraxProbeErrorCode.values()) {
                if (lyraxProbeErrorCode.getValue() == i) {
                    return lyraxProbeErrorCode;
                }
            }
            return LyraxProbeErrorCode.Default;
        }
    };
    public final int value;

    public static LyraxProbeErrorCode valueOf(String str) {
        return (LyraxProbeErrorCode) C08FF.LIZ(LyraxProbeErrorCode.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    LyraxProbeErrorCode(int i) {
        this.value = i;
    }
}
