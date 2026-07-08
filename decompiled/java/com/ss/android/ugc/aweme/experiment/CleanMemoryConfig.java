package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes26.dex */
public final class CleanMemoryConfig {

    @C09CT("is_open")
    public final boolean isOpen;

    @C09CT("threshold_config")
    public Map<String, Integer> thresholds;

    public CleanMemoryConfig() {
        this(false, null);
    }

    public CleanMemoryConfig(boolean z, Map<String, Integer> map) {
        this.isOpen = z;
        this.thresholds = map;
    }
}
