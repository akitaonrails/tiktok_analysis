package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes4.dex */
public enum BackgroundMode {
    BACKGROUND_A(0),
    BACKGROUND_B(1),
    BLUR(2),
    NONE(3);

    public int value;

    public int value() {
        return this.value;
    }

    public static BackgroundMode valueOf(String str) {
        return (BackgroundMode) C08FF.LIZ(BackgroundMode.class, str);
    }

    BackgroundMode(int i) {
        this.value = i;
    }
}
