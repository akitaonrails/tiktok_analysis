package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes4.dex */
public enum LocalProxyType {
    SOCKS5(1),
    HTTP_TUNNEL(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static LocalProxyType fromId(int i) {
        for (LocalProxyType localProxyType : values()) {
            if (localProxyType.value() == i) {
                return localProxyType;
            }
        }
        return null;
    }

    public static LocalProxyType valueOf(String str) {
        return (LocalProxyType) C08FF.LIZ(LocalProxyType.class, str);
    }

    LocalProxyType(int i) {
        this.value = i;
    }
}
