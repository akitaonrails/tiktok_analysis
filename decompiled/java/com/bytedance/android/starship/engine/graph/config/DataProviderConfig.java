package com.bytedance.android.starship.engine.graph.config;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class DataProviderConfig {

    @C09CT("keys")
    public final List<String> keys;

    @C09CT("provider")
    public final String provider;

    public DataProviderConfig() {
        this(null, null);
    }

    public DataProviderConfig(String str, List<String> list) {
        this.provider = str;
        this.keys = list;
    }
}
