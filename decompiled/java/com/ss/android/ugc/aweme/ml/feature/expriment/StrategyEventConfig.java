package com.ss.android.ugc.aweme.ml.feature.expriment;

import java.util.HashSet;

/* JADX INFO: loaded from: classes24.dex */
public final class StrategyEventConfig {
    public final boolean open;
    public final HashSet<String> scenes;

    public StrategyEventConfig() {
        this(false, new HashSet());
    }

    public StrategyEventConfig(boolean z, HashSet<String> hashSet) {
        this.open = z;
        this.scenes = hashSet;
    }
}
