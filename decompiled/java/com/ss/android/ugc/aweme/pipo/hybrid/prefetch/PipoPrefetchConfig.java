package com.ss.android.ugc.aweme.pipo.hybrid.prefetch;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoPrefetchConfig {

    @C09CT("channel")
    public final String channel;

    @C09CT("dsl_version")
    public final int dslVersion;

    @C09CT("prefetch_apis")
    public final Map<String, PipoPrefetchApi> prefetchApis;

    @C09CT("rules")
    public final Map<String, PipoPrefetchRule> rules;

    @C09CT("version")
    public final String version;

    public PipoPrefetchConfig() {
        this(null, 0, null, null, null);
    }

    public PipoPrefetchConfig(String str, int i, String str2, Map<String, PipoPrefetchRule> map, Map<String, PipoPrefetchApi> map2) {
        this.version = str;
        this.dslVersion = i;
        this.channel = str2;
        this.rules = map;
        this.prefetchApis = map2;
    }
}
