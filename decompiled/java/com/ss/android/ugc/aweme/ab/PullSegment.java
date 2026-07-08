package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class PullSegment {

    @C09CT("config")
    public final PullConfig config;

    @C09CT("range")
    public final Range range;

    public PullSegment(Range range, PullConfig pullConfig) {
        this.range = range;
        this.config = pullConfig;
    }
}
