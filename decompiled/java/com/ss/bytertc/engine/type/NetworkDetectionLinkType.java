package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes10.dex */
public enum NetworkDetectionLinkType {
    UP(0),
    DOWN(1);

    public int value;

    public int value() {
        return this.value;
    }

    public static NetworkDetectionLinkType fromId(int i) {
        for (NetworkDetectionLinkType networkDetectionLinkType : values()) {
            if (networkDetectionLinkType.value() == i) {
                return networkDetectionLinkType;
            }
        }
        return UP;
    }

    public static NetworkDetectionLinkType valueOf(String str) {
        return (NetworkDetectionLinkType) C08FF.LIZ(NetworkDetectionLinkType.class, str);
    }

    NetworkDetectionLinkType(int i) {
        this.value = i;
    }
}
