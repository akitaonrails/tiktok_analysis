package com.ss.android.ugc.aweme.ad.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class AdHybridForestData {

    @C09CT("enable_1p_landing_page")
    public final boolean enable1pLandingPage;

    @C09CT("enable_ad_format")
    public final boolean enableAdFormat;

    @C09CT("enable_all")
    public final boolean enableAll;

    @C09CT("enable_ba")
    public final boolean enableBA;

    @C09CT("enable_other")
    public final boolean enableOtherScene;

    @C09CT("enable_promote")
    public final boolean enablePromote;

    public AdHybridForestData() {
        this(false, false, false, false, false, false);
    }

    public AdHybridForestData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.enableAdFormat = z;
        this.enable1pLandingPage = z2;
        this.enablePromote = z3;
        this.enableBA = z4;
        this.enableOtherScene = z5;
        this.enableAll = z6;
    }
}
