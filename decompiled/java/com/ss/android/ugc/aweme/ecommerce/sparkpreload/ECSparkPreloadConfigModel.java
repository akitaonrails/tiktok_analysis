package com.ss.android.ugc.aweme.ecommerce.sparkpreload;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class ECSparkPreloadConfigModel {

    @C09CT("clean_when_low_memory")
    public final boolean cleanWhenLowMemory;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("preload_config_list")
    public final List<ECSparkPreloadConfigItem> preloadConfig;

    public ECSparkPreloadConfigModel() {
        this(false, null, false);
    }

    public ECSparkPreloadConfigModel(boolean z, List<ECSparkPreloadConfigItem> list, boolean z2) {
        this.enable = z;
        this.preloadConfig = list;
        this.cleanWhenLowMemory = z2;
    }
}
