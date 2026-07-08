package com.ss.android.ugc.aweme.pipo.hybrid.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoPrefetchBundleConfig {

    @C09CT("ab_key")
    public final String abKey;

    @C09CT("bundle")
    public final String bundle;

    @C09CT("channel")
    public final String channel;

    @C09CT("prefetch_ab")
    public final String prefetchAb;

    public PipoPrefetchBundleConfig() {
        this(null, null, null, null);
    }

    public PipoPrefetchBundleConfig(String str, String str2, String str3, String str4) {
        this.channel = str;
        this.bundle = str2;
        this.prefetchAb = str3;
        this.abKey = str4;
    }
}
