package com.bytedance.ies.sdk.widgets.dependence;

import X.C08FF;

/* JADX INFO: loaded from: classes18.dex */
public enum Side {
    LEFT(1),
    RIGHT(2),
    TOP(3),
    BOTTOM(4),
    BASELINE(5),
    START(6),
    END(7);

    public final int value;

    public int getValue() {
        return this.value;
    }

    public static Side valueOf(String str) {
        return (Side) C08FF.LIZ(Side.class, str);
    }

    Side(int i) {
        this.value = i;
    }
}
