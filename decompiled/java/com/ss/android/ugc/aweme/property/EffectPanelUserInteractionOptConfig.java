package com.ss.android.ugc.aweme.property;

import X.C09CT;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectPanelUserInteractionOptConfig {

    @C09CT("image_pipeline_opt")
    public final boolean imagePipelineOpt;

    @C09CT("image_pipeline_scroll_threshold")
    public final float imagePipelineScrollThreshold;

    @C09CT("recyclerview_cache_opt")
    public final boolean recyclerViewCacheOpt;

    public EffectPanelUserInteractionOptConfig() {
        this(false, 0.0f, false);
    }

    public EffectPanelUserInteractionOptConfig(boolean z, float f, boolean z2) {
        this.imagePipelineOpt = z;
        this.imagePipelineScrollThreshold = f;
        this.recyclerViewCacheOpt = z2;
    }
}
