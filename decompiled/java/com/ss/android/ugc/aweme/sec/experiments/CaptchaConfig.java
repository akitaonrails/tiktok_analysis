package com.ss.android.ugc.aweme.sec.experiments;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class CaptchaConfig {

    @C09CT("enable_gecko")
    public final boolean enableGecko;

    @C09CT("gecko_resource_url")
    public final String geckoResourceUrl;

    @C09CT("spark_view")
    public final boolean sparkView;

    @C09CT("use_spark")
    public final boolean useSpark;

    public CaptchaConfig() {
        this(false, "", true, false);
    }

    public CaptchaConfig(boolean z, String str, boolean z2, boolean z3) {
        this.enableGecko = z;
        this.geckoResourceUrl = str;
        this.useSpark = z2;
        this.sparkView = z3;
    }
}
