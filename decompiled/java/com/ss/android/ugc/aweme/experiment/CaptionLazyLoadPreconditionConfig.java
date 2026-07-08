package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class CaptionLazyLoadPreconditionConfig {

    @C09CT("first_pts_end_ms")
    public final int firstPtsEnd;

    @C09CT("first_pts_start_ms")
    public final int firstPtsStart;

    public CaptionLazyLoadPreconditionConfig() {
        this(0, 0);
    }

    public CaptionLazyLoadPreconditionConfig(int i, int i2) {
        this.firstPtsStart = i;
        this.firstPtsEnd = i2;
    }
}
