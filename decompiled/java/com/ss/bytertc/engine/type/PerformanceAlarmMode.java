package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum PerformanceAlarmMode {
    NORMAL(0),
    SIMULCAST(1);

    public int value;

    public static PerformanceAlarmMode valueOf(String str) {
        return (PerformanceAlarmMode) C08FF.LIZ(PerformanceAlarmMode.class, str);
    }

    PerformanceAlarmMode(int i) {
        this.value = i;
    }
}
