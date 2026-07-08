package com.ss.android.ugc.aweme.search.visualsearch.config;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class VisualSearchBitmapForRequestCompressConfig {

    @C09CT("min_edge_size")
    public final int minEdgeSize;

    @C09CT("quality_percentage")
    public final int qualityPercentage;

    public VisualSearchBitmapForRequestCompressConfig() {
        this(400, 60);
    }

    public VisualSearchBitmapForRequestCompressConfig(int i, int i2) {
        this.minEdgeSize = i;
        this.qualityPercentage = i2;
    }
}
