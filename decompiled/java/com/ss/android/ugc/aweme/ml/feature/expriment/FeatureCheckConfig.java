package com.ss.android.ugc.aweme.ml.feature.expriment;

import java.util.HashSet;

/* JADX INFO: loaded from: classes24.dex */
public final class FeatureCheckConfig {
    public final HashSet<String> ignore;
    public final float monitorRate;
    public final boolean open;

    public FeatureCheckConfig() {
        this(false, new HashSet(), 1.0E-5f);
    }

    public FeatureCheckConfig(boolean z, HashSet<String> hashSet, float f) {
        this.open = z;
        this.ignore = hashSet;
        this.monitorRate = f;
    }
}
