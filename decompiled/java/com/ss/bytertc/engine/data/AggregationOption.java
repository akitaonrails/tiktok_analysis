package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes3.dex */
public enum AggregationOption {
    MIN(0),
    MAX(1),
    MAJORITY(2);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        return this == MIN ? "AggregationOptionMin" : this == MAX ? "AggregationOptionMax" : this == MAJORITY ? "AggregationOptionMajority" : "AggregationOptionMin";
    }

    public int value() {
        return this.value;
    }

    public static AggregationOption valueOf(String str) {
        return (AggregationOption) C08FF.LIZ(AggregationOption.class, str);
    }

    AggregationOption(int i) {
        this.value = i;
    }
}
