package com.ss.android.ugc.aweme.ml.request.meta;

import X.C09CT;
import com.ss.ugc.clientai.core.api.meta.FeatureSetConfig;

/* JADX INFO: loaded from: classes24.dex */
public final class FeatureSetInfo {

    @C09CT("info")
    public FeatureSetConfig info;

    @C09CT("type")
    public int type;

    public FeatureSetInfo(int i, FeatureSetConfig featureSetConfig) {
        this.type = i;
        this.info = featureSetConfig;
    }
}
