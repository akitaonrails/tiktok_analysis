package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: loaded from: classes36.dex */
public final class PhotoModeImageBitrateConfig {

    @C09CT("enable_none_init_single")
    public final boolean enableNoneInitSingle;

    @C09CT("enable_refactor")
    public final boolean enableRefactor;

    @C09CT("fallback_index")
    public final int fallbackIndex;

    @C09CT("result_cache_size")
    public final int resultCacheSize;

    @C09CT("t_playback_ms")
    public final int tPlaybackMs;

    @C09CT("t_preload_index_ms")
    public final int tPreloadIndexMs;

    @C09CT("t_preload_ms")
    public final int tPreloadMs;

    @C09CT("use_result_cache")
    public final boolean useResultCache;

    @C09CT("using_ttnet_speed")
    public final boolean usingTTNetSpeed;

    public PhotoModeImageBitrateConfig() {
        this(false, false, 150, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 50, -1, false, 256, false);
    }

    public PhotoModeImageBitrateConfig(boolean z, boolean z2, int i, int i2, int i3, int i4, boolean z3, int i5, boolean z4) {
        this.enableRefactor = z;
        this.usingTTNetSpeed = z2;
        this.tPlaybackMs = i;
        this.tPreloadMs = i2;
        this.tPreloadIndexMs = i3;
        this.fallbackIndex = i4;
        this.useResultCache = z3;
        this.resultCacheSize = i5;
        this.enableNoneInitSingle = z4;
    }
}
