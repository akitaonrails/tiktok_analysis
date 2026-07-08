package com.ss.android.ugc.aweme.ad.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class CoinCloseCommerceModel {

    @C09CT("enable_ba")
    public final boolean enableBA;

    @C09CT("enable_feed")
    public final boolean enableFeed;

    @C09CT("enable_tcm")
    public final boolean enableTCM;

    @C09CT("enable_topview")
    public final boolean enableTopView;

    public CoinCloseCommerceModel() {
        this(false, false, false, false);
    }

    public CoinCloseCommerceModel(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enableBA = z;
        this.enableFeed = z2;
        this.enableTopView = z3;
        this.enableTCM = z4;
    }
}
