package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchVideoPreRenderConfig {

    @C09CT("buffered_percent")
    public final int bufferedPercent;

    @C09CT("enable_pre_render")
    public final boolean enablePreRender;

    @C09CT("enable_pre_render_in_buffered")
    public final boolean enablePreRenderInBuffered;

    @C09CT("enable_pre_render_in_first_frame")
    public final boolean enablePreRenderInFirstFrame;

    public SearchVideoPreRenderConfig() {
        this(false, false, 0, false);
    }

    public SearchVideoPreRenderConfig(boolean z, boolean z2, int i, boolean z3) {
        this.enablePreRender = z;
        this.enablePreRenderInBuffered = z2;
        this.bufferedPercent = i;
        this.enablePreRenderInFirstFrame = z3;
    }
}
