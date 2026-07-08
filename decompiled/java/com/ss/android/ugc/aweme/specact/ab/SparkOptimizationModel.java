package com.ss.android.ugc.aweme.specact.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class SparkOptimizationModel {

    @C09CT("sparkPreload")
    public final SparkPreloadModel sparkPreloadModel;

    @C09CT("sparkReUse")
    public final SparkReUseModel sparkReUseModel;

    public SparkOptimizationModel(SparkPreloadModel sparkPreloadModel, SparkReUseModel sparkReUseModel) {
        this.sparkPreloadModel = sparkPreloadModel;
        this.sparkReUseModel = sparkReUseModel;
    }
}
