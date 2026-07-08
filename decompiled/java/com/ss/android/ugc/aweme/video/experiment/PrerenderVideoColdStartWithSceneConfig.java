package com.ss.android.ugc.aweme.video.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class PrerenderVideoColdStartWithSceneConfig {

    @C09CT("enable_scene_config")
    public final boolean enableSceneConfig;

    @C09CT("soft_decode_cold_start")
    public final boolean softDecodeColdStart;

    @C09CT("soft_decode_top_view")
    public final boolean softDecodeTopView;

    public PrerenderVideoColdStartWithSceneConfig() {
        this(false, false, false);
    }

    public PrerenderVideoColdStartWithSceneConfig(boolean z, boolean z2, boolean z3) {
        this.enableSceneConfig = z;
        this.softDecodeColdStart = z2;
        this.softDecodeTopView = z3;
    }
}
