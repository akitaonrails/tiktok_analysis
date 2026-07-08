package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum ClientRole {
    CLIENT_ROLE_BROADCASTER,
    CLIENT_ROLE_SILENT_AUDIENCE;

    public static ClientRole valueOf(String str) {
        return (ClientRole) C08FF.LIZ(ClientRole.class, str);
    }
}
