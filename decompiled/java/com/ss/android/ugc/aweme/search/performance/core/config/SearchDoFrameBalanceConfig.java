package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDoFrameBalanceConfig {

    @C09CT("max_threshold")
    public final int maxThreshold;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    public SearchDoFrameBalanceConfig() {
        this(0, "");
    }

    public SearchDoFrameBalanceConfig(int i, String str) {
        this.maxThreshold = i;
        this.scene = str;
    }
}
