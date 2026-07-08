package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class AdSettingsModel implements Serializable {

    @C09CT("ads_only_switch")
    public final boolean adsOnlySwitch;

    @C09CT("spark_ads")
    public final SparkAdsModel sparkAds;

    public final boolean getAdsOnlySwitch() {
        return this.adsOnlySwitch;
    }

    public final SparkAdsModel getSparkAds() {
        return this.sparkAds;
    }
}
