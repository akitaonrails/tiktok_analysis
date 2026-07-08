package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum HardwareEchoDetectionResult {
    HARDWARE_ECHO_RESULT_CANCELED(0),
    HARDWARE_ECHO_RESULT_UNKNOWN(1),
    HARDWARE_ECHO_RESULT_NORMAL(2),
    HARDWARE_ECHO_RESULT_POOR(3);

    public final int value;

    public int value() {
        return this.value;
    }

    public static HardwareEchoDetectionResult fromId(int i) {
        for (HardwareEchoDetectionResult hardwareEchoDetectionResult : values()) {
            if (hardwareEchoDetectionResult.value() == i) {
                return hardwareEchoDetectionResult;
            }
        }
        return HARDWARE_ECHO_RESULT_NORMAL;
    }

    public static HardwareEchoDetectionResult valueOf(String str) {
        return (HardwareEchoDetectionResult) C08FF.LIZ(HardwareEchoDetectionResult.class, str);
    }

    HardwareEchoDetectionResult(int i) {
        this.value = i;
    }
}
