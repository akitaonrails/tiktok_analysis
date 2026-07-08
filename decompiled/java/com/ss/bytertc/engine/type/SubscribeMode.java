package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum SubscribeMode {
    AUTO_SUBSCRIBE_MODE(0),
    MANUAL_SUBSCRIBE_MODE(1);

    public int value;

    public int value() {
        return this.value;
    }

    public static SubscribeMode valueOf(String str) {
        return (SubscribeMode) C08FF.LIZ(SubscribeMode.class, str);
    }

    SubscribeMode(int i) {
        this.value = i;
    }
}
