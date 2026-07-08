package com.ss.android.ugc.aweme.ecommerce.ug.prefetch.bean;

import X.C09CT;
import com.google.gson.n;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class NativePrefetchConfig {

    @C09CT("build_rules")
    public final List<n> buildRules;

    @C09CT("channel")
    public final String channel;

    @C09CT("distinct_key")
    public final String distinctKey;

    @C09CT("rules")
    public final n rules;

    public NativePrefetchConfig() {
        this(null, null, null, null);
    }

    public NativePrefetchConfig(String str, String str2, n nVar, List<n> list) {
        this.channel = str;
        this.distinctKey = str2;
        this.rules = nVar;
        this.buildRules = list;
    }
}
