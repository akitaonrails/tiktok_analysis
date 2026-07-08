package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class TakoPerfFirstSugPreloadConfig {

    @C09CT("feed")
    public final TakoPerfFirstSugPreloadConfigTime feed;

    @C09CT("inbox")
    public final TakoPerfFirstSugPreloadConfigTime inbox;

    public TakoPerfFirstSugPreloadConfig() {
        this(new TakoPerfFirstSugPreloadConfigTime(-1), new TakoPerfFirstSugPreloadConfigTime(-1));
    }

    public TakoPerfFirstSugPreloadConfig(TakoPerfFirstSugPreloadConfigTime takoPerfFirstSugPreloadConfigTime, TakoPerfFirstSugPreloadConfigTime takoPerfFirstSugPreloadConfigTime2) {
        this.feed = takoPerfFirstSugPreloadConfigTime;
        this.inbox = takoPerfFirstSugPreloadConfigTime2;
    }
}
