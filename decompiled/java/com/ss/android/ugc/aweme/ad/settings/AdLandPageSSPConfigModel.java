package com.ss.android.ugc.aweme.ad.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLandPageSSPConfigModel {

    @C09CT("enable_consume_ssp_data")
    public final boolean enableConsumeSSPData;

    @C09CT("libra_name")
    public final String libraName;

    @C09CT("optimization_type")
    public final int optimizationType;

    @C09CT("preconnect_importance")
    public final int preconnectImportance;

    @C09CT("prefetch_max_count")
    public final int prefetchMaxCount;

    @C09CT("source")
    public final int source;

    public AdLandPageSSPConfigModel() {
        this(0, 90, 2, 30, true, "default");
    }

    public AdLandPageSSPConfigModel(int i, int i2, int i3, int i4, boolean z, String str) {
        this.source = i;
        this.preconnectImportance = i2;
        this.optimizationType = i3;
        this.prefetchMaxCount = i4;
        this.enableConsumeSSPData = z;
        this.libraName = str;
    }
}
