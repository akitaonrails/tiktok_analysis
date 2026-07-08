package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LocalProxyState {
    INITED(0),
    CONNECTED(1),
    ERROR(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static LocalProxyState fromId(int i) {
        for (LocalProxyState localProxyState : values()) {
            if (localProxyState.value() == i) {
                return localProxyState;
            }
        }
        return null;
    }

    public static LocalProxyState valueOf(String str) {
        return (LocalProxyState) C08FF.LIZ(LocalProxyState.class, str);
    }

    LocalProxyState(int i) {
        this.value = i;
    }
}
