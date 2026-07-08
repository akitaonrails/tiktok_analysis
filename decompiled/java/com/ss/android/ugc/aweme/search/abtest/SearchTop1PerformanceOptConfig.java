package com.ss.android.ugc.aweme.search.abtest;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTop1PerformanceOptConfig {

    @C09CT("opt_class_pre_load")
    public final boolean optClassPreLoad;

    @C09CT("opt_class_pre_load_remain")
    public final boolean optClassPreLoadRemain;

    @C09CT("opt_xml_pre_inflate")
    public final boolean optXmlPreInflate;

    public SearchTop1PerformanceOptConfig() {
        this(false, false, false);
    }

    public SearchTop1PerformanceOptConfig(boolean z, boolean z2, boolean z3) {
        this.optXmlPreInflate = z;
        this.optClassPreLoad = z2;
        this.optClassPreLoadRemain = z3;
    }
}
