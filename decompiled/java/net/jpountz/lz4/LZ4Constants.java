package net.jpountz.lz4;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum LZ4Constants {
    ;

    public static final int SKIP_STRENGTH = Math.max(6, 2);

    public static LZ4Constants valueOf(String str) {
        return (LZ4Constants) C08FF.LIZ(LZ4Constants.class, str);
    }
}
