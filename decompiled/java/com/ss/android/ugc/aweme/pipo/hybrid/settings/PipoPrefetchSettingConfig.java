package com.ss.android.ugc.aweme.pipo.hybrid.settings;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoPrefetchSettingConfig {

    @C09CT("configs")
    public final Map<String, PipoPrefetchBundleConfig> configs;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("timeout")
    public final Long timeout;

    public PipoPrefetchSettingConfig() {
        this(true, null, null);
    }

    public PipoPrefetchSettingConfig(boolean z, Map<String, PipoPrefetchBundleConfig> map, Long l) {
        this.enable = z;
        this.configs = map;
        this.timeout = l;
    }
}
