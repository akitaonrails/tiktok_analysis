package com.ss.android.ugc.aweme.minis.ads;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisIaaConfigModel {

    @C09CT("interstitial_ads_close_cool_seconds")
    public final int interstitialAdsCloseCoolSeconds;

    @C09CT("interstitial_ads_close_count_limit")
    public final int interstitialAdsCloseCountLimit;

    @C09CT("interstitial_ads_close_total_limits")
    public final int interstitialAdsCloseTotalLimits;

    public MinisIaaConfigModel() {
        this(30, 1, 10);
    }

    public MinisIaaConfigModel(int i, int i2, int i3) {
        this.interstitialAdsCloseCoolSeconds = i;
        this.interstitialAdsCloseCountLimit = i2;
        this.interstitialAdsCloseTotalLimits = i3;
    }
}
