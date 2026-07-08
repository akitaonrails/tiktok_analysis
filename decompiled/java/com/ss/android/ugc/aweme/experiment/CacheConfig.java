package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class CacheConfig {

    @C09CT("active_time")
    public final Long activeTime;

    @C09CT("feature_name")
    public final String featureName;

    @C09CT("param_keys")
    public final List<String> paramKeys;

    public CacheConfig() {
        this(null, null, null);
    }

    public CacheConfig(String str, List<String> list, Long l) {
        this.featureName = str;
        this.paramKeys = list;
        this.activeTime = l;
    }
}
