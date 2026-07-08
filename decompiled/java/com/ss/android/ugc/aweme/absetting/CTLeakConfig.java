package com.ss.android.ugc.aweme.absetting;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class CTLeakConfig {

    @C09CT("leak_opt_creative_tools")
    public final boolean leakOptCreativeTools;

    @C09CT("leak_opt_search")
    public final boolean leakOptSearch;

    public CTLeakConfig() {
        this(false, false);
    }

    public CTLeakConfig(boolean z, boolean z2) {
        this.leakOptCreativeTools = z;
        this.leakOptSearch = z2;
    }
}
