package com.bytedance.hybrid.spark.roma;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class RomaFreezeConfigGlobal {
    public static final RomaFreezeConfigGlobal LIZ = new RomaFreezeConfigGlobal(null, null);

    @C09CT("url")
    public final String url;

    @C09CT("version")
    public final String version;

    public RomaFreezeConfigGlobal() {
        this(null, null);
    }

    public RomaFreezeConfigGlobal(String str, String str2) {
        this.url = str;
        this.version = str2;
    }
}
