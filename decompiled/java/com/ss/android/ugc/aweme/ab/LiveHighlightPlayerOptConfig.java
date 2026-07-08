package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveHighlightPlayerOptConfig {

    @C09CT("pre_render_opt")
    public final boolean preRenderOpt;

    @C09CT("release_opt")
    public final boolean releaseOpt;

    public LiveHighlightPlayerOptConfig() {
        this(false, false);
    }

    public LiveHighlightPlayerOptConfig(boolean z, boolean z2) {
        this.releaseOpt = z;
        this.preRenderOpt = z2;
    }
}
