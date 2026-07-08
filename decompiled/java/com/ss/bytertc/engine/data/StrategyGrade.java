package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes10.dex */
public enum StrategyGrade {
    STRATEGY_GRADE_HIGH(0),
    STRATEGY_GRADE_MIDDLE(1),
    STRATEGY_GRADE_LOW(2);

    public final int value;

    public int value() {
        return this.value;
    }

    public static StrategyGrade valueOf(String str) {
        return (StrategyGrade) C08FF.LIZ(StrategyGrade.class, str);
    }

    StrategyGrade(int i) {
        this.value = i;
    }
}
