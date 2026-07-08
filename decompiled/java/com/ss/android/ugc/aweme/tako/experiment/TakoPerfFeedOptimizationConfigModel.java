package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class TakoPerfFeedOptimizationConfigModel {

    @C09CT("high")
    public final TakoPerfFeedOptimizationConfigModelWithEnd high;

    @C09CT("low")
    public final TakoPerfFeedOptimizationConfigModelWithEnd low;

    @C09CT("mid")
    public final TakoPerfFeedOptimizationConfigModelWithEnd mid;

    public TakoPerfFeedOptimizationConfigModel() {
        this(new TakoPerfFeedOptimizationConfigModelWithEnd(0L, 3000L, 0L, 15000L, 3000L), new TakoPerfFeedOptimizationConfigModelWithEnd(3000L, 15000L, 0L, 15000L, 3000L), new TakoPerfFeedOptimizationConfigModelWithEnd(3000L, 60000L, 0L, 15000L, 3000L));
    }

    public TakoPerfFeedOptimizationConfigModel(TakoPerfFeedOptimizationConfigModelWithEnd takoPerfFeedOptimizationConfigModelWithEnd, TakoPerfFeedOptimizationConfigModelWithEnd takoPerfFeedOptimizationConfigModelWithEnd2, TakoPerfFeedOptimizationConfigModelWithEnd takoPerfFeedOptimizationConfigModelWithEnd3) {
        this.high = takoPerfFeedOptimizationConfigModelWithEnd;
        this.mid = takoPerfFeedOptimizationConfigModelWithEnd2;
        this.low = takoPerfFeedOptimizationConfigModelWithEnd3;
    }
}
