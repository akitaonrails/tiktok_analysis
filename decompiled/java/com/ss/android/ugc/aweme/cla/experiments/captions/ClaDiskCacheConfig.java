package com.ss.android.ugc.aweme.cla.experiments.captions;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: loaded from: classes32.dex */
public final class ClaDiskCacheConfig {

    @C09CT("force_clean")
    public final boolean forceClean;

    @C09CT("max_disk_cache_size")
    public final int maxDiskCacheSize;

    public ClaDiskCacheConfig() {
        this(false, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
    }

    public ClaDiskCacheConfig(boolean z, int i) {
        this.forceClean = z;
        this.maxDiskCacheSize = i;
    }
}
