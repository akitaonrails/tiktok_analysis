package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes4.dex */
public enum RemoteUserPriority {
    REMOTE_USER_PRIORITY_LOW(0),
    REMOTE_USER_PRIORITY_MEDIUM(100),
    REMOTE_USER_PRIORITY_HIGH(200);

    public int value;

    public int value() {
        return this.value;
    }

    public static RemoteUserPriority valueOf(String str) {
        return (RemoteUserPriority) C08FF.LIZ(RemoteUserPriority.class, str);
    }

    RemoteUserPriority(int i) {
        this.value = i;
    }
}
