package com.ss.android.ugc.aweme.ad.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class AdLandPageTTWebConfigModel {

    @C09CT("disable_preload_document")
    public final boolean disableDoc;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_gecko_preload")
    public final boolean enableGeckoPreload;

    @C09CT("enable_preconnect")
    public final boolean enablePreconnect;

    @C09CT("enable_prefetch")
    public final boolean enablePrefetch;

    @C09CT("libra_name")
    public final String libraName;

    @C09CT("enable_sec_ch_header")
    public final boolean secChHeaderEnable;

    @C09CT("preload_stay_time")
    public final long stayTimeMs;

    public AdLandPageTTWebConfigModel() {
        this(false, false, false, true, "default", false, 30000L, true);
    }

    public AdLandPageTTWebConfigModel(boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, long j, boolean z6) {
        this.enable = z;
        this.enablePreconnect = z2;
        this.enablePrefetch = z3;
        this.secChHeaderEnable = z4;
        this.libraName = str;
        this.enableGeckoPreload = z5;
        this.stayTimeMs = j;
        this.disableDoc = z6;
    }
}
