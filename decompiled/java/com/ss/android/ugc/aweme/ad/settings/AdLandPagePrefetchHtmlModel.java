package com.ss.android.ugc.aweme.ad.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLandPagePrefetchHtmlModel {

    @C09CT("enable_clear_prefetch_html")
    public final boolean enableClearPrefetchHtml;

    @C09CT("enable_iab_resource_intercept_speed")
    public final boolean enableIabResourceInterceptSpeed;

    @C09CT("enable_prefetch_html")
    public final boolean enablePrefetchHtml;

    @C09CT("redirect_optimize")
    public final boolean redirectOptimize;

    @C09CT("support_redirect")
    public final boolean supportRedirect;

    public AdLandPagePrefetchHtmlModel() {
        this(false, true, true, false, false);
    }

    public AdLandPagePrefetchHtmlModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.enablePrefetchHtml = z;
        this.enableClearPrefetchHtml = z2;
        this.enableIabResourceInterceptSpeed = z3;
        this.supportRedirect = z4;
        this.redirectOptimize = z5;
    }
}
