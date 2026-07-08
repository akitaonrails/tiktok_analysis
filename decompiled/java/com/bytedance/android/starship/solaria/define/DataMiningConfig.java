package com.bytedance.android.starship.solaria.define;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class DataMiningConfig implements Serializable {

    @C09CT("configs")
    public final Map<String, List<String>> configs;

    @C09CT("version")
    public final String version;

    public DataMiningConfig() {
        this(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DataMiningConfig(Map<String, ? extends List<String>> map, String str) {
        this.configs = map;
        this.version = str;
    }
}
