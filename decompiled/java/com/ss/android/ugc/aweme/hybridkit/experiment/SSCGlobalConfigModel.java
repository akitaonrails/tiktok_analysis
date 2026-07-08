package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class SSCGlobalConfigModel {

    @C09CT("geckong_from_ratio_threshold")
    public final double geckoFromRatioThreshold;

    @C09CT("geckong_to_ratio_threshold")
    public final double geckoToRatioThreshold;

    public SSCGlobalConfigModel() {
        this(0.0d, 0.0d);
    }

    public SSCGlobalConfigModel(double d, double d2) {
        this.geckoFromRatioThreshold = d;
        this.geckoToRatioThreshold = d2;
    }
}
