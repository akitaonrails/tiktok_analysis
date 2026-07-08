package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class TabTooltipStorageConfig {

    @C09CT("max_shown_model_count_per_tooltip")
    public final int maxShownModelCountPerTooltip;

    public TabTooltipStorageConfig() {
        this(200);
    }

    public TabTooltipStorageConfig(int i) {
        this.maxShownModelCountPerTooltip = i;
    }
}
