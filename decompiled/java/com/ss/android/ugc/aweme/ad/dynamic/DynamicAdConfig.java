package com.ss.android.ugc.aweme.ad.dynamic;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class DynamicAdConfig {
    public static final int $stable = 8;

    @C09CT("lynx_view_release_gap")
    public int lynxViewReleaseGap = 8;

    @C09CT("lynx_view_pre_render_gap")
    public int lynxViewPreRenderGap = 6;

    public final int getLynxViewPreRenderGap() {
        return this.lynxViewPreRenderGap;
    }

    public final int getLynxViewReleaseGap() {
        return this.lynxViewReleaseGap;
    }

    public final void setLynxViewPreRenderGap(int i) {
        this.lynxViewPreRenderGap = i;
    }

    public final void setLynxViewReleaseGap(int i) {
        this.lynxViewReleaseGap = i;
    }
}
