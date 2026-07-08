package ttpobfuscated;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum d5 {
    NOT_CREATED,
    CREATED,
    MODIFIED,
    DELETED,
    UNCHANGED;

    public static d5 valueOf(String str) {
        return (d5) C08FF.LIZ(d5.class, str);
    }
}
